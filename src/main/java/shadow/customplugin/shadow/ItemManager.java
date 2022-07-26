package shadow.customplugin.shadow;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemManager {
public static ItemStack TripleShotBow;
public static void init() {
createTripleShotBow();
}

public static void createTripleShotBow() {
    ItemStack item  = new ItemStack(Material.SIGN, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("Shadow Sign");
    ArrayList<String> lore = new ArrayList<String>();
    lore.add("A triple shot bow just like terminator in hypixel");
    lore.add("This was made with java");
    lore.add("§cI can add A ton of lore !");
    meta.setLore(lore);
    item.setItemMeta(meta);
    TripleShotBow = item;

    }
}
