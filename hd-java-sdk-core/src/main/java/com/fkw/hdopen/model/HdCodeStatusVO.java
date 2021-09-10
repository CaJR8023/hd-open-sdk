package com.fkw.hdopen.model;

/**
 * @author CAJR
 * @Description 兑奖码状态记录VO
 * @date 2021/9/10 17:32
 */
public class HdCodeStatusVO {

    private Integer aid;

    /**
     * 兑奖码
     */
    private String code;

    /**
     * 兑奖码是否被使用
     */
    private String used;

    /**
     * 兑奖码状态
     */
    private Integer codeStatus;

    /**
     * 奖品等级
     */
    private Integer level;

    /**
     * 核销时间
     */
    private Long consumeTime;

    /**
     * 核销类型
     */
    private Integer consumeType;

    /**
     * 中奖玩家id
     */
    private Integer winActivityUserId;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 中奖时间
     */
    private Long winAwardTime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public Integer getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(Integer codeStatus) {
        this.codeStatus = codeStatus;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Long consumeTime) {
        this.consumeTime = consumeTime;
    }

    public Integer getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(Integer consumeType) {
        this.consumeType = consumeType;
    }

    public Integer getWinActivityUserId() {
        return winActivityUserId;
    }

    public void setWinActivityUserId(Integer winActivityUserId) {
        this.winActivityUserId = winActivityUserId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Long getWinAwardTime() {
        return winAwardTime;
    }

    public void setWinAwardTime(Long winAwardTime) {
        this.winAwardTime = winAwardTime;
    }
}
