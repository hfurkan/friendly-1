package com.friendly;
import com.reactnativenavigation.controllers.SplashActivity;
import com.facebook.react.ReactActivity;
import android.content.Intent;

public class MainActivity extends SplashActivity {


    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */

    // protected String getMainComponentName() {
    //     return "friendly";
    // }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
    }
}
