package com.example.ai.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by AI on 2017/11/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
