package shadow.customplugin.shadow;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()) {
                if(cmd.getName().equalsIgnoreCase("term")) {
                    player.getInventory().addItem(ItemManager.TripleShotBow);
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
                    zombie.setMaxHealth(100000);
                    zombie.setHealth(100000);
                    ItemStack stick = new ItemStack(Material.STICK);
                    zombie.getEquipment().setBoots(new ItemStack(ItemManager.boots()));
                   // zombie.getEquipment().setHelmet(new ItemStack(ItemManager.));
                    zombie.getEquipment().setChestplate(new ItemStack(ItemManager.chest()));
                    zombie.getEquipment().setLeggings(new ItemStack(ItemManager.leggings()));
                    zombie.getEquipment().setItemInHand(stick);
                    zombie.setCustomName("Shadow Giant");

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
