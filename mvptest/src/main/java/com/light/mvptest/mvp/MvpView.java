package com.light.mvptest.mvp;

import android.content.Context;

/**
 * 创建日期：2018/1/29 on 14:51
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：
 */

public interface MvpView {
    /***
     * 获取Context
     * @return Context
     */
    Context getContext();

    /***
     * 显示Progress
     */
    void showProgress();

    /***
     * 关闭Progress
     */
    void closeProgress();

    /***
     * @param string 消息内容
     */
    void showToast(String string);}
