package com.kinoko.testplugin.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerlog {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GREEN + "サーバーを移動したいときは");
        player.sendMessage(ChatColor.GREEN + "/menuでサーバーメニューを開けるよ!");
        if (player.hasPlayedBefore()) {
            event.setJoinMessage(player.getName() + ChatColor.GREEN + "がログインしました");
        } else {
            event.setJoinMessage(player.getName() + ChatColor.YELLOW + "が初ログインしました");
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(player.getName() + ChatColor.RED + "がログアウトしました");
    }
}
