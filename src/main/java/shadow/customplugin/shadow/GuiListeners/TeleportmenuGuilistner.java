package shadow.customplugin.shadow.GuiListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class TeleportmenuGuilistner implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory inventory = e.getInventory();
        if (inventory.getTitle().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Teleport Menu")) {
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
        }
        if (inventory.getTitle().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Teleport Menu")) {

            if (e.getRawSlot() == 0) {
          p.performCommand("dragons");
            }
            if (e.getRawSlot() == 1) {
          p.performCommand("hub");
            }

        }
    }
}