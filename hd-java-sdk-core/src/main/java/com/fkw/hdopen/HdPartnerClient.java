package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.DefaultServiceClient;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.TestOperation;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author CAJR
 * @Description 互动合作方客户端
 * @date 2021/7/26 10:21
 */
public class HdPartnerClient implements HdPartner {

    private URI endpoint;
    private final CredentialsProvider credentialsProvider;
    private final ServiceClient serviceClient;
    private TestOperation testOperation;

    public HdPartnerClient(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        this.credentialsProvider = credentialsProvider;
        configuration = configuration == null ? new ClientConfiguration() : configuration;
        this.serviceClient = new DefaultServiceClient(configuration);
        this.initOperations();
        this.setEndpoint(configuration.getHdResourceDomain());
    }

    private void initOperations() {
        this.testOperation = new TestOperation(serviceClient, credentialsProvider);
    }

    public synchronized URI getEndpoint() {
        return URI.create(this.endpoint.toString());
    }

    public synchronized void setEndpoint(String endpoint) {
        this.endpoint = this.toURI(endpoint);
        this.testOperation.setEndpoint(this.endpoint);
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

    @Override
    public String test() {
        return testOperation.test();
    }

    @Override
    public Result<String> test1() {
        return testOperation.test1();
    }
}
