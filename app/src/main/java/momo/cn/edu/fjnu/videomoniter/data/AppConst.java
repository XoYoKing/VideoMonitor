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
    public static final String DB_DIRECTORY = Environment.getExternalStorageDirectory() + "/momo/cn.edu.fjnu.videomonitor";
    /**数据库版本号*/
    public static final int DB_VERSION = 1;
    /**定位间隔时间*/
    public static final long LOCATE_TIME = 60L * 1000;
}
