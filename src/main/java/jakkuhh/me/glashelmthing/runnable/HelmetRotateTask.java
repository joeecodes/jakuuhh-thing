package jakkuhh.me.glashelmthing.runnable;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class HelmetRotateTask extends BukkitRunnable {

    private final Player player;
    private final List<Material> types = new ArrayList<>();
    private int count = 0;

    public HelmetRotateTask(Player player) {
        this.player = player;
        types.add(Material.BLACK_STAINED_GLASS);
        types.add(Material.BLUE_STAINED_GLASS);
        types.add(Material.RED_STAINED_GLASS);
        types.add(Material.GREEN_STAINED_GLASS);
        types.add(Material.YELLOW_STAINED_GLASS);
        types.add(Material.LIME_STAINED_GLASS);
        types.add(Material.PURPLE_STAINED_GLASS);
    }

    @Override
    public void run() {
        if (player == null) return;

        ItemStack helmet = player.getInventory().getHelmet();
        if (helmet == null) return;
        helmet.setType(types.get(count));
        count++;
        if (count >= types.size()) {
            count = 0;
        }
    }
}
