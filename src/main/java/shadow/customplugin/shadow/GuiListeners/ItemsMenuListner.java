package shadow.customplugin.shadow.GuiListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import shadow.customplugin.shadow.CustomItems.ItemManager;

public class ItemsMenuListner implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory inventory = e.getInventory();
        if (inventory.getTitle().equalsIgnoreCase(ChatColor.RED + "Items Menu")) {
            //  p.getInventory().addItem().clear(); // Base command for adding items into the gui
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lEXIT")) {
                e.setCancelled(true);
                p.closeInventory();

                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7")) {
                    e.setCancelled(true);

                }
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

                }

            }

        }

    }
}
