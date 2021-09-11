package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.DefaultServiceClient;
import com.fkw.hdopen.client.ServiceClient;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author CAJR
 * @Description 互动合作方客户端
 * @date 2021/7/26 10:21
 */
public abstract class HdPartnerClient implements HdPartner {

    private URI endpoint;
    protected final CredentialsProvider credentialsProvider;
    protected final ServiceClient serviceClient;

    public HdPartnerClient(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        this.credentialsProvider = credentialsProvider;
        configuration = configuration == null ? new ClientConfiguration() : configuration;
        this.serviceClient = new DefaultServiceClient(configuration);
        this.setEndpoint(configuration.getHdResourceDomain());
        this.initOperations();
    }

    public synchronized URI getEndpoint() {
        return URI.create(this.endpoint.toString());
    }

    public synchronized void setEndpoint(String endpoint) {
        this.endpoint = this.toURI(endpoint);
    }

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public ServiceClient getServiceClient() {
        return serviceClient;
    }

    private URI toURI(String endpoint) throws IllegalArgumentException {
        if (!endpoint.contains("://")) {
            ClientConfiguration conf = this.serviceClient.getConfiguration();
            endpoint = conf.getProtocol().toString() + "://" + endpoint;
        }
        try {
            return new URI(endpoint);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
