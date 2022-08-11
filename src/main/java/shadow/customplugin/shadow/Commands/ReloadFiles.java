package shadow.customplugin.shadow.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import shadow.customplugin.shadow.Shadow;

public class ReloadFiles implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("reloadpluginfiles")) {
            if(p.isOp()) {
                p.sendMessage(ChatColor.BOLD + "Reloading Server");

                p.performCommand("plugman unload Shadow");
                p.performCommand("plugman load Shadow");



            } else {
                if(!p.isOp()) {
                   p.sendMessage("You dont have perms to use this");
                }
            }
        }




        return true;
    }
}
