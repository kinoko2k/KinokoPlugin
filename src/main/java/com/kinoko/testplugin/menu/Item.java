package com.kinoko.testplugin.menu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CompassMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Item {

    public static ItemStack getCompass() {
        ItemStack itemStack = new ItemStack(Material.COMPASS);
        CompassMeta compassMeta = (CompassMeta) itemStack.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.LIGHT_PURPLE + "サーバー移動や投票報酬の取得ができます。");
        lore.add(ChatColor.YELLOW.toString());
        lore.add(ChatColor.LIGHT_PURPLE + "メインハンドでの右クリックでメニューを開く");
        compassMeta.setDisplayName(ChatColor.GOLD + "サーバーメニュー ");
        compassMeta.setLodestone(new Location(Bukkit.getWorld("world"), 0, 0, 0));
        compassMeta.setLore(lore);
        itemStack.setItemMeta(compassMeta);
        return itemStack;
    }

    public static ItemStack getBackGround() {
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta itemMeta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        itemMeta.setDisplayName(ChatColor.RED.toString());
        lore.add(ChatColor.LIGHT_PURPLE.toString());
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        return item;
    }
}
