package shadow.customplugin.shadow.Commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class ClearChat implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
            Player p = (Player) commandSender;
            if(p.isOp()) {
                if (command.getName().equalsIgnoreCase("clearchat")) {
                    for (int i = 0; i < 10000000; ++i) {
                        Bukkit.broadcastMessage(" ");
                    }
                } else {
                    p.sendMessage("You Cannot do this");
                }
            }
            return false;
        }
    }

