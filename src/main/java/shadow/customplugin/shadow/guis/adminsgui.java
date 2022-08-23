package shadow.customplugin.shadow.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import shadow.customplugin.shadow.CustomItems.ItemManager;
import shadow.customplugin.shadow.CustomMobs.EntityTypes;
import shadow.customplugin.shadow.CustomMobs.TestMob;
import shadow.customplugin.shadow.CustomMobs.TestMobs;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class adminsgui implements CommandExecutor {





  @Override
  public boolean onCommand (CommandSender commandSender, Command command, String s, String[]strings){
   Player p = (Player) commandSender;

   if (p.hasPermission("shadow.admingui")) {
    if (command.getName().equalsIgnoreCase("admingui")) {
     Inventory adminsguii = Bukkit.createInventory(null, 54, (ChatColor.DARK_GREEN + "Admins GUI"));
     adminsguii.setItem(45, ItemManager.S1blank);
     adminsguii.setItem(46, ItemManager.S1blank);
     adminsguii.setItem(47, ItemManager.S1blank);
     adminsguii.setItem(48, ItemManager.S1blank);
     adminsguii.setItem(49, ItemManager.barrierblank);
     adminsguii.setItem(50, ItemManager.S1blank);
     adminsguii.setItem(51, ItemManager.S1blank);
     adminsguii.setItem(52, ItemManager.S1blank);
     adminsguii.setItem(53, ItemManager.S1blank);
     p.openInventory(adminsguii);
     Location loc = p.getLocation();
     EntityTypes.spawnEntity(new TestMobs(Bukkit.getWorld("world")), p.getLocation());
    }
   }

   return false;
  }
 }

