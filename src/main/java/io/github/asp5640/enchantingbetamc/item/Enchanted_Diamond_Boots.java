package io.github.asp5640.enchantingbetamc.item;

import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateArmorItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class Enchanted_Diamond_Boots extends TemplateArmorItem implements CustomTooltipProvider {
    public Enchanted_Diamond_Boots(Identifier identifier) {
        super(identifier, 3, 3, 3);
        this.setTexturePosition(3,3);
    }
    public String[] getTooltip(ItemStack itemstack, String originalTooltip){
        return new String[]{originalTooltip, "Enchanted with Feather Falling IV"};
    }
}
