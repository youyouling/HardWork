package bean;

import android.util.Log;

import interfaces.IPhone;

/**
 * Created by lenovo on 2017/11/13.
 */

public class BlackberryPhone implements IPhone {
    private final String TAG = BlackberryPhone.class.getSimpleName();

    @Override
    public void getOS() {
        Log.i(TAG, "im Blackberry");
    }
}
