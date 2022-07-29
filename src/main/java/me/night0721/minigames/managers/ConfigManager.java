package me.night0721.minigames.managers;

import me.night0721.minigames.Lobby;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {
    private static FileConfiguration config;
    public static void setConfig(Lobby main) {
        ConfigManager.config = main.getConfig();
    }
    public static Location getLobbySpawnLocation() {
        return new Location(
                Bukkit.getWorld(config.getString("spawn.world")),
                config.getDouble("spawn.x"),
                config.getDouble("spawn.y"),
                config.getDouble("spawn.z"),
                (float) config.getDouble("spawn.yaw"),
                (float) config.getDouble("spawn.pitch")
        );
    }
}