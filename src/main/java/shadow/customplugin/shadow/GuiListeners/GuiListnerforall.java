package shadow.customplugin.shadow.GuiListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.Inventory;
import shadow.customplugin.shadow.CustomItems.ItemManager;
import shadow.customplugin.shadow.Shadow;

public class GuiListnerforall implements Listener {
    @EventHandler

    public void onGuiUpdate(InventoryInteractEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory inventory = e.getInventory();
        if (e.getInventory().getName().equalsIgnoreCase(ChatColor.BLACK + "Skyblock Menu")) {
            e.setCancelled(true);
        }

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


                return;
            }
        }

        if (inventory.getTitle().equalsIgnoreCase(ChatColor.BLACK + "Skyblock Menu")) {
            //  p.getInventory().addItem().clear(); // Base command for adding items into the gui
            e.setCancelled(true);

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lEXIT")) {
                e.setCancelled(true);
                p.closeInventory();
                p.updateInventory();
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7")) {
                    e.setCancelled(true);
                    p.updateInventory();
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7")) {
                    e.setCancelled(true);
                    p.updateInventory();
                }

            }

            if (inventory.getTitle().equalsIgnoreCase(ChatColor.BLACK + "Skyblock Menu")) {
                if (e.getRawSlot() == 13) {
                    p.closeInventory();
                    p.performCommand("stats");
                }

                if (e.getRawSlot() == 19) {
                    p.performCommand("skills");
                }
                if (e.getRawSlot() == 25) {
                    p.performCommand("enderchest");
                }
                if (e.getRawSlot() == 32) {
                    p.performCommand("wardrobe");
                }
                    if (e.getRawSlot() == 30) {
                        p.performCommand("pets");
                    }
                if(e.getRawSlot() == 45) {
                    p.performCommand("ci");

                }
                }
            }
        if (inventory.getTitle().equalsIgnoreCase("Your Skills")) {
          if(e.getRawSlot() == 48) {
              p.performCommand("sbmenu");
          }
          e.getInventory().setItem(45, ItemManager.S1blank);
        }
        }


    }

