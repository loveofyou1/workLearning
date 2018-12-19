package com.main.learn.threads.concurrencyPractice.chapter6;

import com.sun.scenario.effect.ImageData;

import java.util.ArrayList;
import java.util.List;

public class SingleThreadRender {
    void renderRange(CharSequence source) {
        renderText(source);
        List<ImageData> imageData = new ArrayList<>();
        for (ImageInfo imageInfo : scnaForImageInfo(imageData)) {
            imageData.add(imageInfo.downloadImage());
        }
        for (ImageData data : imageData) {
            renderImage(data);
        }
    }

    private void renderImage(ImageData data) {
    }

    private ImageInfo[] scnaForImageInfo(List<ImageData> imageData) {
        return null;
    }

    private void renderText(CharSequence source) {
    }

    private class ImageInfo {
        ImageData downloadImage() {
            return new ImageData(null, null, null);
        }
    }
}
