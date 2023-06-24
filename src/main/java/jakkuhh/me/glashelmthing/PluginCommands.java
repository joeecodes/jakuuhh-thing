package jakkuhh.me.glashelmthing;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;


public class PluginCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("it probabl work :heart:");
            return true;
        }


        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("helmet")) {
            player.sendMessage("opened: " + ChatColor.RED + "space heklmet delevierytuye:heart:");
            GuiClass gc = new GuiClass();
            player.openInventory(GuiClass.inv);
        }
        return true;
    }
}


