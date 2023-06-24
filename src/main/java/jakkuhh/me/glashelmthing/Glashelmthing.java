package jakkuhh.me.glashelmthing;

import org.bukkit.plugin.java.JavaPlugin;


public final class Glashelmthing extends JavaPlugin {
    private static Glashelmthing instance;

    public static Glashelmthing getInstance() {
        return Glashelmthing.instance;
    }


    @Override
    public void onEnable() {
        // Plugin startup logic
        Glashelmthing.instance = this;
        items.init();

        PluginCommands commands = new PluginCommands();
        getCommand("helmet").setExecutor(commands);


        getServer().getPluginManager().registerEvents(new items(), this);
        getServer().getPluginManager().registerEvents(new GuiClass(), this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
