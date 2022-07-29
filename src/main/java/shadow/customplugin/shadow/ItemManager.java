package shadow.customplugin.shadow;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemManager {
public static ItemStack TripleShotBow;
public static ItemStack RulesSign;
public static ItemStack S1blank;
public static ItemStack barrierblank;
public static void init() {
createTripleShotBow();
CreateRulesMenu();
CreateBlank();
CreateBarrier();
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

    public static void CreateRulesMenu() {
        ItemStack item = new ItemStack(Material.SIGN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lRules Menu!");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§c§lShadow Sandbox Server Rules");
        lore.add("§7§l-----------------------------");
        lore.add("§6§l1. Respect Everyone and don't swear");
        lore.add("§6§l2. No cheating");
        lore.add("§6§l3. No bug abusing");
        lore.add("§6§l4. Dont promote anything releated to you");
        lore.add("§7§l-----------------------------");
        lore.add("§d§k100 §7 §7 §7 §7 §7 §7  §d§lMYTHIC RULES §7 §7 §7 §7 §7 §7  §d§k 100");
        meta.setLore(lore);
        item.setItemMeta(meta);
        RulesSign = item;
    }
    public static void CreateBlank() {
    ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("§7");
   item.setItemMeta(meta);
        S1blank = item;
    }


    public static void CreateBarrier() {
        ItemStack item = new ItemStack(Material.BARRIER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lEXIT");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§7Click here to exit");
        meta.setLore(lore);
        item.setItemMeta(meta);
        barrierblank = item;
    }
}
