package momo.cn.edu.fjnu.videomoniter.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import momo.cn.edu.fjnu.androidutils.base.BaseFragment;
import momo.cn.edu.fjnu.androidutils.utils.ResourceUtils;
import momo.cn.edu.fjnu.videomoniter.R;

/**
 * 主目录页面
 * Created by GaoFei on 2016/3/10.
 */
@ContentView(R.layout.fragment_main)
public class MainFragment extends BaseFragment{
    @ViewInject(R.id.img_back)
    private ImageView mImgBack;

    @ViewInject(R.id.text_title)
    private TextView mTextTitle;

    @ViewInject(R.id.text_option)
    private TextView mTextOption;

    /**视频实时上传按钮*/
    @ViewInject(R.id.btn_video_rt_upload)
    private Button mBtnVideoRtUpload;

    /**视频实时监控按钮*/
    @ViewInject(R.id.btn_video_rt_monitor)
    private Button mBtnVideoRtMonitor;

    /**拍照上传按钮*/
    @ViewInject(R.id.btn_photo_capture_upload)
    private Button mBtnPhtotoCapture;

    /**视频录制上传按钮*/
    @ViewInject(R.id.btn_video_recorder_upload)
    private Button mBtnVideoRecorder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return x.view().inject(this, inflater, container);
    }

    @Override
    public void initView() {
        mImgBack.setVisibility(View.GONE);
        mTextOption.setVisibility(View.GONE);
        //设置标题
        mTextTitle.setText(ResourceUtils.getString(R.string.main_menu));
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {
        //视频实时上传监听事件
        mBtnVideoRtUpload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        //视频实时监控监听事件
        mBtnVideoRtMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //拍照上传按钮监听事件
        mBtnPhtotoCapture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        //视频录制按钮上传事件
        mBtnVideoRecorder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }
}
