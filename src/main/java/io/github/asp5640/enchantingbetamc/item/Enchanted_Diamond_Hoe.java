package io.github.asp5640.enchantingbetamc.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateHoeItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class Enchanted_Diamond_Hoe extends TemplateHoeItem implements CustomTooltipProvider {
    public Enchanted_Diamond_Hoe(Identifier identifier, ToolMaterial arg){
        super(identifier,arg);
        this.setTexturePosition(3,8);
    }
    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, Block block) {
        float baseSpeed = super.getMiningSpeedMultiplier(stack, block);
        return baseSpeed + 6.0F; // Efficiency V
    }
    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        return new String[]{originalTooltip, "Enchanted with Efficiency V"};
    }
}
