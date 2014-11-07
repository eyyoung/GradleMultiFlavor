package me.yytech.testmoduleone;

import android.util.Log;

/**
 * Created by Administrator on 2014/11/7.
 */
public class ModuleUtils {

    public static int getModuleVersion() {
        if (BuildConfig.LOG_INFO) {
            Log.e("TEST", "TEST_MODULE");
        }
        return 1;
    }

}
