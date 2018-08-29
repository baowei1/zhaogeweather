package net.sunniwell.zhaogeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by weibao on 18/8/29.
 */

public class Forcecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;

    }

}
