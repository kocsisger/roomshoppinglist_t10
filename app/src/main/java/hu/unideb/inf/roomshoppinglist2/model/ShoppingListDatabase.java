package hu.unideb.inf.roomshoppinglist2.model;

import androidx.room.Database;

@Database(entities = ShoppingListItem.class, version = 1, exportSchema = false)
public abstract class ShoppingListDatabase {
    public abstract ShoppingListDAO shoppingListDAO();
}
