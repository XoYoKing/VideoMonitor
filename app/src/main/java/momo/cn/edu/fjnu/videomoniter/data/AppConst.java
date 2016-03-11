package momo.cn.edu.fjnu.videomoniter.data;

import android.os.Environment;

/**
 * APP常量数据
 * Created by GaoFei on 2016/3/8.
 */
public class AppConst {
    /**数据库名称*/
    public static final String DB_NAME = "videocontrol.db";
    /**数据库存储目录*/
    public static final String DB_DIRECTORY = Environment.getExternalStorageDirectory() + "/momo/cn.edu.fjnu.videomonitor/db";
    /**数据库版本号*/
    public static final int DB_VERSION = 1;
    /**定位间隔时间*/
    public static final long LOCATE_TIME = 60L * 1000;
    /**请求的URl地址前缀*/
    public static final String URL_HEAD = "http://120.24.210.186:8080/VideoAppService/";
    /**图片存储目录*/
    public static final String PHOTO_DIRECTORY = Environment.getExternalStorageDirectory() + "/momo/cn.edu.fjnu.videomonitor/photo";
    /**
     * 请求结果
     */
    public interface RetResult{
        int SUCC = 1;
        int FAILED = 2;
    }

    /**
     * 文件类型
     */
    public interface FileType{
        //图片
        public int PHOTO = 1;
        //视频
        public int VIDEO = 2;
    }

}
