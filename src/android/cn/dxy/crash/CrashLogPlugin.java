package cn.dxy.crash;


import android.Manifest;
import android.content.Context;
import com.umeng.commonsdk.UMConfigure;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PermissionHelper;

/**
 * 应用崩溃日志文件插件
 */
public class CrashLogPlugin extends CordovaPlugin {

    protected final static String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
    private static final int CODE = 1;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Context context = cordova.getActivity().getApplicationContext();
        UMConfigure.init(context, "umen-key", "Umeng", UMConfigure.DEVICE_TYPE_PHONE,
            "");
    }

}
