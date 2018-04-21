package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by avains on 2018/4/19.
 */

public class Province extends DataSupport{

    private int id;
    private String cityName;
    private int cityCode;
    private int ProvinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityname() {
        return cityName;
    }

    public void setCityname(String cityname) {
        this.cityName = cityname;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceCode() {
        return ProvinceId;
    }

    public void setProvinceCode(int provinceCode) {
        ProvinceId = provinceCode;
    }


}
