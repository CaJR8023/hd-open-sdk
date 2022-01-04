package com.fkw.hdopen.model;

public class HdOpenOrderVO {
    /**
     * 商品订单号
     */
    private String id;

    /**
     * 商户订单号
     */
    private String mchBillNo;

    /**
     * 用户名
     */
    private String playerName;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 提交时间/创建时间
     */
    private Long createTime;

    /**
     * 总金额
     */
    private Double total;

    /**
     * 卡卷状态
     */
    private Integer consumeStatus;

    /**
     * 卡卷状态名称
     */
    private String consumeStatusName;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 订单状态名称
     */
    private String statusName;

    /**
     * 配送方式
     */
    private String deliveryCategoryName;

    /**
     * 配送状态
     */
    private Integer shipmentStatus;

    /**
     * 配送状态名称
     */
    private String shipmentStatusName;

    /**
     * 收件人/取货人
     */
    private String username;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 买家留言
     */
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMchBillNo() {
        return mchBillNo;
    }

    public void setMchBillNo(String mchBillNo) {
        this.mchBillNo = mchBillNo;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getConsumeStatus() {
        return consumeStatus;
    }

    public void setConsumeStatus(Integer consumeStatus) {
        this.consumeStatus = consumeStatus;
    }

    public String getConsumeStatusName() {
        return consumeStatusName;
    }

    public void setConsumeStatusName(String consumeStatusName) {
        this.consumeStatusName = consumeStatusName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getDeliveryCategoryName() {
        return deliveryCategoryName;
    }

    public void setDeliveryCategoryName(String deliveryCategoryName) {
        this.deliveryCategoryName = deliveryCategoryName;
    }

    public Integer getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(Integer shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getShipmentStatusName() {
        return shipmentStatusName;
    }

    public void setShipmentStatusName(String shipmentStatusName) {
        this.shipmentStatusName = shipmentStatusName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
