package jakkuhh.me.glashelmthing.listeners;

import jakkuhh.me.glashelmthing.items.ItemHelmet;
import jakkuhh.me.glashelmthing.runnable.HelmetRotateTask;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

import java.util.Objects;

public class HelmetUnequipEvent implements Listener {

    @EventHandler
    public void helmetUnequipEvent(InventoryClickEvent e) {
        if (e.getSlotType() == InventoryType.SlotType.ARMOR && Objects.equals(e.getCurrentItem(), new ItemHelmet())) {
            new HelmetRotateTask(null).cancel();
        }
    }
}
