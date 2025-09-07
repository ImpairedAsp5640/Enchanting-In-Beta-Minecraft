package io.github.asp5640.enchantingbetamc.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.mod.InitEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixins;

import java.lang.invoke.MethodHandles;

public class InitListener {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
        Class<?> mixinLoader = io.github.asp5640.enchantingbetamc.EnchantingBetaMCMixins.class;
    }

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    public static final Logger LOGGER = NAMESPACE.getLogger();

    @EventListener
    private static void serverInit(InitEvent event) {
        Mixins.addConfiguration("mixins.enchantedbetamc.json");
    }
}
