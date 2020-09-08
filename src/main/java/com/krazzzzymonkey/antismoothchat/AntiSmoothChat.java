package com.krazzzzymonkey.antismoothchat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Note;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSmoothChat extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ConsoleColors.CYAN_BOLD + "=================================" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "Starting AntiSmoothChat!");
        System.out.println(ConsoleColors.CYAN_BOLD + "=================================" + ConsoleColors.RESET);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        String message = e.getMessage(); //get the message

        e.setCancelled(true); //cancel the event, so no message is sent (yet)

        for(Player on : Bukkit.getOnlinePlayers()){ //loop threw all online players
            if(message.contains(on.getName())){ //check if the message contains the player's name
                on.sendMessage(message); //send sender the unicode message
            }

            else{
                String cleanMessage = message //format unicode out of the message

                        //Circle Unicode
                        .replace("\u24D0", "a")
                        .replace("\u24D1", "b")
                        .replace("\u24D2", "c")
                        .replace("\u24D3", "d")
                        .replace("\u24D4", "e")
                        .replace("\u24D5", "f")
                        .replace("\u24D6", "g")
                        .replace("\u24D7", "h")
                        .replace("\u24D8", "i")
                        .replace("\u24D9", "j")
                        .replace("\u24DA", "k")
                        .replace("\u24DB", "l")
                        .replace("\u24DC", "m")
                        .replace("\u24DD", "n")
                        .replace("\u24DE", "o")
                        .replace("\u24DF", "p")
                        .replace("\u24E0", "q")
                        .replace("\u24E1", "r")
                        .replace("\u24E2", "s")
                        .replace("\u24E3", "t")
                        .replace("\u24E4", "u")
                        .replace("\u24E5", "v")
                        .replace("\u24E6", "w")
                        .replace("\u24E7", "x")
                        .replace("\u24E8", "y")
                        .replace("\u24E9", "z")

                        .replace("\u24B6", "A")
                        .replace("\u24B7", "B")
                        .replace("\u24B8", "C")
                        .replace("\u24B9", "D")
                        .replace("\u24BA", "E")
                        .replace("\u24BB", "F")
                        .replace("\u24BC", "G")
                        .replace("\u24BD", "H")
                        .replace("\u24BE", "I")
                        .replace("\u24BF", "J")
                        .replace("\u24DA", "K")
                        .replace("\u24DB", "L")
                        .replace("\u24DC", "M")
                        .replace("\u24DD", "N")
                        .replace("\u24DE", "O")
                        .replace("\u24DF", "P")
                        .replace("\u24C6", "Q")
                        .replace("\u24C7", "R")
                        .replace("\u24C8", "S")
                        .replace("\u24C9", "T")
                        .replace("\u24CA", "U")
                        .replace("\u24CB", "V")
                        .replace("\u24CC", "W")
                        .replace("\u24CD", "X")
                        .replace("\u24CE", "Y")
                        .replace("\u24CF", "Z")

                        //Smooth Unicode
                        .replace("\uFF41", "a")
                        .replace("\uFF42", "b")
                        .replace("\uFF43", "c")
                        .replace("\uFF44", "d")
                        .replace("\uFF45", "e")
                        .replace("\uFF46", "f")
                        .replace("\uFF47", "g")
                        .replace("\uFF48", "h")
                        .replace("\uFF49", "i")
                        .replace("\uFF4A", "j")
                        .replace("\uFF4B", "k")
                        .replace("\uFF4C", "l")
                        .replace("\uFF4D", "m")
                        .replace("\uFF4E", "n")
                        .replace("\uFF4F", "o")
                        .replace("\uFF50", "p")
                        .replace("\uFF51", "q")
                        .replace("\uFF52", "r")
                        .replace("\uFF53", "s")
                        .replace("\uFF54", "t")
                        .replace("\uFF55", "u")
                        .replace("\uFF56", "v")
                        .replace("\uFF57", "w")
                        .replace("\uFF58", "x")
                        .replace("\uFF59", "y")
                        .replace("\uFF5A", "z")

                        .replace("\uFF21", "A")
                        .replace("\uFF22", "B")
                        .replace("\uFF23", "C")
                        .replace("\uFF24", "D")
                        .replace("\uFF25", "E")
                        .replace("\uFF26", "F")
                        .replace("\uFF27", "G")
                        .replace("\uFF28", "H")
                        .replace("\uFF29", "I")
                        .replace("\uFF2A", "J")
                        .replace("\uFF2B", "K")
                        .replace("\uFF2C", "L")
                        .replace("\uFF2D", "M")
                        .replace("\uFF2E", "N")
                        .replace("\uFF2F", "O")
                        .replace("\uFF30", "P")
                        .replace("\uFF31", "Q")
                        .replace("\uFF32", "R")
                        .replace("\uFF33", "S")
                        .replace("\uFF34", "T")
                        .replace("\uFF35", "U")
                        .replace("\uFF36", "V")
                        .replace("\uFF37", "W")
                        .replace("\uFF38", "X")
                        .replace("\uFF39", "Y")
                        .replace("\uFF3A", "Z")

                        // Added numbers as well
                        .replace("\uFF11", "1")
                        .replace("\uFF12", "2")
                        .replace("\uFF13", "3")
                        .replace("\uFF14", "4")
                        .replace("\uFF15", "5")
                        .replace("\uFF16", "6")
                        .replace("\uFF17", "7")
                        .replace("\uFF18", "8")
                        .replace("\uFF19", "9")
                        .replace("\uFF10", "0");

                on.sendMessage(cleanMessage); //Send clean message to the rest of the players
            }
        }
    }
}
