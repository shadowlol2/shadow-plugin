package shadow.customplugin.shadow;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class maincommand {
    private final Inventory gui = Bukkit.createInventory(null, 45, (ChatColor.DARK_GREEN + "Test Inventory"));


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("inventory")) {
                p.openInventory(gui);
            }
        }
        return false;
    }

}

