package com.fkw.hdopen.model.request;

/**
 * @author CAJR
 * @version 1.0.0
 */
public class CallHdOemAcctBindApiVO {

    /**
     * 被绑定的partnerId
     */
    private String partnerId;
    /**
     * 分销账户名称
     */
    private String oemCompanyAcct;

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getOemCompanyAcct() {
        return oemCompanyAcct;
    }

    public void setOemCompanyAcct(String oemCompanyAcct) {
        this.oemCompanyAcct = oemCompanyAcct;
    }
}
