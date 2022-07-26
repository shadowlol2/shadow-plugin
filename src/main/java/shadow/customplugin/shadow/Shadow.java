package shadow.customplugin.shadow;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.Inventory;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.Enchantment;
public final class Shadow extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Loading Plugin!");
        System.out.println("25%");
        System.out.println("50%");
        System.out.println("75%");
        System.out.println("100%");
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
//tt

    //Gives the player a weapon


    // private final Inventory gui = Bukkit.createInventory(null, 45, (ChatColor.DARK_GREEN + "Item GUI"));

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        final Inventory gui = Bukkit.createInventory(null, 9, (ChatColor.DARK_GREEN + "Item GUI"));
        ItemStack swordMETA = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack Armormeta = new ItemStack(Material.DIAMOND_HELMET);
        ItemStack Armormeta1 = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemStack Armormeta2 = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemStack Armormeta3 = new ItemStack(Material.DIAMOND_BOOTS);
        Armormeta2.setAmount(64);
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (cmd.getName().equalsIgnoreCase("inventory")) {
                    ItemStack[] menu_items = {swordMETA, Armormeta, Armormeta1, Armormeta2, Armormeta3};
                    gui.setContents(menu_items);
                    p.openInventory(gui);
                    p.sendMessage("Please Take out an item");
                }
            }
        final Inventory trashgui = Bukkit.createInventory(null, 54, (ChatColor.DARK_GREEN + "Trash GUI"));

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("trash") || cmd.getName().equalsIgnoreCase("bin")) {
                p.openInventory(trashgui);
                p.sendMessage(ChatColor.DARK_RED + "Please Put Your Garbage inside of this gui");
            }
        }
            return false;
        }

    
    
    
    
    












}