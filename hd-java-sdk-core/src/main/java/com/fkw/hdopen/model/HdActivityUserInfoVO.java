package com.fkw.hdopen.model;

/**
 * @author CAJR
 * @Description TODO
 * @date 2021/9/10 14:07
 */
public class HdActivityUserInfoVO {

    /**
     * 头像
     */
    private String headImg;

    /**
     * ip地址
     */
    private String ip;

    /**
     * ip地址
     */
    private String ipProvince;

    /**
     * ip 所在城市
     */
    private String ipCity;

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpProvince() {
        return ipProvince;
    }

    public void setIpProvince(String ipProvince) {
        this.ipProvince = ipProvince;
    }

    public String getIpCity() {
        return ipCity;
    }

    public void setIpCity(String ipCity) {
        this.ipCity = ipCity;
    }
}
