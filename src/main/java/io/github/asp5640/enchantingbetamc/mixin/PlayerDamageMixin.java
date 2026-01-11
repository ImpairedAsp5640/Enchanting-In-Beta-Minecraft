package io.github.asp5640.enchantingbetamc.mixin;

import io.github.asp5640.enchantingbetamc.item.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PlayerEntity.class)
public class PlayerDamageMixin {

    @ModifyVariable(
            method = "damage",
            at = @At("HEAD"),
            ordinal = 0,
            argsOnly = true
    )
    private int modifyDamageAmount(int amount, Entity source) {
        PlayerEntity player = (PlayerEntity)(Object)this;
        ItemStack[] armor = player.inventory.armor;

        float reduction = 0.0f;

        // Protection reduction
        for (int i = 1; i <= 3; i++) {
            ItemStack piece = armor[i];
            if (piece == null) continue;

            if (piece.getItem() instanceof Enchanted_Diamond_Helmet ||
                    piece.getItem() instanceof Enchanted_Diamond_Chestplate ||
                    piece.getItem() instanceof Enchanted_Diamond_Leggings) {
                reduction += 0.08f; // 8% per piece
            }
        }

        // Feather Falling IV
        ItemStack boots = armor[0];
        if (boots != null && boots.getItem() instanceof Enchanted_Diamond_Boots) {
            if (source == null) { // fall damage in beta
                reduction += 0.48f;
            }
        }

        reduction = Math.min(reduction, 0.8f); // hard cap

        int reduced = Math.round(amount * (1.0f - reduction));
        return Math.max(0, reduced);
    }
}
