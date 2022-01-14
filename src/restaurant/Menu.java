package restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
        final String RESTAURANT = "";
        private String categories;
        private HashMap<String, ArrayList> menuItem;
        private Date lastUpdated;

    public String getRESTAURANT() {
        return RESTAURANT;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public HashMap<String, ArrayList> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(HashMap<String, ArrayList> menuItem) {
        this.menuItem = menuItem;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
