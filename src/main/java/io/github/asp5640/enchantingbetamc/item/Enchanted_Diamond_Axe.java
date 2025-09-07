package io.github.asp5640.enchantingbetamc.item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateAxeItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class Enchanted_Diamond_Axe extends TemplateAxeItem implements CustomTooltipProvider {

    public Enchanted_Diamond_Axe(Identifier identifier, ToolMaterial material) {
        super(identifier, material);
        this.setTexturePosition(3, 7);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, Block block) {
        float baseSpeed = super.getMiningSpeedMultiplier(stack, block);
        return baseSpeed + 6.0F; // Efficiency V
    }

    @Override
    public int getAttackDamage(Entity attackedEntity) {
        return super.getAttackDamage(attackedEntity) + 6; // Sharpness V
    }

    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        return new String[]{
                originalTooltip,
                "Enchanted with Efficiency V and Sharpness V"
        };
    }
}