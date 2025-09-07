package io.github.asp5640.enchantingbetamc.mixin;

import net.modificationstation.stationapi.mixin.item.EntityAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(net.minecraft.entity.Entity.class)
public abstract class EntityAccessorMixin implements EntityAccessor {

    @Shadow protected float fallDistance;

    public float getFallDistanceExposed() {
        return fallDistance;
    }

    public void setFallDistanceExposed(float value) {
        this.fallDistance = value;
    }
}
