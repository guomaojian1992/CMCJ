package com.cmcj.gmj.localapp.base;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by guomaojian on 16/9/28.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    protected P mPresenter;

    protected P getPresenter() {
        return mPresenter;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (getPresenter() != null)
            getPresenter().onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (getPresenter() != null)
            getPresenter().onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (getPresenter() != null)
            getPresenter().onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (getPresenter() != null)
            getPresenter().onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (getPresenter() != null)
            getPresenter().onDestroy();
    }
}