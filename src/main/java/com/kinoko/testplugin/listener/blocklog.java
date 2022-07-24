package com.kinoko.testplugin.listener;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.permissions.Permissible;

public class blocklog {

    @EventHandler
    public void onBlockLog(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        Block block = e.getBlock();

        StringBuilder builder = new StringBuilder(ChatColor.GRAY + "[BlockLog]");
        builder.append(" ").append(block.toString()).append(" ");

        player = player.getPlayer();
        player.sendMessage(builder.toString());
    }
}
