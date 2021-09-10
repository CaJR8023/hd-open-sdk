package com.fkw.hdopen.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CAJR
 * @Description 活动用户行为传播数据VO
 * @date 2021/9/10 11:27
 */
public class HdActivityUserSpreadStatVO {

    private Integer activityId;

    private List<RegionData> cityTop10;

    private List<RegionData> provinceTop10;


    public static class  RegionData{
        private Integer joinNum;
        private Integer view;
        private String keyInfo;
        private Integer code;

        public Integer getJoinNum() {
            return joinNum;
        }

        public RegionData setJoinNum(Integer joinNum) {
            this.joinNum = joinNum;
            return this;
        }

        public Integer getView() {
            return view;
        }

        public RegionData setView(Integer view) {
            this.view = view;
            return this;
        }

        public String getKeyInfo() {
            return keyInfo;
        }

        public RegionData setKeyInfo(String keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }

        public Integer getCode() {
            return code;
        }

        public RegionData setCode(Integer code) {
            this.code = code;
            return this;
        }
    }

    public void initData(){
        int initSize = 10;
        this.setCityTop10(new ArrayList<>());
        this.setProvinceTop10(new ArrayList<>());
        while (cityTop10.size() < initSize){
            this.getCityTop10().add(new RegionData().setKeyInfo("无").setCode(0).setView(0).setJoinNum(0));
            this.getProvinceTop10().add(new RegionData().setKeyInfo("无").setCode(0).setView(0).setJoinNum(0));
        }
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public List<RegionData> getCityTop10() {
        return cityTop10;
    }

    public void setCityTop10(List<RegionData> cityTop10) {
        this.cityTop10 = cityTop10;
    }

    public List<RegionData> getProvinceTop10() {
        return provinceTop10;
    }

    public void setProvinceTop10(List<RegionData> provinceTop10) {
        this.provinceTop10 = provinceTop10;
    }
}
