package shadow.customplugin.shadow.ItemEvents;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import shadow.customplugin.shadow.ItemManager;

import java.util.HashMap;
import java.util.Set;

public class TeleportSword implements Listener {

    @EventHandler
    public void OnPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

            if(event.getAction().equals(Action.RIGHT_CLICK_AIR)){
                if(player.getInventory().getItemInHand().getItemMeta() != null && player.getInventory().getItemInHand().getItemMeta().getLore() != null
                        && player.getInventory().getItemInHand().getItemMeta().getLore().contains("§6Ability: Ether Transmission Ability §eRIGHT")){
                    Block block = player.getTargetBlock((Set<Material>)null, 54);
                    Location location = block.getLocation();
                    float pitch = player.getEyeLocation().getPitch();
                    float yaw = player.getEyeLocation().getYaw();
                    location.add(0, 0, 0);
                    location.setYaw(yaw);
                    location.setPitch(pitch);
                    player.teleport(location);
                    player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 5, 5);
                    player.sendMessage("§2Used §6Ether Transmission§2! §9(0 Mana)");
                }

            }

    }


    }

