package bean;

import android.util.Log;

import interfaces.IPhone;

/**
 * Created by lenovo on 2017/11/13.
 */
git
public class AndroidPhone implements IPhone {
    private final String TAG = AndroidPhone.class.getSimpleName();

    @Override
    public void getOS() {
        Log.i(TAG, "im android");
    }
}
