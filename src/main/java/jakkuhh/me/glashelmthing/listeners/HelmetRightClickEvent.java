package jakkuhh.me.glashelmthing.listeners;

import jakkuhh.me.glashelmthing.GlassHelmetPlugin;
import jakkuhh.me.glashelmthing.items.ItemHelmet;
import jakkuhh.me.glashelmthing.runnable.HelmetRotateTask;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class HelmetRightClickEvent implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if (e.getAction() != Action.RIGHT_CLICK_BLOCK || e.getAction() != Action.RIGHT_CLICK_AIR || !e.getPlayer().getActiveItem().equals(new ItemHelmet()))
            return;

        Player p = e.getPlayer();
        ItemStack itemInHand = p.getActiveItem();
        p.getInventory().setHelmet(itemInHand);

        // runnable here
        new HelmetRotateTask(p).runTaskTimerAsynchronously(new GlassHelmetPlugin().getInstance(), 0, 10L);
    }

}
