package cz.lhoracek.android.dials.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by horaclu2 on 22/11/16.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected View mDecorView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDecorView = getWindow().getDecorView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        enableFullScreen(true);
    }

    protected void enableFullScreen(boolean enabled) {
        int newVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;

        if (enabled) {
            View decorView = getWindow().getDecorView();
            newVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            mDecorView.setSystemUiVisibility(newVisibility);
        }
    }
}