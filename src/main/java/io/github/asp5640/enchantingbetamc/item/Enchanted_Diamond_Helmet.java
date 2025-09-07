package io.github.asp5640.enchantingbetamc.item;

import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateArmorItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class Enchanted_Diamond_Helmet extends TemplateArmorItem implements CustomTooltipProvider {
    public Enchanted_Diamond_Helmet(Identifier identifier) {
        super(identifier, 3, 3, 0); // armorType=3 (helmet), renderIndex=3 (diamond), slot number
        this.setTexturePosition(3, 0);
    }

    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        return new String[]{originalTooltip, "Enchanted with Protection V"};
    }
}
