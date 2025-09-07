package io.github.asp5640.enchantingbetamc.item;

import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateArmorItem;
import net.modificationstation.stationapi.api.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class Enchanted_Diamond_Leggings extends TemplateArmorItem implements CustomTooltipProvider {
    public Enchanted_Diamond_Leggings(Identifier identifier){
        super(identifier,2,3,2);
        this.setTexturePosition(3,2);

    }


    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        return new String[]{originalTooltip, "Enchanted with Protection V"};
    }
}
