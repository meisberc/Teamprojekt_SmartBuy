package purchase;

import android.graphics.Picture;

/**
 * Created by Christian Meisberger on 09.03.2015.
 */
public class PurchaseItems {
    private String name;
    private String desc;
    private Picture pic;

    public PurchaseItems(String name, String desc, Picture pic)
    {
        this.name = name;
        this.desc = desc;
        this.pic = pic;
    }

    public String getName()
    {
        return name;
    }

    public String getDesc()
    {
        return desc;
    }

    public Picture getPic()
    {
        return pic;
    }
}
