package shadow.customplugin.shadow.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import shadow.customplugin.shadow.CustomItems.ItemManager;

public class TeleportGuiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("tpmenu")) {
                final Inventory teleportgui = Bukkit.createInventory(null, 54, (ChatColor.LIGHT_PURPLE + "Teleport Menu"));
                ItemStack dragegg = new ItemStack(Material.DRAGON_EGG);
                ItemMeta metadragegg= dragegg.getItemMeta();
                metadragegg.setDisplayName(ChatColor.RED + "Warp to Dragons");
                dragegg.setItemMeta(metadragegg);

                ItemStack hubspawn = new ItemStack(Material.DRAGON_EGG);
                ItemMeta hubspawnmeta= hubspawn.getItemMeta();
                hubspawnmeta.setDisplayName(ChatColor.RED + "Warp to Hub");
                hubspawn.setItemMeta(hubspawnmeta);
               teleportgui.setItem(0 , dragegg);
               teleportgui.setItem(1 , hubspawn);
                teleportgui.setItem(45, ItemManager.S1blank);
                teleportgui.setItem(46, ItemManager.S1blank);
                teleportgui.setItem(47, ItemManager.S1blank);
                teleportgui.setItem(48, ItemManager.S1blank);
                teleportgui.setItem(49, ItemManager.barrierblank);
                teleportgui.setItem(50, ItemManager.S1blank);
                teleportgui.setItem(51, ItemManager.S1blank);
                teleportgui.setItem(52, ItemManager.S1blank);
                teleportgui.setItem(53, ItemManager.S1blank);
                teleportgui.setItem(3 , ItemManager.oppickaxeitem);
                player.openInventory(teleportgui);
            }
        }
        return true;
    }
}
