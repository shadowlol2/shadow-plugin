package shadow.customplugin.shadow.ServerListeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class OnServerPing implements Listener {
    @EventHandler
    public void onServerPing(ServerListPingEvent e) {
        e.setMotd(ChatColor.GREEN + "               Shadow Sandbox  " + ChatColor.RED + "[1.8-1.16]\n                     " + ChatColor.RED + ChatColor.BOLD + "Pets update");

        e.setMaxPlayers(100);
    }
}
