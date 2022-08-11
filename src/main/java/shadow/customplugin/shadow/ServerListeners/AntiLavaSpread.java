package shadow.customplugin.shadow.ServerListeners;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

public class AntiLavaSpread implements Listener {

    @EventHandler
    public void onBlockIgnite(BlockIgniteEvent event) {


        if(event.getCause().equals(BlockIgniteEvent.IgniteCause.EXPLOSION)) {
            event.setCancelled(true);
        }
        if(event.getCause().equals(BlockIgniteEvent.IgniteCause.FLINT_AND_STEEL)) {
            event.setCancelled(true);
        }
        if(event.getCause().equals(BlockIgniteEvent.IgniteCause.SPREAD)) {
            event.setCancelled(true);
        }
        if(event.getCause().equals(BlockIgniteEvent.IgniteCause.FIREBALL)) {
            event.setCancelled(true);
        }
        if(event.getCause().equals(BlockIgniteEvent.IgniteCause.LIGHTNING)) {
            event.setCancelled(true);
        }
    }
}
