package shadow.customplugin.shadow.GuiListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.Inventory;
import shadow.customplugin.shadow.ItemManager;

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
        if (inventory.getTitle().equalsIgnoreCase(ChatColor.RED + "Items Menu")) {
            //  p.getInventory().addItem().clear(); // Base command for adding items into the gui
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lEXIT")) {
                e.setCancelled(true);
                p.closeInventory();
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7")) {
                    e.setCancelled(true);
                }
            }
            if (inventory.getTitle().equalsIgnoreCase(ChatColor.RED + "Items Menu")) {

                if (e.getRawSlot() == 0) {
                    p.getInventory().addItem(ItemManager.Aotv);
                }
                if (e.getRawSlot() == 1) {
                    p.getInventory().addItem(ItemManager.chest());
                }
                if (e.getRawSlot() == 2) {
                    p.getInventory().addItem(ItemManager.leggings());
                }
                if (e.getRawSlot() == 3) {
                    p.getInventory().addItem(ItemManager.boots());
                }

            }

        }

        if (inventory.getTitle().equalsIgnoreCase(ChatColor.RED + "Skyblock Menu")) {
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
            }
            if (e.getRawSlot() == 19) {
                p.performCommand("skills");
            }
        }
    }



}
