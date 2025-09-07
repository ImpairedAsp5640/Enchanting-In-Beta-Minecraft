package io.github.asp5640.enchantingbetamc.item;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateSwordItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class Enchanted_Diamond_Sword extends TemplateSwordItem implements CustomTooltipProvider {
    public Enchanted_Diamond_Sword(Identifier identifier, ToolMaterial arg) {
        super(identifier, arg);
        this.setTexturePosition(3,4);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(4, attacker);
        return true;
    }
    @Override
    public int getAttackDamage(Entity attackedEntity) {
        return super.getAttackDamage(attackedEntity) + 3;
    }


    public String[] getTooltip(ItemStack stack, String originalTooltip) {
        return new String[]{originalTooltip, "Enchanted with Sharpness V"};
    }

}
