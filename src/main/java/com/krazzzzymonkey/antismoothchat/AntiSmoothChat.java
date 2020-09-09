package com.krazzzzymonkey.antismoothchat;

import org.bukkit.entity.Player;
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

        blacklist.put("ⓕ", "f");

        //Circle Unicode
        blacklist.put("\u24D0", "a");
        blacklist.put("\u24D1", "b");
        blacklist.put("\u24D2", "c");
        blacklist.put("\u24D3", "d");
        blacklist.put("\u24D4", "e");
        blacklist.put("\u24D5", "f");
        blacklist.put("\u24D6", "g");
        blacklist.put("\u24D7", "h");
        blacklist.put("\u24D8", "i");
        blacklist.put("\u24D9", "j");
        blacklist.put("\u24DA", "k");
        blacklist.put("\u24DB", "l");
        blacklist.put("\u24DC", "m");
        blacklist.put("\u24DD", "n");
        blacklist.put("\u24DE", "o");
        blacklist.put("\u24DF", "p");
        blacklist.put("\u24E0", "q");
        blacklist.put("\u24E1", "r");
        blacklist.put("\u24E2", "s");
        blacklist.put("\u24E3", "t");
        blacklist.put("\u24E4", "u");
        blacklist.put("\u24E5", "v");
        blacklist.put("\u24E6", "w");
        blacklist.put("\u24E7", "x");
        blacklist.put("\u24E8", "y");
        blacklist.put("\u24E9", "z");

        blacklist.put("\u24B6", "A");
        blacklist.put("\u24B7", "B");
        blacklist.put("\u24B8", "C");
        blacklist.put("\u24B9", "D");
        blacklist.put("\u24BA", "E");
        blacklist.put("\u24BB", "F");
        blacklist.put("\u24BC", "G");
        blacklist.put("\u24BD", "H");
        blacklist.put("\u24BE", "I");
        blacklist.put("\u24BF", "J");
        blacklist.put("\u24DA", "K");
        blacklist.put("\u24DB", "L");
        blacklist.put("\u24DC", "M");
        blacklist.put("\u24DD", "N");
        blacklist.put("\u24DE", "O");
        blacklist.put("\u24DF", "P");
        blacklist.put("\u24C6", "Q");
        blacklist.put("\u24C7", "R");
        blacklist.put("\u24C8", "S");
        blacklist.put("\u24C9", "T");
        blacklist.put("\u24CA", "U");
        blacklist.put("\u24CB", "V");
        blacklist.put("\u24CC", "W");
        blacklist.put("\u24CD", "X");
        blacklist.put("\u24CE", "Y");
        blacklist.put("\u24CF", "Z");

        //Smooth Unicode
        blacklist.put("\uFF41", "a");
        blacklist.put("\uFF42", "b");
        blacklist.put("\uFF43", "c");
        blacklist.put("\uFF44", "d");
        blacklist.put("\uFF45", "e");
        blacklist.put("\uFF46", "f");
        blacklist.put("\uFF47", "g");
        blacklist.put("\uFF48", "h");
        blacklist.put("\uFF49", "i");
        blacklist.put("\uFF4A", "j");
        blacklist.put("\uFF4B", "k");
        blacklist.put("\uFF4C", "l");
        blacklist.put("\uFF4D", "m");
        blacklist.put("\uFF4E", "n");
        blacklist.put("\uFF4F", "o");
        blacklist.put("\uFF50", "p");
        blacklist.put("\uFF51", "q");
        blacklist.put("\uFF52", "r");
        blacklist.put("\uFF53", "s");
        blacklist.put("\uFF54", "t");
        blacklist.put("\uFF55", "u");
        blacklist.put("\uFF56", "v");
        blacklist.put("\uFF57", "w");
        blacklist.put("\uFF58", "x");
        blacklist.put("\uFF59", "y");
        blacklist.put("\uFF5A", "z");

        blacklist.put("\uFF21", "A");
        blacklist.put("\uFF22", "B");
        blacklist.put("\uFF23", "C");
        blacklist.put("\uFF24", "D");
        blacklist.put("\uFF25", "E");
        blacklist.put("\uFF26", "F");
        blacklist.put("\uFF27", "G");
        blacklist.put("\uFF28", "H");
        blacklist.put("\uFF29", "I");
        blacklist.put("\uFF2A", "J");
        blacklist.put("\uFF2B", "K");
        blacklist.put("\uFF2C", "L");
        blacklist.put("\uFF2D", "M");
        blacklist.put("\uFF2E", "N");
        blacklist.put("\uFF2F", "O");
        blacklist.put("\uFF30", "P");
        blacklist.put("\uFF31", "Q");
        blacklist.put("\uFF32", "R");
        blacklist.put("\uFF33", "S");
        blacklist.put("\uFF34", "T");
        blacklist.put("\uFF35", "U");
        blacklist.put("\uFF36", "V");
        blacklist.put("\uFF37", "W");
        blacklist.put("\uFF38", "X");
        blacklist.put("\uFF39", "Y");
        blacklist.put("\uFF3A", "Z");

        // Added numbers as well
        blacklist.put("\uFF11", "1");
        blacklist.put("\uFF12", "2");
        blacklist.put("\uFF13", "3");
        blacklist.put("\uFF14", "4");
        blacklist.put("\uFF15", "5");
        blacklist.put("\uFF16", "6");
        blacklist.put("\uFF17", "7");
        blacklist.put("\uFF18", "8");
        blacklist.put("\uFF19", "9");
        blacklist.put("\uFF10", "0");

        return blacklist;

    }

    @Override
    public void onEnable() {

        System.out.println(ConsoleColors.CYAN_BOLD + "===================================" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "Starting AntiSmooth (╯°□°）╯︵¡ʇɐɥƆ" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN_BOLD + "===================================" + ConsoleColors.RESET);

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onChat(AsyncPlayerChatEvent e) {

        Player sender = e.getPlayer();

        // return if the sender isnt online (admin doing voodoo or smthg...)
        if (getServer().getOnlinePlayers().stream().noneMatch(player -> player.getName().equals(sender.getName()))) {
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
