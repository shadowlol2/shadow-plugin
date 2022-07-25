package shadow.customplugin.shadow;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Shadow extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Shadow Plugin has start!");
        getServer().getPluginManager().registerEvents(this, this); //handles the events
    }


@EventHandler
public void onPlayerJoin(PlayerJoinEvent event) {
    System.out.println("A player has joined the server");
    event.setJoinMessage(null); //Custom welcome message


    
}
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent event) {
        event.setCancelled(true);
    } //disables blocks breaking



@EventHandler(priority = EventPriority.HIGHEST)
public void onBlockPlace(BlockPlaceEvent event) {
    event.setCancelled(true);
} //disables block placing




}