package net.sunniwell.zhaogeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by weibao on 18/8/29.
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
