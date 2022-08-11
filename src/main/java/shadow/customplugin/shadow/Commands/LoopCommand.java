package shadow.customplugin.shadow.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class LoopCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings ) {
        Player p = (Player) commandSender;

        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("You must be a player to run this command!");
            return false;
        }
        if(p.hasPermission("shadow.spawn10mobs")) {
            if(command.getName().equalsIgnoreCase("spawn10mobs")) {
              p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                p.performCommand("boss2");
                }
        } else {
            if (!p.hasPermission("shadow.loopcommands")) {
                p.sendMessage("You Dont have perms");
            }
        }



        return true;
    }
}
