package shadow.customplugin.shadow;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemManager {
    public static ItemStack TripleShotBow;
    public static ItemStack RulesSign;
    public static ItemStack S1blank;
    public static ItemStack barrierblank;
    public static ItemStack randomitem;
    public static ItemStack Aotv;
    public static ItemStack bobsword;

    public static void init() {
        createTripleShotBow();
        CreateRulesMenu();
        CreateBlank();
        CreateBarrier();
        Randomitem();
        CreateAotv();
        CreateBobSword();
    }

    public static void createTripleShotBow() {
        ItemStack item = new ItemStack(Material.SIGN, 1);
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

    public static void Randomitem() {
        ItemStack item = new ItemStack(Material.BARRIER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lEXIT");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§7Click here to exit");
        meta.setLore(lore);
        item.setItemMeta(meta);
        randomitem = item;
    }

    public static void CreateAotv() {
        ItemStack item = new ItemStack(Material.DIAMOND_SPADE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Herioc Aspect of The Void");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        ArrayList<String> lore = new ArrayList<>();
        lore.add("§7Damage: §c120");
        lore.add("§7Strength: §c140 §9(+40)");
        lore.add("§7Crit Damage: §c50%");
        lore.add("§7Bonus Attack Speed: §c5 §9(+5)");
        lore.add("§7Intelligence: §c100");
        lore.add("§7");
        lore.add("§d§lUltimate Wise V");
        lore.add("§7");
        lore.add("§6Ability: Ether Transmission Ability §eRIGHT");
        lore.add("§7Teleport to your targetted block");
        lore.add("§7up to §a61 blocks§7 away.");
        lore.add("§7Soulflow Cost: §31");
        lore.add("§7Mana Cost: §30");
        lore.add("§7");
        lore.add("§6§lLEGENDARY SWORD §7 §7 §7 §7 §7 §7");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Aotv = item;
    }


    public static ItemStack chest() {
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta0 = chest.hasItemMeta() ? chest.getItemMeta() : Bukkit.getItemFactory().getItemMeta(chest.getType());
        LeatherArmorMeta leatherArmorMeta0 = (LeatherArmorMeta) meta0;
        leatherArmorMeta0.setColor(Color.fromRGB(22, 138, 183));
        ((LeatherArmorMeta) meta0).setColor(Color.BLACK);
        leatherArmorMeta0.setDisplayName("Storm's Chestplate");
        chest.setItemMeta(leatherArmorMeta0);
        return chest;
    }

    public static ItemStack chestForGui() {
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta0 = chest.hasItemMeta() ? chest.getItemMeta() : Bukkit.getItemFactory().getItemMeta(chest.getType());
        LeatherArmorMeta leatherArmorMeta0 = (LeatherArmorMeta) meta0;
        leatherArmorMeta0.setColor(Color.fromRGB(22, 138, 183));
        leatherArmorMeta0.setDisplayName("Storm's Armor");
        ((LeatherArmorMeta) meta0).setColor(Color.BLACK);
        chest.setItemMeta(leatherArmorMeta0);
        return chest;
    }

    public static ItemStack leggings() {
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta1 = leggings.hasItemMeta() ? leggings.getItemMeta() : Bukkit.getItemFactory().getItemMeta(leggings.getType());
        LeatherArmorMeta leatherArmorMeta1 = (LeatherArmorMeta) meta1;
        leatherArmorMeta1.setColor(Color.fromRGB(21, 156, 181));
        leatherArmorMeta1.setDisplayName("Storm's Leggings");
        leatherArmorMeta1.setColor(Color.BLACK);
        leggings.setItemMeta(leatherArmorMeta1);

        return leggings;
    }

    public static ItemStack boots() {
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta2 = boots.hasItemMeta() ? boots.getItemMeta() : Bukkit.getItemFactory().getItemMeta(boots.getType());
        LeatherArmorMeta leatherArmorMeta2 = (LeatherArmorMeta) meta2;
        leatherArmorMeta2.setColor(Color.fromRGB(27, 179, 212));
        leatherArmorMeta2.setDisplayName("Storm's Boots");
        ((LeatherArmorMeta) meta2).setColor(Color.BLACK);
        boots.setItemMeta(leatherArmorMeta2);
        return boots;
    }

    public static ItemStack head() {
        ItemStack pigskull = new ItemStack(Material.SKULL_ITEM /*(or LEGACY_SKULL_ITEM forgot) **/, 1, (short) SkullType.PLAYER.ordinal());
        SkullMeta meta = (SkullMeta) pigskull.getItemMeta();
        meta.setOwner("Iron Helmet");
        pigskull.setItemMeta(meta);
        return pigskull;
    }
    public static void CreateBobSword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Your Skills");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY+ "Click on The Sword " +
                "to view Your skills");

        meta.setLore(lore);
        item.setItemMeta(meta);

        bobsword = item;
    }
}

