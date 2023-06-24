package jakkuhh.me.glashelmthing;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.block.Action;


import java.util.*;
public class items implements Listener{

    public static ItemStack Jakkuhhhelm;
    private final Glashelmthing plugin = Glashelmthing.getInstance();
    public int i;

    public static void init() {
        createJakkuhhhelm();

    }

    private static void createJakkuhhhelm() {
        ItemStack item = new ItemStack(Material.PINK_STAINED_GLASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);
        item.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setDisplayName(ChatColor.RED + "Space Helmet");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "A rare space helmet forged ");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon glass.");
        lore.add("");
        lore.add(ChatColor.RESET + "" + ChatColor.GRAY + "To: " + ChatColor.GREEN + "Jakkuhh");
        lore.add(ChatColor.RESET + "" + ChatColor.GRAY + "From: " + ChatColor.BLUE + "alcovi");
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "Edition #rawr");
        lore.add(ChatColor.DARK_GRAY + "June 2023");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.BOLD + "SPECIAL HELMET");

        meta.setLore(lore);
        item.setItemMeta(meta);
        Jakkuhhhelm = item;
    }

    @EventHandler
    public void OnRightClick(PlayerInteractEvent e) {

        List<Material> materials = Arrays.asList(Material.PINK_STAINED_GLASS, Material.GREEN_STAINED_GLASS, Material.BLUE_STAINED_GLASS, Material.CYAN_STAINED_GLASS, Material.LIGHT_BLUE_STAINED_GLASS, Material.ORANGE_STAINED_GLASS);

        Player p = e.getPlayer();



        if (e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (p.getInventory().getItemInMainHand().equals("Space Helmet") || p.getInventory().getItemInMainHand().equals(Jakkuhhhelm)) {
                init();
                p.getEquipment().setHelmet(Jakkuhhhelm);
                p.sendMessage("equiped");
                p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);

            }
        }
        Random random = new Random();
        if (p.getEquipment().getHelmet().equals("Space Helmet") || p.getEquipment().getHelmet().equals(Jakkuhhhelm)) {

            i = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
                @Override
                public void run() {
                    int i = random.nextInt(7);
                    Material randomMat = materials.get(random.nextInt(materials.size()));
                    p.getEquipment().setHelmet(new ItemStack(randomMat));
                    ItemStack playerHelmet = p.getInventory().getHelmet();
                    playerHelmet.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
                    p.getInventory().setHelmet(playerHelmet);

                    if (p.getEquipment().getHelmet().getType().equals(Material.AIR)) {

                        Bukkit.getServer().getScheduler().cancelTasks(plugin);
                    }
                }
            }, 0L, 5L);
        }
    }

            @EventHandler
            public void onJakkuhhhelmClick(InventoryClickEvent e1){

                if (e1.getRawSlot() == 5 && e1.getCurrentItem().getType() == (Material.PINK_STAINED_GLASS) || e1.getCurrentItem().getType() == (Material.GREEN_STAINED_GLASS) || e1.getCurrentItem().getType() == (Material.BLUE_STAINED_GLASS) || e1.getCurrentItem().getType() == (Material.CYAN_STAINED_GLASS) || e1.getCurrentItem().getType() == (Material.LIGHT_BLUE_STAINED_GLASS) || e1.getCurrentItem().getType() == (Material.ORANGE_STAINED_GLASS)) {
                    e1.setCurrentItem(Jakkuhhhelm);

                    Bukkit.getServer().getScheduler().cancelTask(i);
                }

            }
        }

