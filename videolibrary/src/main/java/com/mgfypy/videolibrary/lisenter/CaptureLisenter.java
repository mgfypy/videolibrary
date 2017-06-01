package com.mgfypy.videolibrary.lisenter;

/**
 * create by jianglei
 *
 */

public interface CaptureLisenter {
    void takePictures();

    void recordShort(long time);

    void recordStart();

    void recordEnd(long time);

    void recordZoom(float zoom);
}
