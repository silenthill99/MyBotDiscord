package fr.silenthill99.monbotdiscord;

import fr.silenthill99.monbotdiscord.utils.configManager;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import java.io.File;

public class Main
{
    private static DiscordApi api;
    private static configManager configManager;
    public static void main(String[] args) {
        configManager = new configManager(new File(System.getProperty("user.dir", "config.toml")));
        api = new DiscordApiBuilder().setToken(configManager.getToml().getString("bot.token"))
                .login().join();

    }
}
