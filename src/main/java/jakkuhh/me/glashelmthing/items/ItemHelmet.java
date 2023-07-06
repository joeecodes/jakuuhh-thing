package jakkuhh.me.glashelmthing.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;

public class ItemHelmet extends ItemStack {

    public ItemHelmet() {
        super.setItemMeta(getHelmetMeta(this));
        super.setType(Material.BLACK_STAINED_GLASS);
    }

    private ItemMeta getHelmetMeta(ItemStack itemStack) {
        ItemMeta im = itemStack.getItemMeta();
        im.setDisplayName(Color.RED + "Space Helmet");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + String.valueOf(ChatColor.ITALIC) + "A rare space helmet forged ");
        lore.add(ChatColor.GRAY + String.valueOf(ChatColor.ITALIC) + "from shards of moon glass.");
        lore.add("");
        lore.add(ChatColor.RESET + String.valueOf(ChatColor.GRAY) + "To: " + ChatColor.GREEN + "Jakkuhh");
        lore.add(ChatColor.RESET + String.valueOf(ChatColor.GRAY) + "From: " + ChatColor.BLUE + "alcovi");
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "Edition #rawr");
        lore.add(ChatColor.DARK_GRAY + "June 2023");
        lore.add("");
        lore.add(ChatColor.RED + String.valueOf(ChatColor.BOLD) + ChatColor.BOLD + "SPECIAL HELMET");
        im.setLore(lore);

        return im;
    }
}

