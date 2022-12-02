package fr.silenthill99.monbotdiscord.utils;

import com.moandjiezana.toml.Toml;

import java.io.File;

public class configManager
{
    private Toml toml;

    public configManager(File file)
    {
        this.toml = new Toml().read(file);
    }

    public Toml getToml()
    {
        return this.toml;
    }

    public void setToml(Toml toml)
    {
        this.toml = toml;
    }
}
