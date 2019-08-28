package me.rndstad.amigos.utils;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static String format(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static List<String> format(List<String> text) {
        List<String> list = new ArrayList<>();
        for (String line : text) {
            list.add(ChatColor.translateAlternateColorCodes('&', line));
        }
        return list;
    }
}
