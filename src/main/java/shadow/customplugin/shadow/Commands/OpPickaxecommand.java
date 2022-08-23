package shadow.customplugin.shadow.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import shadow.customplugin.shadow.CustomItems.ItemManager;

public class OpPickaxecommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;

        if(p.hasPermission("shadow.oppickaxe")) {
            if(command.getName().equalsIgnoreCase("givepic")) {
                p.getInventory().addItem(ItemManager.oppickaxeitem);
            }
        } else {
            p.sendMessage("You dont have permissions my g");
        }



        return false;
    }
}
