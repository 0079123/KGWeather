package com.kkweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hhyyk on 2017/1/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
