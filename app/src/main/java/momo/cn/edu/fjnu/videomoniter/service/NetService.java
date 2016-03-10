package momo.cn.edu.fjnu.videomoniter.service;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;

import org.json.JSONObject;

import java.util.Map;

import momo.cn.edu.fjnu.androidutils.data.CommonValues;
import momo.cn.edu.fjnu.videomoniter.data.AppConst;
import momo.cn.edu.fjnu.videomoniter.exception.APPErrorCode;
import momo.cn.edu.fjnu.videomoniter.exception.AppException;

/**
 * 网络服务,用于请求服务器中的方法
 * Created by GaoFei on 2016/3/8.
 */
public class NetService {

    /**
     * @param method   请求方法
     * @param params    请求参数
     * @return
     */
    public static JSONObject request(String method, Map<String, Object> params) throws AppException{
        AQuery query = new AQuery(CommonValues.application);
        AjaxCallback<String> callback = new AjaxCallback<>();
        callback.url(AppConst.URL_HEAD + method).params(params).type(String.class);
        query.sync(callback);
        String strResult = callback.getResult();
        if(callback.getStatus().getCode() == AjaxStatus.NETWORK_ERROR || strResult == null ){
            //网络错误
            throw new AppException(APPErrorCode.ERROR_NETWORK, "网络错误");
        }else{
            try {
                JSONObject resultJson = new JSONObject(strResult);
                JSONObject content = resultJson.getJSONObject("result");
                if(content.get("succ") != null){
                    return content.getJSONObject("succ");
                }else{
                    throw new AppException(APPErrorCode.INTERNEL_ERROR, content.getString("error"));
                }
            }catch (Exception e){
                throw new AppException(APPErrorCode.INVALID_RESPONSE, "非法数据返回");
            }

        }
    }

}
