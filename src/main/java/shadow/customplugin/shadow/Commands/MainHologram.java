package shadow.customplugin.shadow.Commands;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

public class MainHologram implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.isOp()) {
           if(command.getName().equalsIgnoreCase("mainhologram")) {
               ArmorStand stand = player.getWorld().spawn(player.getLocation().add(0, 1, 0), ArmorStand.class);
               stand.setGravity(false);
               stand.setVisible(false);
               stand.setCustomName(ChatColor.RED + "§lWelcome to Shadow Sandbox");
               stand.setCustomNameVisible(true);
               ArmorStand stand2 = player.getWorld().spawn(player.getLocation().add(0, -1, 0), ArmorStand.class);
               stand2.setGravity(false);
               stand2.setVisible(false);
               stand2.setCustomName(ChatColor.GRAY + "§lShadow Sandbox a hypixel skyblock remake focused to give players custom items");
               stand2.setCustomNameVisible(true);
               ArmorStand stand3 = player.getWorld().spawn(player.getLocation().add(0, -1.5, 0), ArmorStand.class);
               stand3.setGravity(false);
               stand3.setVisible(false);
               stand3.setCustomName(ChatColor.GRAY + "§lRemember this is stil WIP If u find any bugs report in bugs report channel in discord");
               stand3.setCustomNameVisible(true);
               ArmorStand stand4 = player.getWorld().spawn(player.getLocation().add(0, -2, 0), ArmorStand.class);
               stand4.setGravity(false);
               stand4.setVisible(false);
               stand4.setCustomName(ChatColor.GRAY + "§lIf u You want to get teleported to hub please use /hub");
               stand4.setCustomNameVisible(true);
               ArmorStand stand5 = player.getWorld().spawn(player.getLocation().add(0, -2.5, 0), ArmorStand.class);
               stand5.setGravity(false);
               stand5.setVisible(false);
               stand5.setCustomName(ChatColor.GRAY + "§lIf u You want to get custom items use /ci");
               stand5.setCustomNameVisible(true);
               ArmorStand stand6 = player.getWorld().spawn(player.getLocation().add(0, -3, 0), ArmorStand.class);
               stand6.setGravity(false);
               stand6.setVisible(false);
               stand6.setCustomName(ChatColor.GRAY + "§lPlease Remember to check on the rules npc");
               stand6.setCustomNameVisible(true);
           }
        } else {
                 player.kickPlayer(ChatColor.DARK_RED + "U cannot do that sorry");
        }
        return true;
    }


}
