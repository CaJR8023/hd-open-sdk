package com.fkw.hdopen.model;

import java.util.List;

/**
 * @author CAJR
 * @Description 活动传播成绩数据封装VO
 * @date 2021/9/10 11:26
 */
public class HdActivitySpreadStatLevelVO {
    /** 层级名称 */
    private String name;

    /** 层级数据 */
    private List<Integer> data;

    public String getName() {
        return name;
    }

    public HdActivitySpreadStatLevelVO setName(String name) {
        this.name = name;
        return this;
    }

    public List<Integer> getData() {
        return data;
    }

    public HdActivitySpreadStatLevelVO setData(List<Integer> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "HdActivitySpreadStatLevelVO{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
