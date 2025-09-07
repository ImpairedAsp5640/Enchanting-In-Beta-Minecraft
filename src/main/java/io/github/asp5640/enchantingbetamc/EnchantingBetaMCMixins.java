package io.github.asp5640.enchantingbetamc;

import org.spongepowered.asm.mixin.Mixins;

public class EnchantingBetaMCMixins {
    static {
        Mixins.addConfiguration("mixins.enchantedbetamc.json");
    }
}
