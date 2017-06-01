package com.mgfypy.videolibrary.lisenter;

import android.graphics.Bitmap;

/**
 * =====================================
 * 作    者: jianglei
 * 版    本：1.0.0
 * 创建日期：2017/4/26
 * 描    述：
 * =====================================
 */
public interface JCameraLisenter {

    void captureSuccess(Bitmap bitmap);

    void recordSuccess(String url);

    void quit();

}
