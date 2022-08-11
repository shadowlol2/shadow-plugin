package shadow.customplugin.shadow.DamageListeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class Aotvdamage implements Listener {
    @EventHandler
    public void onDmg(EntityDamageByEntityEvent event) {

        if (event.getDamager() instanceof Player
                && ((Player)event.getDamager()).getItemInHand().getType() == Material.DIAMOND_SPADE) {
            ItemStack sword = ((Player)event.getDamager()).getItemInHand();
            if (sword.hasItemMeta()
                    && sword.getItemMeta().hasDisplayName()
                    && sword.getItemMeta().getDisplayName().equalsIgnoreCase("§6Herioc Aspect of The Void")) {
                event.setDamage(10000000);


            }
        }
    }
}
