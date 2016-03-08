package momo.cn.edu.fjnu.androidutils.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * 基本的Fragment
 * Created by GaoFei on 2016/1/3.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initEvent();
    }

    public abstract void initView();

    public abstract void initData();

    public abstract void initEvent();
}
