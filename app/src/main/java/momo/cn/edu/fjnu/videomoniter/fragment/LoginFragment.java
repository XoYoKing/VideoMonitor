package momo.cn.edu.fjnu.videomoniter.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.xutils.view.annotation.ContentView;
import org.xutils.x;

import momo.cn.edu.fjnu.androidutils.base.BaseFragment;
import momo.cn.edu.fjnu.videomoniter.R;

/**
 * 登录页面及相关处理
 * Created by GaoFei on 2016/3/7.
 */
@ContentView(R.layout.fragment_login)
public class LoginFragment extends BaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return x.view().inject(this, inflater, container);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }
}
