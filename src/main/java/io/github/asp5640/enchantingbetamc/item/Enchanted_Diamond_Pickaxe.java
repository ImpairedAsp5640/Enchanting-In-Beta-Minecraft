package io.github.asp5640.enchantingbetamc.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplatePickaxeItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class Enchanted_Diamond_Pickaxe  extends TemplatePickaxeItem implements CustomTooltipProvider {
    public Enchanted_Diamond_Pickaxe(Identifier identifier, ToolMaterial arg) {
        super(identifier, arg);
        this.setTexturePosition(3,6);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, Block block) {
        float baseSpeed = super.getMiningSpeedMultiplier(stack, block);
        return (float) (baseSpeed + 6); //Efficiency V
    }

    public String[] getTooltip(ItemStack stack, String originalTooltip) {
        return new String[]{originalTooltip, "Enchanted with Efficiency V"};
    }
}
