package momo.cn.edu.fjnu.videomoniter.base;

import android.util.Log;

import org.xutils.DbManager;
import org.xutils.x;

import java.io.File;

import momo.cn.edu.fjnu.androidutils.base.BaseApplication;
import momo.cn.edu.fjnu.videomoniter.data.AppConst;

/**
 * 整个APP实例
 * Created by GaoFei on 2016/3/8.
 */
public class VideoApplication extends BaseApplication {
    public static DbManager mDBManager;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("VideoApplication", "VideoApplication实例化");
        initApp();
    }

    /**
     * 初始化APP
     */
    public void initApp() {
        initDB();
    }

    /**
     * 初始化数据库
     */
    public void initDB() {
        DbManager.DaoConfig dbConfig = new DbManager.DaoConfig().setDbDir(new File(AppConst.DB_DIRECTORY))
                .setDbName(AppConst.DB_NAME).setDbVersion(AppConst.DB_VERSION)
                .setDbOpenListener(new DbManager.DbOpenListener() {
                    @Override
                    public void onDbOpened(DbManager db) {
                        // 开启WAL, 对写入加速提升巨大
                        db.getDatabase().enableWriteAheadLogging();
                    }
                }).setDbUpgradeListener(null);
        if (null == mDBManager)
            mDBManager = x.getDb(dbConfig);
    }

}
