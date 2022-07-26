package shadow.customplugin.shadow;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()) {
                if(cmd.getName().equalsIgnoreCase("term")) {
                    player.getInventory().addItem(ItemManager.TripleShotBow);
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
