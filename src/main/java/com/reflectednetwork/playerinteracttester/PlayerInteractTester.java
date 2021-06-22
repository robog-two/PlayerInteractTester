package com.reflectednetwork.playerinteracttester;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.peer.LabelPeer;

public final class PlayerInteractTester extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void playerInteract(PlayerInteractEvent event) {
        event.getPlayer().sendMessage(Component.text("You triggered an interact event!"));
    }
}
