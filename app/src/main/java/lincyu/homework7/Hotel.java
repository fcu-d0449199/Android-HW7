package lincyu.homework7;

import android.graphics.Bitmap;

/**
 * Created by LF on 2017/6/18.
 */

public class Hotel {

    private Bitmap imgUrl;

    private String name;

    private String address;

    public Bitmap getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Bitmap imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
