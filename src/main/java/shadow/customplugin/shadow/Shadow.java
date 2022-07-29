package shadow.customplugin.shadow;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

import java.util.ArrayList;
import java.util.List;



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

    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.println("A player has joined the server");
        event.setJoinMessage(null); //Custom welcome message


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
                trashgui.setItem(44, ItemManager.randomitem);
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


        }


        return false;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory inventory = e.getInventory();
        if (e.getInventory().getName().equalsIgnoreCase(ChatColor.DARK_GREEN + "Rules GUI")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lRules Menu!")) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lEXIT")) {
                e.setCancelled(true);
                p.closeInventory();
            }
        }
        if (e.getInventory().getName().equalsIgnoreCase(ChatColor.DARK_GREEN + "Trash GUI")) {
            e.setCancelled(false);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lEXIT")) {
                e.setCancelled(true);
                p.closeInventory();
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7")) {
                e.setCancelled(true);
            }
        }
        if (inventory.getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "Rules GUI")) {
            e.setCancelled(true);
            if (e.getRawSlot() == 13) {
                //p.performCommand("kick _mo7_");
                p.getInventory().addItem(ItemManager.RulesSign).clear();
                return;
            }
        }

    }
}


//java -Xms1G -Xmx1G -XX:+UseG1GC -jar spigot.jar


