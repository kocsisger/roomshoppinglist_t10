package hu.unideb.inf.roomshoppinglist2.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = ShoppingListItem.class, version = 2, exportSchema = false)
public abstract class ShoppingListDatabase extends RoomDatabase {
    public abstract ShoppingListDAO shoppingListDAO();
}
