package com.kinoko.testplugin.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class asa extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("/asaを使用しました。");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (sender.hasPermission("testplugin.op")) {
        if (cmd.getName().equalsIgnoreCase("asa")) {
            sender.sendMessage("朝に変更します。");
            if(cmd.getName().equalsIgnoreCase("day")) {
                Player p = (Player) sender;

                if (args.length == 0) {

                    p.getLocation().getWorld().setTime(1000);
                    p.sendMessage(ChatColor.GREEN + "朝に時間を変更しました。");

                } else if (args.length == 1) {

                    if (args[0].equalsIgnoreCase("all")) {

                        for (World world : Bukkit.getServer().getWorlds()) {

                            world.setTime(1000);
                        }
                        p.sendMessage(ChatColor.GREEN + "すべてのワールドを朝に変更しました。");
                    }
                }
            }
            return true;
        } else {
            sender.sendMessage(ChatColor.RED + "OP権限しか使えません。");
        }
            return true;
        }
        return false;
    }
}
