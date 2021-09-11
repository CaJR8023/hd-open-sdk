package com.fkw.hdopen.model;

/**
 * @author CAJR
 * @Description 返回给合作方玩家奖项数据vo
 * @date 2021/9/10 14:03
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