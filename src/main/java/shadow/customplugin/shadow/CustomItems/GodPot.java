package shadow.customplugin.shadow.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GodPot implements Listener {
    @EventHandler
    public void OnRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if ((e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && (p.getInventory().getItemInHand().equals(ItemManager.godPot) || p.getInventory().getItemInHand().equals("God Potion"))) {
            ChatColor var10001 = ChatColor.ITALIC;
            p.sendMessage("You now have Following Affects Active: " + var10001 + p.getActivePotionEffects());
            p.getInventory().getItemInHand().setAmount(p.getInventory().getItemInHand().getAmount() - 1);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 24000, 8));
            p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 24000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 24000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 24000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 24000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 24000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 24000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 24000, 5));
            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 24000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 24000, 10));
       p.getInventory().remove(ItemManager.godPot);
        }

    }
    }

