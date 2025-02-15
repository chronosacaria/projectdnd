package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.ProjectDnD;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);

    //Coins (currency)
    public static final RegistrySupplier<Item> COPPER_COIN = ITEMS.register("copper_coin",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> SILVER_COIN = ITEMS.register("silver_coin",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> GOLD_COIN = ITEMS.register("gold_coin",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> PLATINUM_COIN = ITEMS.register("platinum_coin",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_COPPER_COINS = ITEMS.register("five_copper_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_SILVER_COINS = ITEMS.register("five_silver_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_GOLD_COINS = ITEMS.register("five_gold_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_PLATINUM_COINS = ITEMS.register("five_platinum_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_COPPER_COINS = ITEMS.register("ten_copper_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_SILVER_COINS = ITEMS.register("ten_silver_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_GOLD_COINS = ITEMS.register("ten_gold_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_PLATINUM_COINS = ITEMS.register("ten_platinum_coins",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(50)));

    //Coin Pouches

    //Sheaths
    public static final RegistrySupplier<Item> LEATHER_SHEATH = ITEMS.register("leather_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> WHITE_SHEATH = ITEMS.register("white_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GRAY_SHEATH = ITEMS.register("gray_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DARK_GRAY_SHEATH = ITEMS.register("dark_gray_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLACK_SHEATH = ITEMS.register("black_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BROWN_SHEATH = ITEMS.register("brown_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> RED_SHEATH = ITEMS.register("red_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ORANGE_SHEATH = ITEMS.register("orange_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> YELLOW_SHEATH = ITEMS.register("yellow_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIME_GREEN_SHEATH = ITEMS.register("lime_green_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GREEN_SHEATH = ITEMS.register("green_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CYAN_SHEATH = ITEMS.register("cyan_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIGHT_BLUE_SHEATH = ITEMS.register("light_blue_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLUE_SHEATH = ITEMS.register("blue_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PURPLE_SHEATH = ITEMS.register("purple_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> MAGENTA_SHEATH = ITEMS.register("magenta_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PINK_SHEATH = ITEMS.register("pink_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CHAIN_SHEATH = ITEMS.register("chain_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GOLD_SHEATH = ITEMS.register("gold_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> IRON_SHEATH = ITEMS.register("iron_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> STEEL_SHEATH = ITEMS.register("steel_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DIAMOND_SHEATH = ITEMS.register("diamond_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> NETHERITE_SHEATH = ITEMS.register("netherite_sheath",
            () -> new Item(new Item.Settings().fireproof().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));

    //ARMOR Steel-> Silver-> Adamantine-> Itanium.

    //Dagger Sheaths Please use leather_dagger_sheath.png as a working ground for the colored wool textures.
    public static final RegistrySupplier<Item> LEATHER_DAGGER_SHEATH = ITEMS.register("leather_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> WHITE_DAGGER_SHEATH = ITEMS.register("white_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GRAY_DAGGER_SHEATH = ITEMS.register("gray_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DARK_DAGGER_GRAY_SHEATH = ITEMS.register("dark_gray_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLACK_DAGGER_SHEATH = ITEMS.register("black_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BROWN_DAGGER_SHEATH = ITEMS.register("brown_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> RED_DAGGER_SHEATH = ITEMS.register("red_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ORANGE_DAGGER_SHEATH = ITEMS.register("orange_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> YELLOW_DAGGER_SHEATH = ITEMS.register("yellow_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIME_GREEN_DAGGER_SHEATH = ITEMS.register("lime_green_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GREEN_DAGGER_SHEATH = ITEMS.register("green_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CYAN_DAGGER_SHEATH = ITEMS.register("cyan_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIGHT_BLUE_DAGGER_SHEATH = ITEMS.register("light_blue_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLUE_DAGGER_SHEATH = ITEMS.register("blue_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PURPLE_DAGGER_SHEATH = ITEMS.register("purple_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> MAGENTA_DAGGER_SHEATH = ITEMS.register("magenta_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PINK_DAGGER_SHEATH = ITEMS.register("pink_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CHAIN_DAGGER_SHEATH = ITEMS.register("chain_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GOLD_DAGGER_SHEATH = ITEMS.register("gold_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> IRON_DAGGER_SHEATH = ITEMS.register("iron_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> STEEL_DAGGER_SHEATH = ITEMS.register("steel_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DIAMOND_DAGGER_SHEATH = ITEMS.register("diamond_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> NETHERITE_DAGGER_SHEATH = ITEMS.register("netherite_dagger_sheath",
            () -> new Item(new Item.Settings().fireproof().group(ProjectDnD.CREATIVE_TAB).maxCount(1)));

    //Gemstones A-Z
    // A
    public static final RegistrySupplier<Item> AGNI_MANI = ITEMS.register("agni_mani",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALAMANDINE = ITEMS.register("alamandine",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALESTONE = ITEMS.register("alestone",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALGAE = ITEMS.register("algae",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMARANTHA = ITEMS.register("amarantha",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMBER = ITEMS.register("amber",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ANDAR = ITEMS.register("andar",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AQUAMARINE = ITEMS.register("aquamarine",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ARADITE = ITEMS.register("aradite",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AUGELITE = ITEMS.register("augelite",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AVENTURINE = ITEMS.register("aventurine",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AZURITE = ITEMS.register("azurite",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    // B
    public static final RegistrySupplier<Item> BANDED_AGATE = ITEMS.register("banded_agate",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BELJURIL = ITEMS.register("beljuril",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BERYL = ITEMS.register("beryl",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLACK_OPAL = ITEMS.register("black_opal",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLACK_PEARL = ITEMS.register("black_pearl",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLACK_SAPPHIRE = ITEMS.register("black_sapphire",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLOODSTONE = ITEMS.register("bloodstone",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUE_QUARTZ = ITEMS.register("blue_quartz",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUE_SAPPHIRE = ITEMS.register("blue_sapphire",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUE_SPINEL = ITEMS.register("blue_spinel",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUESTONE = ITEMS.register("bluestone",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BOAKHAR = ITEMS.register("boakhar",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRANDEEN = ITEMS.register("brandeen",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    // C

    //Gemstone / Jewel Dusts. please refer to the wiki for the list of dusts to include.

    //Raw ores, Ingots, Nuggets
    public static final RegistrySupplier<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    //Gold Ingot
    //Gold Nugget
    public static final RegistrySupplier<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    //Copper Ingot
    public static final RegistrySupplier<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    //Iron Ingot
    //Iron Nugget
    public static final RegistrySupplier<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    //Diamond
    //Netherite
    public static final RegistrySupplier<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ADAMANT_NUGGET = ITEMS.register("adamant_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ITANIUM_INGOT = ITEMS.register("itanium_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ITANIUM_NUGGET = ITEMS.register("itanium_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ADAMANTINE_NUGGET = ITEMS.register("adamantine_nugget",
            ()-> new Item(new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));

    //Ore Dusts

    public static void init() {
        ITEMS.register();
    }
}
