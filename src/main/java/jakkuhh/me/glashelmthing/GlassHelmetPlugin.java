package jakkuhh.me.glashelmthing;

import games.negative.framework.BasePlugin;
import games.negative.framework.commands.CommandBuilder;
import jakkuhh.me.glashelmthing.commands.CommandHelmet;
import jakkuhh.me.glashelmthing.listeners.HelmetRightClickEvent;
import jakkuhh.me.glashelmthing.listeners.HelmetUnequipEvent;
import lombok.Getter;


public final class GlassHelmetPlugin extends BasePlugin {

    @Getter
    public GlassHelmetPlugin instance;


    @Override
    public void onEnable() {
        // Plugin startup logic
        super.onEnable();
        this.instance = this;

        registerCommand(new CommandBuilder(new CommandHelmet()).description("Open helmet gui").name("helmet").playerOnly());
        registerListeners(new HelmetRightClickEvent(), new HelmetUnequipEvent());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
