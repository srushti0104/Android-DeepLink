package com.example.deeplink;

import android.content.Context;
import android.util.Log;

import com.appsonair.AppsOnAirServices;
import com.appsonair.NetworkUtils;

public class DeepLinkServices {
    static String appId;
    private static NetworkUtils networkUtils;
    public static  void getAppId(Context context){
        AppsOnAirServices.setAppId(context,true);
    }

    public static  void getUrl(Context context){
        networkUtils = new NetworkUtils(context);
        DeepLinkServices.networkUtils.setNetworkStateChangeListener(isConnected -> {
            if (isConnected) {
                Log.d("Network", "onNetworkStateChanged: " + true);
            } else {
                Log.d("url service", "getUrl: url function called in network false");
                Log.d("Network", "onNetworkStateChanged: " + false);
            }
        });
                    Log.d("url service", "getUrl: url function called");
    }

}
