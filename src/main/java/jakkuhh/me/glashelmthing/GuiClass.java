package jakkuhh.me.glashelmthing;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
public class GuiClass implements Listener {

    public static Inventory inv;

    public GuiClass() {
        inv = Bukkit.createInventory(null, 9, "Items");
        initializeItems();
    }
    public void initializeItems() {
        inv.addItem(items.Jakkuhhhelm);
    }
    @EventHandler
    public void onInventoryClick(InventoryDragEvent e1) {

        if (e1.getInventory().equals(inv)) {
            e1.setCancelled(true);

        }
    }
    @EventHandler
    public void onInvClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().equals(inv)) {

            if (e.getCurrentItem().equals(items.Jakkuhhhelm)) {
                e.setCancelled(true);
                p.getInventory().addItem(items.Jakkuhhhelm);
            }
        }
    }
}
