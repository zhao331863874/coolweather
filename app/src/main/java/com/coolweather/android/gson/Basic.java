package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city") //让JSON字段和java字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
