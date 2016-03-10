package momo.cn.edu.fjnu.videomoniter.model.net;

import android.os.AsyncTask;

import org.json.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;

import momo.cn.edu.fjnu.videomoniter.data.AppConst;
import momo.cn.edu.fjnu.videomoniter.exception.AppException;
import momo.cn.edu.fjnu.videomoniter.service.NetService;

/**
 * 登录异步块
 * Created by GaoFei on 2016/3/10.
 */
public class LoginTask extends AsyncTask<String, Integer, Integer>{
    public static final String TAG = LoginTask.class.getSimpleName();
    public interface CallBack{
        void onSuccess(JSONObject jsonObject);
        void onFailed(AppException exception);
    }
    private CallBack mCallback;
    private JSONObject mJsonResult;
    private AppException mException;

    public LoginTask(CallBack callBack){
        this.mCallback = callBack;
    }

    @Override
    protected Integer doInBackground(String... params) {
        Map<String, Object> reqParams = new LinkedHashMap<>();
        reqParams.put("user_name", params[0]);
        reqParams.put("password", params[1]);
        try {
            mJsonResult = NetService.request("login", reqParams);
        } catch (AppException e) {
            mException = e;
            e.printStackTrace();
        }
        return AppConst.RetResult.SUCC;
    }

    @Override
    protected void onPostExecute(Integer integer) {
        if(integer == AppConst.RetResult.SUCC)
            mCallback.onSuccess(mJsonResult);
        else
            mCallback.onFailed(mException);
    }
}
