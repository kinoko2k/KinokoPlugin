package com.kinoko.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Testplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // ここから //
        getLogger().info("Hello World!");
        // ここまで //
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}