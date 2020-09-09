package com.krazzzzymonkey.antismoothchat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class AntiSmoothChat extends JavaPlugin implements Listener {

    private static final Map<String, String> blacklist = initBlacklist();

    private static Map<String, String> initBlacklist() {

        Map<String, String> blacklist = new HashMap<>();

        // Circle Unicode
        blacklist.put("ⓐ", "a");
        blacklist.put("ⓑ", "b");
        blacklist.put("ⓒ", "c");
        blacklist.put("ⓓ", "d");
        blacklist.put("ⓔ", "e");
        blacklist.put("ⓕ", "f");
        blacklist.put("ⓖ", "g");
        blacklist.put("ⓗ", "h");
        blacklist.put("ⓘ", "i");
        blacklist.put("ⓙ", "j");
        blacklist.put("ⓚ", "k");
        blacklist.put("ⓛ", "l");
        blacklist.put("ⓜ", "m");
        blacklist.put("ⓝ", "n");
        blacklist.put("ⓞ", "o");
        blacklist.put("ⓟ", "p");
        blacklist.put("ⓠ", "q");
        blacklist.put("ⓡ", "r");
        blacklist.put("ⓢ", "s");
        blacklist.put("ⓣ", "t");
        blacklist.put("ⓤ", "u");
        blacklist.put("ⓥ", "v");
        blacklist.put("ⓦ", "w");
        blacklist.put("ⓧ", "x");
        blacklist.put("ⓨ", "y");
        blacklist.put("ⓩ", "z");
        blacklist.put("Ⓐ", "A");
        blacklist.put("Ⓑ", "B");
        blacklist.put("Ⓒ", "C");
        blacklist.put("Ⓓ", "D");
        blacklist.put("Ⓔ", "E");
        blacklist.put("Ⓕ", "F");
        blacklist.put("Ⓖ", "G");
        blacklist.put("Ⓗ", "H");
        blacklist.put("Ⓘ", "I");
        blacklist.put("Ⓙ", "J");
        blacklist.put("Ⓚ", "K");
        blacklist.put("Ⓛ", "L");
        blacklist.put("Ⓜ", "M");
        blacklist.put("Ⓝ", "N");
        blacklist.put("Ⓞ", "O");
        blacklist.put("Ⓟ", "P");
        blacklist.put("Ⓠ", "Q");
        blacklist.put("Ⓡ", "R");
        blacklist.put("Ⓢ", "S");
        blacklist.put("Ⓣ", "T");
        blacklist.put("Ⓤ", "U");
        blacklist.put("Ⓥ", "V");
        blacklist.put("Ⓦ", "W");
        blacklist.put("Ⓧ", "X");
        blacklist.put("Ⓨ", "Y");
        blacklist.put("Ⓩ", "Z");

        // Parentheses
        blacklist.put("⒜", "a");
        blacklist.put("⒝", "b");
        blacklist.put("⒞", "c");
        blacklist.put("⒟", "d");
        blacklist.put("⒠", "e");
        blacklist.put("⒡", "f");
        blacklist.put("⒢", "g");
        blacklist.put("⒣", "h");
        blacklist.put("⒤", "i");
        blacklist.put("⒥", "j");
        blacklist.put("⒦", "k");
        blacklist.put("⒧", "l");
        blacklist.put("⒨", "m");
        blacklist.put("⒩", "n");
        blacklist.put("⒪", "o");
        blacklist.put("⒫", "p");
        blacklist.put("⒬", "q");
        blacklist.put("⒭", "r");
        blacklist.put("⒮", "s");
        blacklist.put("⒯", "t");
        blacklist.put("⒰", "u");
        blacklist.put("⒱", "v");
        blacklist.put("⒲", "w");
        blacklist.put("⒳", "x");
        blacklist.put("⒴", "y");
        blacklist.put("⒵", "z");

        // Smooth Unicode
        blacklist.put("ａ", "a");
        blacklist.put("ｂ", "b");
        blacklist.put("ｃ", "c");
        blacklist.put("ｄ", "d");
        blacklist.put("ｅ", "e");
        blacklist.put("ｆ", "f");
        blacklist.put("ｇ", "g");
        blacklist.put("ｈ", "h");
        blacklist.put("ｉ", "i");
        blacklist.put("ｊ", "j");
        blacklist.put("ｋ", "k");
        blacklist.put("ｌ", "l");
        blacklist.put("ｍ", "m");
        blacklist.put("ｎ", "n");
        blacklist.put("ｏ", "o");
        blacklist.put("ｐ", "p");
        blacklist.put("ｑ", "q");
        blacklist.put("ｒ", "r");
        blacklist.put("ｓ", "s");
        blacklist.put("ｔ", "t");
        blacklist.put("ｕ", "u");
        blacklist.put("ｖ", "v");
        blacklist.put("ｗ", "w");
        blacklist.put("ｘ", "x");
        blacklist.put("ｙ", "y");
        blacklist.put("ｚ", "z");
        blacklist.put("Ａ", "A");
        blacklist.put("Ｂ", "B");
        blacklist.put("Ｃ", "C");
        blacklist.put("Ｄ", "D");
        blacklist.put("Ｅ", "E");
        blacklist.put("Ｆ", "F");
        blacklist.put("Ｇ", "G");
        blacklist.put("Ｈ", "H");
        blacklist.put("Ｉ", "I");
        blacklist.put("Ｊ", "J");
        blacklist.put("Ｋ", "K");
        blacklist.put("Ｌ", "L");
        blacklist.put("Ｍ", "M");
        blacklist.put("Ｎ", "N");
        blacklist.put("Ｏ", "O");
        blacklist.put("Ｐ", "P");
        blacklist.put("Ｑ", "Q");
        blacklist.put("Ｒ", "R");
        blacklist.put("Ｓ", "S");
        blacklist.put("Ｔ", "T");
        blacklist.put("Ｕ", "U");
        blacklist.put("Ｖ", "V");
        blacklist.put("Ｗ", "W");
        blacklist.put("Ｘ", "X");
        blacklist.put("Ｙ", "Y");
        blacklist.put("Ｚ", "Z");

        // Added numbers as well
        blacklist.put("１", "1");
        blacklist.put("２", "2");
        blacklist.put("３", "3");
        blacklist.put("４", "4");
        blacklist.put("５", "5");
        blacklist.put("６", "6");
        blacklist.put("７", "7");
        blacklist.put("８", "8");
        blacklist.put("９", "9");
        blacklist.put("０", "0");

        return blacklist;

    }

    @Override
    public void onEnable() {

        System.out.println(ConsoleColors.CYAN_BOLD + "========================" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "Starting AntiSmoothChat!" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN_BOLD + "========================" + ConsoleColors.RESET);

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onChat(AsyncPlayerChatEvent e) {

        // return if the sender isnt online (admin doing voodoo or smthg...)
        if (getServer().getOnlinePlayers().stream().noneMatch(player -> player.getUniqueId().equals(e.getPlayer().getUniqueId()))) {
            return;
        }

        String cleanMessage = replaceBlacklisted(e.getMessage());
        if (!e.getMessage().equals(cleanMessage)) {
            e.setMessage(cleanMessage);
        }

    }

    private String replaceBlacklisted(String message) {
        for (Map.Entry<String, String> blacklisted : blacklist.entrySet()) {
            message = message.replaceAll(blacklisted.getKey(), blacklisted.getValue());
        }
        return message;
    }

}
