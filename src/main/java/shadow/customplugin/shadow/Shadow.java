package shadow.customplugin.shadow;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;
import shadow.customplugin.shadow.Commands.Commands;
import shadow.customplugin.shadow.DamageListeners.Aotvdamage;
import shadow.customplugin.shadow.GuiListeners.GuiListnerforall;
import shadow.customplugin.shadow.ItemEvents.TeleportSword;

import java.util.ArrayList;


public final class Shadow extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Loading Plugin!");
        System.out.println("25%");
        System.out.println("50%");
        System.out.println("75%");
        System.out.println("100%");
        System.out.println("Shadow Plugin has start!");
        getServer().getPluginManager().registerEvents(this, this); //handles the event
        //  getServer().getPluginManager().registerEvents(new GuiListner(), this);
        ItemManager.init();
        getCommand("term").setExecutor(new Commands());
        getCommand("RulesSign").setExecutor(new Commands());
        getCommand("kill").setExecutor(new Commands());
        getCommand("gmc").setExecutor(new Commands());
        this.getServer().getPluginManager().registerEvents(new TeleportSword(), this);
        getCommand("boss1").setExecutor(new Commands());
        getCommand("hub").setExecutor(new Commands());
        getCommand("boss2").setExecutor(new Commands());
        this.getServer().getPluginManager().registerEvents(new Aotvdamage(), this);
        this.getServer().getPluginManager().registerEvents(new GuiListnerforall(), this);
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.println("A player has joined the server");
        event.setJoinMessage(null); //Custom welcome message


    }

    @EventHandler
    public void onPlayerleave(PlayerQuitEvent event) {
        event.setQuitMessage(null);

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent event) {
        event.setCancelled(true);
    } //disables blocks breaking


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockPlace(BlockPlaceEvent event) {
        event.setCancelled(true);

    } //disables block placing
//tt

    //Gives the player a weapon


    // private final Inventory gui = Bukkit.createInventory(null, 45, (ChatColor.DARK_GREEN + "Item GUI"));

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("stats")) {
            player.sendMessage(ChatColor.RED + "Not implemented yeet");
        }
        final Inventory gui = Bukkit.createInventory(null, 27, (ChatColor.DARK_GREEN + "Rules GUI"));
        //ItemStack s1 = new ItemStack(Material.STAINED_GLASS_PANE);

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("rules")) {
                ItemStack[] menu_items = {ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank,
                        ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.RulesSign, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank,
                        ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.barrierblank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank};
                gui.setContents(menu_items);
                p.openInventory(gui);
                p.sendMessage("Please Hover over the rules sign");
            }
        }
        final Inventory trashgui = Bukkit.createInventory(null, 54, (ChatColor.DARK_GREEN + "Trash GUI"));

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("trash") || cmd.getName().equalsIgnoreCase("bin")) {
                ItemStack[] menu_trash = {};

                trashgui.setItem(45, ItemManager.S1blank);
                trashgui.setItem(46, ItemManager.S1blank);
                trashgui.setItem(47, ItemManager.S1blank);
                trashgui.setItem(48, ItemManager.S1blank);
                trashgui.setItem(49, ItemManager.barrierblank);
                trashgui.setItem(50, ItemManager.S1blank);
                trashgui.setItem(51, ItemManager.S1blank);
                trashgui.setItem(52, ItemManager.S1blank);
                trashgui.setItem(53, ItemManager.S1blank);
                p.openInventory(trashgui);
                p.sendMessage(ChatColor.DARK_RED + "Please Put Your Garbage inside of this gui");
            }
            if (cmd.getName().equalsIgnoreCase("rules")) {
                ItemStack[] menu_items = {ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank,
                        ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.RulesSign, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank,
                        ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.barrierblank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank, ItemManager.S1blank};
                gui.setContents(menu_items);
                p.openInventory(gui);
                p.sendMessage("Please Hover over the rules sign");
            }
        }
        final Inventory itemenugui = Bukkit.createInventory(null, 54, (ChatColor.RED + "Items Menu"));

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("sandboxitems") || cmd.getName().equalsIgnoreCase("si")) {
                ItemStack[] menu_trash = {};
                itemenugui.setItem(0, ItemManager.Aotv);
                itemenugui.setItem(1, ItemManager.chest());
                itemenugui.setItem(2, ItemManager.leggings());
                itemenugui.setItem(3, ItemManager.boots());
                itemenugui.setItem(4, ItemManager.head());
                itemenugui.setItem(45, ItemManager.S1blank);
                itemenugui.setItem(46, ItemManager.S1blank);
                itemenugui.setItem(47, ItemManager.S1blank);
                itemenugui.setItem(48, ItemManager.S1blank);
                itemenugui.setItem(49, ItemManager.barrierblank);
                itemenugui.setItem(50, ItemManager.S1blank);
                itemenugui.setItem(51, ItemManager.S1blank);
                itemenugui.setItem(52, ItemManager.S1blank);
                itemenugui.setItem(53, ItemManager.S1blank);
                p.openInventory(itemenugui);

            }
            final Inventory sbmenugui = Bukkit.createInventory(null, 54, (ChatColor.BLACK + "Skyblock Menu"));

            if (sender instanceof Player) {

                if (cmd.getName().equalsIgnoreCase("sbmenu")) {
                    ItemStack[] menu_trash = {};
                    ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1);
                    skull.setDurability((short)3);
                    SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
                    skullMeta.setOwner(p.getName());
                    skullMeta.setDisplayName(ChatColor.GREEN + "Your Skyblock Profile");
                    ArrayList<String> lore = new ArrayList<>();
                    lore.add("§7View your equipment , stats," +
                            "and more!");
                    lore.add("§7");

                    skullMeta.setLore(lore);
                    skull.setItemMeta(skullMeta);

                  sbmenugui.setItem(0, ItemManager.S1blank);
                    sbmenugui.setItem(1, ItemManager.S1blank);
                    sbmenugui.setItem(2, ItemManager.S1blank);
                    sbmenugui.setItem(3, ItemManager.S1blank);
                    sbmenugui.setItem(4, ItemManager.S1blank);
                    sbmenugui.setItem(5, ItemManager.S1blank);
                    sbmenugui.setItem(6, ItemManager.S1blank);
                    sbmenugui.setItem(7, ItemManager.S1blank);
                    sbmenugui.setItem(8, ItemManager.S1blank);
                    sbmenugui.setItem(9, ItemManager.S1blank);
                    sbmenugui.setItem(10, ItemManager.S1blank);
                    sbmenugui.setItem(11, ItemManager.S1blank);
                    sbmenugui.setItem(12, ItemManager.S1blank);
                    sbmenugui.setItem(13 , skull);
                    sbmenugui.setItem(14, ItemManager.S1blank);
                    sbmenugui.setItem(15, ItemManager.S1blank);
                    sbmenugui.setItem(16, ItemManager.S1blank);
                    sbmenugui.setItem(17, ItemManager.S1blank);
                    sbmenugui.setItem(18, ItemManager.S1blank);
                    sbmenugui.setItem(19, ItemManager.bobsword );
                    sbmenugui.setItem(49, ItemManager.barrierblank);

                    p.openInventory(sbmenugui);

                }
            }

        }


        return false;
    }







}





//java -Xms1G -Xmx1G -XX:+UseG1GC -jar spigot.jar


