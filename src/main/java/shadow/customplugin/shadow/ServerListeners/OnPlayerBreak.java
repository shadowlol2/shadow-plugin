package shadow.customplugin.shadow.ServerListeners;

import org.bukkit.Location;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import shadow.customplugin.shadow.CustomItems.ItemManager;

public class OnPlayerBreak implements Listener {
    public void onPlayerBreakBlockEvent(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        Action a = e.getAction();
        if(a.equals(Action.RIGHT_CLICK_AIR) || a.equals(Action.RIGHT_CLICK_AIR) ){
            if (p.getInventory().getItemInHand().getItemMeta() != null && p.getInventory().getItemInHand().getItemMeta().getLore() != null
                    && p.getInventory().getItemInHand().getItemMeta().getLore().contains("Shoots bats my g")) {
                Location loc = e.getPlayer().getLocation();
                float yaw = p.getEyeLocation().getYaw();
                float pitch = p.getEyeLocation().getYaw();
                   p.getWorld().spawnEntity(loc , EntityType.BAT);
            }
        } else {

        }
    }
}
