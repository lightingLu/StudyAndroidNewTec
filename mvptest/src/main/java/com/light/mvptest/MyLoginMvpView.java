package com.light.mvptest;

import com.light.mvptest.mvp.MvpView;

/**
 * 创建日期：2018/1/29 on 16:55
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：
 */

public interface MyLoginMvpView extends MvpView {
    /**
     * 倒计时完成
     */
    void countdownComplete();

    /**
     * 倒计时中
     * @param time 剩余时间
     */
    void countdownNext(String time);

    /**
     * 登录成功
     */
    void loginSuccess();


}
