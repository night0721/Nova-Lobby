package me.night0721.minigames.listeners;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import me.night0721.minigames.Lobby;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class MessageListener implements PluginMessageListener {
    private Lobby main;
    public MessageListener(Lobby main) {
        this.main = main;
    }
    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if(!channel.equals("BungeeCord")) { return; }
        ByteArrayDataInput in = ByteStreams.newDataInput(message);
        String subchannel = in.readUTF();
        if(subchannel.equals("PlayerCount")) {
            String server = in.readUTF();
            System.out.println(in.readInt());
        }

    }
}
