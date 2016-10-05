package vn.com.ytgdoc.democustomgridview.Model;

/**
 * Created by ytgdoc on 10/5/2016.
 */

public class Itemrow {
    String lblcus;
    int imgcus;

    public Itemrow(String lblcus, int imgcus) {
        this.lblcus = lblcus;
        this.imgcus = imgcus;
    }

    public String getLblcus() {
        return lblcus;
    }

    public void setLblcus(String lblcus) {
        this.lblcus = lblcus;
    }

    public int getImgcus() {
        return imgcus;
    }

    public void setImgcus(int imgcus) {
        this.imgcus = imgcus;
    }
}
