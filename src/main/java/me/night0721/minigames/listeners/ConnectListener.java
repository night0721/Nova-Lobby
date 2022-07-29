package me.night0721.minigames.listeners;

import me.night0721.minigames.managers.ConfigManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ConnectListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().teleport(ConfigManager.getLobbySpawnLocation());
    }

}
