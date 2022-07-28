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
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

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
        getServer().getPluginManager().registerEvents(this, this); //handles the event
        ItemManager.init();
        getCommand("term").setExecutor(new Commands());
        getCommand("RulesSign").setExecutor(new Commands());
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
        final Inventory gui = Bukkit.createInventory(null, 27, (ChatColor.DARK_GREEN + "Rules GUI"));
        ItemStack s1 = new ItemStack(Material.STAINED_GLASS_PANE);

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("rules")) {
                ItemStack[] menu_items = {ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank ,
                        ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.RulesSign , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank ,
                        ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank , ItemManager.S1blank };
                gui.setContents(menu_items);
                p.openInventory(gui);
                p.sendMessage("Please Hover over the rules sign");
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

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equalsIgnoreCase(ChatColor.DARK_GREEN + "Rules GUI")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lRules Menu!")) {
                p.sendMessage("Yeah no u cannot do that :)");
                p.setDisplayName(null);
            }
        }
    }

}


















