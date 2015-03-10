package purchase;

import java.util.ArrayList;

/**
 * Created by Christian Meisberger on 09.03.2015.
 */
public class ItemList {
    private ArrayList<PurchaseItems> items;


    public ItemList(ArrayList<PurchaseItems> items)
    {
        this.items = items;
    }

    public void addItem(PurchaseItems pItem)
    {
        items.add(pItem);
    }


}
