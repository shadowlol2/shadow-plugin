package shadow.customplugin.shadow.GuiListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class AdminGuiListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory inventory = e.getInventory();
        if (inventory.getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "Admins GUI")) {
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
        if (inventory.getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "Admins GUI")) {

          if(e.getRawSlot() == 1) {
              p.getInventory().getItemInHand().setAmount(111);
              p.updateInventory();
          }

        }
    }

}
