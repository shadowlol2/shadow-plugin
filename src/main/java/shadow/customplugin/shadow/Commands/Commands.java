package shadow.customplugin.shadow.Commands;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import shadow.customplugin.shadow.ItemManager;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()) {
                if(cmd.getName().equalsIgnoreCase("term")) {
                    player.getInventory().addItem(ItemManager.TripleShotBow);
                    player.getInventory().addItem(ItemManager.bobsword);
                }
                if (cmd.getName().equalsIgnoreCase("RulesSign")) {
                    player.getInventory().addItem(ItemManager.RulesSign);
                }
                if (cmd.getName().equalsIgnoreCase("kill")) {
                    player.setMaxHealth(10000000);
                    player.setHealth(99);


                    player.sendMessage("Hhehehe Gave u alot of health enjoy");
                }
                if(cmd.getName().equalsIgnoreCase("gmc")) {
                    player.performCommand("gamemode c");
                }
                if (cmd.getName().equalsIgnoreCase("boss1")) {
                    Giant zombie = (Giant)player.getWorld().spawn(player.getLocation(), Giant.class);
                       zombie.setMaxHealth(2048);
                    zombie.setHealth(2048);
                    ItemStack stick = new ItemStack(Material.STICK);
                    zombie.getEquipment().setBoots(new ItemStack(ItemManager.boots()));
                   // zombie.getEquipment().setHelmet(new ItemStack(ItemManager.));
                    zombie.getEquipment().setChestplate(new ItemStack(ItemManager.chest()));
                    zombie.getEquipment().setLeggings(new ItemStack(ItemManager.leggings()));
                    zombie.getEquipment().setItemInHand(stick);
                    zombie.setCustomName("Shadow Giant");
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 1));
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 1));
                }
                if (cmd.getName().equalsIgnoreCase("boss2")) {
                    Zombie zombie = (Zombie)player.getWorld().spawn(player.getLocation(), Zombie.class);
                    zombie.setMaxHealth(2048);
                    zombie.setHealth(2048);
                    ItemStack stick = new ItemStack(Material.STICK);
                    zombie.getEquipment().setBoots(new ItemStack(ItemManager.boots()));
                    // zombie.getEquipment().setHelmet(new ItemStack(ItemManager.));
                    zombie.getEquipment().setChestplate(new ItemStack(ItemManager.chest()));
                    zombie.getEquipment().setLeggings(new ItemStack(ItemManager.leggings()));
                    zombie.getEquipment().setItemInHand(stick);
                    zombie.setCustomName("Shadow Giant" + zombie.getHealth());
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 1));
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 1));
                }
                if(cmd.getName().equalsIgnoreCase("hub")) {
                    Location location = new Location(player.getWorld(), -2.5,70, -67.5 , 180 , 0);
                    player.teleport(location);
                    player.sendMessage(ChatColor.RED + "§lTeleported you to Hub");
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 1));

                }
                if(cmd.getName().equalsIgnoreCase("dragons")) {
                    Location location = new Location(player.getWorld(), 978, 1 ,-10, 180 , 0);
                    player.teleport(location);
                }

            } else {




                sender.sendMessage("Only Opped Players Can do this sorry");
            }
            return true;
        } else {
            sender.sendMessage("Only Players Can do this sorry");
            return true;
        }

    }


}
