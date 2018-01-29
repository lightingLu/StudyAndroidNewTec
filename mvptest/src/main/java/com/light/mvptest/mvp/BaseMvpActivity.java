package com.light.mvptest.mvp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

/**
 * 创建日期：2018/1/29 on 15:14
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：
 */

public abstract class BaseMvpActivity<V extends MvpView, T extends BaseMvpPresenter> extends Activity implements MvpView {
    /**
     * Presenter对象
     */
    protected T mPresenter;
    public ProgressDialog mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        mPresenter.attachView((V)this);
        mProgress = new ProgressDialog(this);
        mProgress.setMessage("加载中...");
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null){
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (mPresenter == null){
            mPresenter = createPresenter();
        }
    }

    /**
     * 创建Presenter对象
     * @return Presenter对象
     */
    protected abstract T createPresenter();

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showProgress() {
        if (mProgress != null && !mProgress.isShowing()){
            mProgress.show();
        }
    }

    @Override
    public void closeProgress() {
        if (mProgress != null && mProgress.isShowing()) {
            mProgress.dismiss();
        }
    }

    @Override
    public void showToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

}
