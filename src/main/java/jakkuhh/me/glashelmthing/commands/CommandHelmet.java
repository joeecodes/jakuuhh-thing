package jakkuhh.me.glashelmthing.commands;


import games.negative.framework.commands.Command;
import games.negative.framework.commands.Context;
import jakkuhh.me.glashelmthing.items.ItemHelmet;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandHelmet implements Command {
    @Override
    public void execute(@NotNull Context context) {
        Player player = context.getPlayer();

        player.sendMessage("Received the helmet");
        player.getInventory().addItem(new ItemHelmet());


    }
}
