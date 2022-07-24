package com.kinoko.testplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class test extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello test");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("test")) {
            sender.sendMessage("test");
            return true;
        }
        return false;
    }
}
