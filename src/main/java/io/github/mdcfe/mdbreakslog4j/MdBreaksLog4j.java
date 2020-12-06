package io.github.mdcfe.mdbreakslog4j;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public final class MdBreaksLog4j extends JavaPlugin {

    @Override
    public void onEnable() {
        final Injector funkyInjector = Guice.createInjector(new AbstractModule() {});

        // error time
        funkyInjector.getInstance(Material.class);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
