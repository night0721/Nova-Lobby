package me.night0721.minigames.commands;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import me.night0721.minigames.Lobby;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    private Lobby main;
    public TestCommand(Lobby main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("PlayerCount");
        out.writeUTF("Skywars");
        Player player = Bukkit.getPlayerExact("MizukiHK");
        player.sendPluginMessage(main, "BungeeCord", out.toByteArray());
        return false;
    }
}
