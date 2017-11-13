package bean;

import android.util.Log;

import interfaces.IPhone;

/**
 * Created by lenovo on 2017/11/13.
 */

public class IosPhone implements IPhone {
    private final String TAG = IosPhone.class.getSimpleName();

    @Override
    public void getOS() {
        Log.i(TAG, "im IOS");
    }
}
