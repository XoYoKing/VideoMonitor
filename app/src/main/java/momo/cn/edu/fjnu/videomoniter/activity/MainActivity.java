package momo.cn.edu.fjnu.videomoniter.activity;

import android.support.v4.app.Fragment;

import momo.cn.edu.fjnu.videomoniter.fragment.MainFragment;

/**
 * 主目录页面
 * Created by GaoFei on 2016/3/10.
 */
public class MainActivity extends SingleFragmentActivity{
    @Override
    public Fragment createFragment() {
        return new MainFragment();
    }
}
