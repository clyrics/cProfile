package com.climpy.profile.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class C {
    public static String color(final String mesaj) {
        return ChatColor.translateAlternateColorCodes('&', mesaj);
    }
}
