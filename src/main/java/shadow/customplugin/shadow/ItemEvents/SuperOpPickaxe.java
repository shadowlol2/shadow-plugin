package shadow.customplugin.shadow.ItemEvents;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import shadow.customplugin.shadow.CustomItems.ItemManager;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class SuperOpPickaxe implements Listener {


    @EventHandler
    public void onRightClickOpPic(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        double z = p.getLocation().getZ(); //gets player Z location
        double y = p.getLocation().getY(); // gets player Y location
        double x = p.getLocation().getZ(); // gets player X location
        Location loc = new Location(p.getWorld(), x, y, z);

        ItemStack inHand = p.getItemInHand();
        if (inHand.equals(ItemManager.oppickaxeitem)) {
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                // p.getLocation().getWorld().createExplosion(p.getLocation(), 5);


                //.multiply(-1.0).multiply(3.0)
                p.setVelocity((new Vector(x, y, z).setY(1)));
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lYou Have launched your self 5 blocks high"));
                p.setFoodLevel(100);
                p.setMaxHealth(20);
                p.setHealth(20);
                p.playSound(loc, Sound.ENDERMAN_TELEPORT, 10, 10);
            }
            if (e.getAction().equals(Action.LEFT_CLICK_BLOCK) || e.getAction().equals(Action.LEFT_CLICK_AIR)) {
                p.setVelocity((new Vector(x, y, z).setY(-20)));
                p.setFoodLevel(11111);
            }
        }
    }

   /*@EventHandler
    public void onhitwithoppic(EntityDamageByEntityEvent e) {
        Player p = (Player) e.getDamager();

        if(e.getEntityType().equals(EntityType.ZOMBIE)) {
            if()
            double number = 1111111111;
            e.setDamage(number);
            p.sendMessage("You have dealt : " + e.getDamage());
        }

   }*/
}
