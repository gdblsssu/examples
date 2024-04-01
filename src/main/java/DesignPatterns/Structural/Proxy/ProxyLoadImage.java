package DesignPatterns.Structural.Proxy;

import java.util.Map;

public class ProxyLoadImage implements LoadImage {
    LoadImageImpl loadImage;
    Map<String, Object> cache;

    public ProxyLoadImage() {
        this.loadImage = loadImage;
        this.cache = cache;
    }

    @Override
    public Object load(String url) {
        if(cache.get(url) != null){
            return cache.get(url);
        }
        Object image = loadImage.load(url);
        cache.put(url, image);
        return image;
    }
}
