package shadow.customplugin.shadow.Commands;


import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import shadow.customplugin.shadow.CustomItems.ItemManager;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp()) {
                if (cmd.getName().equalsIgnoreCase("term")) {
                    player.getInventory().addItem(ItemManager.TripleShotBow);
                    player.getInventory().addItem(ItemManager.bobsword);
                }
                if (cmd.getName().equalsIgnoreCase("RulesSign")) {
                    player.getInventory().addItem(ItemManager.RulesSign);
                }
                if (cmd.getName().equalsIgnoreCase("kill")) {
                    player.setMaxHealth(10000000);
                    player.setHealth(99);


                    player.sendMessage("Hhehehe Gave u alot of health enjoy");
                }
                if (cmd.getName().equalsIgnoreCase("boss1")) {
                    Giant zombie = (Giant) player.getWorld().spawn(player.getLocation(), Giant.class);
                    zombie.setMaxHealth(2048);
                    zombie.setHealth(2048);
                    ItemStack stick = new ItemStack(Material.STICK);
                    zombie.getEquipment().setBoots(new ItemStack(ItemManager.boots()));
                    // zombie.getEquipment().setHelmet(new ItemStack(ItemManager.));
                    zombie.getEquipment().setChestplate(new ItemStack(ItemManager.chest()));
                    zombie.getEquipment().setLeggings(new ItemStack(ItemManager.leggings()));
                    zombie.getEquipment().setItemInHand(stick);
                    zombie.setCustomName("Shadow Giant");
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 1));
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 1));
                }
                if (cmd.getName().equalsIgnoreCase("boss2")) {
                    Zombie zombie = (Zombie) player.getWorld().spawn(player.getLocation(), Zombie.class);
                    zombie.setMaxHealth(15000000);
                    zombie.setHealth(15000000);
                    ItemStack stick = new ItemStack(Material.STICK);
                    zombie.getEquipment().setBoots(new ItemStack(ItemManager.boots()));
                    // zombie.getEquipment().setHelmet(new ItemStack(ItemManager.));
                    zombie.getEquipment().setChestplate(new ItemStack(ItemManager.chest()));
                    zombie.getEquipment().setLeggings(new ItemStack(ItemManager.leggings()));
                    zombie.getEquipment().setItemInHand(stick);
                    zombie.setCustomName("Shadow Giant " + zombie.getHealth());
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 1));
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 1));
                    zombie.setBaby(false);
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10000, 10000));
                    zombie.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1000, 1000000));
                      zombie.teleport(player.getLocation())   ;
                }

                if (cmd.getName().equalsIgnoreCase("reloadserver")) {
                    player.getServer().shutdown();
                }
            } else {


                sender.sendMessage("Only Opped Players Can do this sorry");
            }
            if (cmd.getName().equalsIgnoreCase("hub")) {
                Location location = new Location(player.getWorld(), -2.5, 70, -67.5, 180, 0);
                player.teleport(location);
                player.sendMessage(ChatColor.RED + "§lTeleported you to Hub");
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 1));

            }
            if (cmd.getName().equalsIgnoreCase("dragons")) {
                Location location = new Location(player.getWorld(), -604, 22, -275, 90, 2);
                player.teleport(location);
                player.sendMessage(ChatColor.RED + "§lTeleported you to Dragons Nest");
            }

            if (player.hasPermission("shadow.gmc")) {
                if (cmd.getName().equalsIgnoreCase("gmc")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.RED + "§l[Shadow Plugin] Set Your Game mode to " + player.getGameMode());
                } else {
                    if (!player.hasPermission("shadow.gmc")) {
                        player.sendMessage(ChatColor.RED + "You Cannot do that Sorry");
                    }
                }
                if (player.hasPermission("shadow.gms")) {
                    if (cmd.getName().equalsIgnoreCase("gms")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.RED + "§l[Shadow Plugin] Set Your Game mode to " + player.getGameMode());
                    } else {
                        if (!player.hasPermission("shadow.gms")) {
                            player.sendMessage(ChatColor.RED + "You Cannot do that Sorry");
                        }
                    }

                }
                String shadowpluginflex = ChatColor.translateAlternateColorCodes('&', "&c&l[Shadow Plugin] ");
                if(player.hasPermission("shadow.fly")) {
                    if(cmd.getName().contains("fly-on")) {
                        player.setAllowFlight(true);
                        player.sendMessage(shadowpluginflex + "§c§lSET YOUR FLIGHT TO TRUE");
                    }
                }
              //  String shadowpluginflex = ChatColor.translateAlternateColorCodes('&', "&c&l[Shadow Plugin]");
                if(player.hasPermission("shadow.fly")) {
                    if(cmd.getName().contains("fly-off")) {
                        player.setAllowFlight(false);
                        player.sendMessage(shadowpluginflex + "§c§lSET YOUR FLIGHT TO FALSE");
                    }
                }
                if(player.hasPermission("shadow.fly")) {
                    if(cmd.getName().equalsIgnoreCase("fly")) {
                        player.sendMessage(shadowpluginflex + "§c§lUsage /fly-(off-on)");
                    }
                }

            } else {
                sender.sendMessage("Only Players Can do this sorry");
                return true;
            }

        }

        return true;
    }
}