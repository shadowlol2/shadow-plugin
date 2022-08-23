package shadow.customplugin.shadow.ServerListeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import shadow.customplugin.shadow.Shadow;

public class OnServerPing implements Listener {

    Long timeInSeconds = Long.valueOf(10);
    Long timeInTicks = 20 * timeInSeconds;
    @EventHandler
    public void onServerPing(ServerListPingEvent e) {
        e.setMotd(ChatColor.GREEN + "               Shadow Sandbox  " + ChatColor.RED + "[1.8-1.16]\n                     " + ChatColor.RED + ChatColor.BOLD + "Pets update");
        e.setMaxPlayers(-1);

        new BukkitRunnable() {
            @Override
            public void run() {
                e.setMaxPlayers(-1);
                 e.setMaxPlayers(100);
            }
        }.runTaskTimer((Plugin) this, 10 , 10);
    }


}
