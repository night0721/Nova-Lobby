package me.night0721.minigames;

import me.night0721.minigames.commands.TestCommand;
import me.night0721.minigames.listeners.ConnectListener;
import me.night0721.minigames.listeners.MessageListener;
import me.night0721.minigames.managers.ConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lobby extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        ConfigManager.setConfig(this);
        Bukkit.getPluginManager().registerEvents(new ConnectListener(), this);
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", new MessageListener(this));
        getCommand("test").setExecutor(new TestCommand(this));
    }
    @Override
    public void onDisable() {
        getServer().getMessenger().unregisterOutgoingPluginChannel(this);
        getServer().getMessenger().unregisterIncomingPluginChannel(this);
    }
}
