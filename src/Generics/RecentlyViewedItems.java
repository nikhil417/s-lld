package Generics;

import java.util.LinkedList;

public class RecentlyViewedItems {
    private final LinkedList<Item> recentlyViwed;

    private final int MAX_SIZE = 10;

    public RecentlyViewedItems() {
        recentlyViwed = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        if (recentlyViwed.size() > MAX_SIZE) {
            if (recentlyViwed.contains(item)){
                recentlyViwed.remove(item);
            }else {
                recentlyViwed.removeFirst();
            }
        }
        recentlyViwed.add(item);
    }




}
