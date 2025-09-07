package io.github.asp5640.enchantingbetamc.mixin;

import io.github.asp5640.enchantingbetamc.item.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerDamageMixin {

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void applyArmorProtection(Entity source, int amount, CallbackInfoReturnable<Boolean> cir) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        ItemStack[] armor = player.inventory.armor;
        int protection = 0;

        // Calculate Protection V from helmet, chestplate, leggings
        for (int i = 1; i <= 3; i++) { // slots 1 = leggings, 2 = chestplate, 3 = helmet
            ItemStack piece = armor[i];
            if (piece == null) continue;

            if (piece.getItem() instanceof Enchanted_Diamond_Helmet ||
                    piece.getItem() instanceof Enchanted_Diamond_Chestplate ||
                    piece.getItem() instanceof Enchanted_Diamond_Leggings) {
                protection += 2; // reduce damage by 2 per piece
            }
        }

        ItemStack boots = armor[0];
        if (boots != null && boots.getItem() instanceof Enchanted_Diamond_Boots) {
            if (source == null || source.equals(player)) { // fall damage source
                int reduced = Math.max(0, amount - 5); // reduce 5 damage
                if (reduced <= 0) {
                    cir.setReturnValue(false);
                    return;
                } else {
                    player.health -= reduced;
                    cir.setReturnValue(true);
                    return;
                }
            }
        }

        int reduced = Math.max(0, amount - protection);
        if (reduced <= 0) {
            cir.setReturnValue(false);
        } else {
            player.health -= reduced;
            cir.setReturnValue(true);
        }
    }
}
