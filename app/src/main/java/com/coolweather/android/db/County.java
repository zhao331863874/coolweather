package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

//县
public class County extends DataSupport {
    private int id;
    private String countyNmae; //县区名字
    private String weatherId; //县区对应的天气ID
    private int cityId; //当前所属市ID值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyNmae() {
        return countyNmae;
    }

    public void setCountyNmae(String countyNmae) {
        this.countyNmae = countyNmae;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
