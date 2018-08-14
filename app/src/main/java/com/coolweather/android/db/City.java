package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

//市
public class City extends DataSupport {
    private int id;
    private String cityName; //记录市区名字
    private int cityCode; //记录市区代号
    private int provinceId; //记录当前市区所属省D值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
