package com.fkw.hdopen.model;

/**
 * 返回给合作方玩家奖项数据vo
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HdActivityUserAwardInfoVO {

    /**
     * 兑奖码
     */
    private String code;

    /**
     * 奖品等级
     */
    private Integer level;

    /**
     * 兑奖码状态
     */
    private Integer codeStatus;

    /**
     * 奖品名称
     */
    private String awardName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(Integer codeStatus) {
        this.codeStatus = codeStatus;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    @Override
    public String toString() {
        return "HdActivityUserAwardInfoVO{" +
                "code='" + code + '\'' +
                ", level=" + level +
                ", codeStatus=" + codeStatus +
                ", awardName='" + awardName + '\'' +
                '}';
    }
}
