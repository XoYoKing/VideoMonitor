package momo.cn.edu.fjnu.videomoniter.service;

import android.util.Log;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;

/**
 * 地理位置改变监听器
 * Created by GaoFei on 2016/3/8.
 */
public class LocationListener implements AMapLocationListener{
    public static final String TAG = LocationListener.class.getSimpleName();
    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {
        if(aMapLocation != null && aMapLocation.getErrorCode() == 0){
            LocationService.lat = aMapLocation.getLatitude();
            LocationService.lng = aMapLocation.getLongitude();
            LocationService.address = aMapLocation.getAddress();
            Log.i(TAG, "经度:" + LocationService.lat);
            Log.i(TAG, "纬度:" + LocationService.lat);
            Log.i(TAG, "位置:" + LocationService.address);
        }else{
            //定位失败,恢复初始值
            LocationService.initValue();
        }
    }
}
