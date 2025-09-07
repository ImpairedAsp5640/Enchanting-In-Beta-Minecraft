package io.github.asp5640.enchantingbetamc.events.init;


import io.github.asp5640.enchantingbetamc.item.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.event.world.WorldEvent;
import net.modificationstation.stationapi.api.template.item.TemplateSwordItem;

import javax.tools.Tool;

public class ItemListener {
    public static Item[] items;
    public static Item ENCHANTED_DIAMOND_SWORD;
    public static Item ENCHANTED_DIAMOND_PICKAXE;
    public static Item ENCHANTED_DIAMOND_AXE;
    public static Item ENCHANTED_DIAMOND_SHOVEL;
    public static Item ENCHANTED_DIAMOND_HOE;
    public static Item ENCHANTED_DIAMOND_HELMET;
    public static Item ENCHANTED_DIAMOND_CHESTPLATE;
    public static Item ENCHANTED_DIAMOND_LEGGINGS;
    public static Item ENCHANTED_DIAMOND_BOOTS;
    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        ENCHANTED_DIAMOND_SWORD = new Enchanted_Diamond_Sword(InitListener.NAMESPACE.id("enchanted_diamond_sword"), ToolMaterial.DIAMOND).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_sword"));
        ENCHANTED_DIAMOND_PICKAXE = new Enchanted_Diamond_Pickaxe(InitListener.NAMESPACE.id("enchanted_diamond_pickaxe"), ToolMaterial.DIAMOND).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_pickaxe"));
        ENCHANTED_DIAMOND_AXE = new Enchanted_Diamond_Axe(InitListener.NAMESPACE.id("enchanted_diamond_axe"), ToolMaterial.DIAMOND).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_axe"));
        ENCHANTED_DIAMOND_SHOVEL = new Enchanted_Diamond_Shovel(InitListener.NAMESPACE.id("enchanted_diamond_shovel"), ToolMaterial.DIAMOND).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_shovel"));
        ENCHANTED_DIAMOND_HOE = new Enchanted_Diamond_Hoe(InitListener.NAMESPACE.id("enchanted_diamond_hoe"), ToolMaterial.DIAMOND).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_hoe"));
        ENCHANTED_DIAMOND_HELMET = new Enchanted_Diamond_Helmet(InitListener.NAMESPACE.id("enchanted_diamond_helmet")).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_helmet"));
        ENCHANTED_DIAMOND_CHESTPLATE = new Enchanted_Diamond_Chestplate(InitListener.NAMESPACE.id("enchanted_diamond_chestplate")).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_chestplate"));
        ENCHANTED_DIAMOND_HELMET = new Enchanted_Diamond_Leggings(InitListener.NAMESPACE.id("enchanted_diamond_leggings")).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_leggings"));
        ENCHANTED_DIAMOND_HELMET = new Enchanted_Diamond_Boots(InitListener.NAMESPACE.id("enchanted_diamond_boots")).setTranslationKey(InitListener.NAMESPACE.id("enchanted_diamond_boots"));
        items = new Item[]{
                ENCHANTED_DIAMOND_SWORD,
                ENCHANTED_DIAMOND_PICKAXE,
                ENCHANTED_DIAMOND_AXE,
                ENCHANTED_DIAMOND_SHOVEL,
                ENCHANTED_DIAMOND_HOE,
                ENCHANTED_DIAMOND_HELMET,
                ENCHANTED_DIAMOND_CHESTPLATE,
                ENCHANTED_DIAMOND_LEGGINGS,
                ENCHANTED_DIAMOND_BOOTS
        };
    }
}
