package com.fkw.hdopen;

import com.fkw.hdopen.comm.Protocol;
import com.fkw.hdopen.comm.ResourceUris;
import okhttp3.Authenticator;

import java.util.concurrent.TimeUnit;

/**
 * @author CAJR
 * @Description 客户端配置
 * @date 2021/7/26 10:42
 */
public class ClientConfiguration {
    public static final String DEFAULT_CLIENT_AUTH_CNAME = "172.17.8.21:51940";
    public static final String DEFAULT_RESOURCE_CNAME = "172.17.8.21:51941";
    public static final String DEFAULT_AUTH_SCOPE = "all";
    public static final TimeUnit DEFAULT_TIME_UNIT = TimeUnit.MILLISECONDS;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_CONNECTION_REQUEST_TIMEOUT = -1;
    public static final int DEFAULT_CONNECTION_TIMEOUT = 50000;
    public static final int DEFAULT_READ_TIMEOUT = 10000;
    public static final int DEFAULT_WRITE_TIMEOUT = 10000;
    public static final int DEFAULT_SOCKET_TIMEOUT = 50000;
    public static final int DEFAULT_MAX_CONNECTIONS = 1024;
    public static final long DEFAULT_IDLE_CONNECTION_TIME = 60000L;
    public static final int DEFAULT_REQUEST_TIMEOUT = 300000;
    public static final long DEFAULT_SLOW_REQUESTS_THRESHOLD = 300000L;

    /**
     * 客户端授权域名
     */
    protected String clientAuthCname;
    /**
     * 凡科互动资源域名
     */
    protected String hdResourceCname;
    /**
     * 授权范围值
     */
    protected String authScope;
    /**
     * 时间类型
     */
    protected TimeUnit timeUnit;
    /**
     * 网络协议
     */
    protected Protocol protocol;
    /**
     * 最多几次错误重试
     */
    protected int maxErrorRetry;
    /**
     * 是否连接重试
     */
    protected boolean retryOnConnectionFailure;
    /**
     * 连接request超时
     */
    protected int connectionRequestTimeout;
    /**
     * 连接超时时长
     */
    protected int connectionTimeout;
    /**
     * 读超时时长
     */
    protected int readTimeout;
    /**
     * 写超时时长
     */
    protected int writeTimeout;
    /**
     * 套接字连接超时时长
     */
    protected int socketTimeout;
    /**
     * 最大连接数
     */
    protected int maxConnections;
    /**
     * 空闲连接时长
     */
    protected long idleConnectionTime;
    /**
     * 代理host
     */
    protected String proxyHost;
    /**
     * 代理端口
     */
    protected int proxyPort;
    /**
     * 代理服务器的授权验证
     */
    protected Authenticator authenticator;
    /**
     * 请求超时时长
     */
    protected int requestTimeout;
    /**
     * 是否开启请求超时
     */
    protected boolean requestTimeoutEnabled;
    /**
     * 慢请求阈值
     */
    protected long slowRequestsThreshold;
    /**
     * 是否开启循环冗余校验, 主要用来检测或校验数据传输或者保存后可能出现的错误
     */
    protected boolean crcCheckEnabled;

    public ClientConfiguration() {
        this.clientAuthCname = DEFAULT_CLIENT_AUTH_CNAME;
        this.hdResourceCname = DEFAULT_RESOURCE_CNAME;
        this.authScope = DEFAULT_AUTH_SCOPE;
        this.retryOnConnectionFailure = true;
        this.timeUnit = DEFAULT_TIME_UNIT;
        this.maxErrorRetry = DEFAULT_MAX_RETRIES;
        this.connectionRequestTimeout = DEFAULT_CONNECTION_REQUEST_TIMEOUT;
        this.connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;
        this.readTimeout = DEFAULT_READ_TIMEOUT;
        this.writeTimeout = DEFAULT_WRITE_TIMEOUT;
        this.socketTimeout = DEFAULT_SOCKET_TIMEOUT;
        this.maxConnections = DEFAULT_MAX_CONNECTIONS;
        this.idleConnectionTime = DEFAULT_IDLE_CONNECTION_TIME;
        this.protocol = Protocol.HTTP;
        this.requestTimeout = DEFAULT_REQUEST_TIMEOUT;
        this.requestTimeoutEnabled = false;
        this.slowRequestsThreshold = DEFAULT_SLOW_REQUESTS_THRESHOLD;
        this.crcCheckEnabled = true;
        this.proxyHost = null;
        this.proxyPort = -1;
        this.authenticator = null;
    }

    public String getClientAuthCname() {
        return clientAuthCname;
    }

    public void setClientAuthCname(String clientAuthCname) {
        this.clientAuthCname = clientAuthCname;
    }

    public String getHdResourceCname() {
        return hdResourceCname;
    }

    public String getHdResourceDomain() {
        return this.protocol.toString() + "://" + hdResourceCname + ResourceUris.BASE_CONTEXT_PREFIX_URI.getUri();
    }

    public void setHdResourceCname(String hdResourceCname) {
        this.hdResourceCname = hdResourceCname;
    }

    public String getAuthScope() {
        return authScope;
    }

    public void setAuthScope(String authScope) {
        this.authScope = authScope;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public boolean isRetryOnConnectionFailure() {
        return retryOnConnectionFailure;
    }

    public void setRetryOnConnectionFailure(boolean retryOnConnectionFailure) {
        this.retryOnConnectionFailure = retryOnConnectionFailure;
    }

    public int getMaxErrorRetry() {
        return maxErrorRetry;
    }

    public void setMaxErrorRetry(int maxErrorRetry) {
        this.maxErrorRetry = maxErrorRetry;
    }

    public int getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    public void setConnectionRequestTimeout(int connectionRequestTimeout) {
        this.connectionRequestTimeout = connectionRequestTimeout;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public int getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public long getIdleConnectionTime() {
        return idleConnectionTime;
    }

    public void setIdleConnectionTime(long idleConnectionTime) {
        this.idleConnectionTime = idleConnectionTime;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Authenticator getAuthenticator() {
        return authenticator;
    }

    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public int getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public boolean isRequestTimeoutEnabled() {
        return requestTimeoutEnabled;
    }

    public void setRequestTimeoutEnabled(boolean requestTimeoutEnabled) {
        this.requestTimeoutEnabled = requestTimeoutEnabled;
    }

    public long getSlowRequestsThreshold() {
        return slowRequestsThreshold;
    }

    public void setSlowRequestsThreshold(long slowRequestsThreshold) {
        this.slowRequestsThreshold = slowRequestsThreshold;
    }

    public boolean isCrcCheckEnabled() {
        return crcCheckEnabled;
    }

    public void setCrcCheckEnabled(boolean crcCheckEnabled) {
        this.crcCheckEnabled = crcCheckEnabled;
    }
}
