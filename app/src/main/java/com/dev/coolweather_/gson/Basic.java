package com.dev.coolweather_.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yihost on 2018/9/23.
 */
public class Basic {

     public String cid;
     public String location;

     @SerializedName("parent_city")
     public String parentCity;

     @SerializedName("admin_area")
     public String province;

     @SerializedName("cnty")
     public String country;

     public String lat;
     public String lon;
     public String tz;
     public String city;

     public Update update;

     public class Update{
         @SerializedName("loc")
         public String updateTime;
         public String utc;
     }

}
