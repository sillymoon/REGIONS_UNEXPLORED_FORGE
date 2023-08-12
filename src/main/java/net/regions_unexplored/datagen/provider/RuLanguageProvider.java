package net.regions_unexplored.datagen.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;
import org.jetbrains.annotations.NotNull;

public class RuLanguageProvider extends LanguageProvider {
    public RuLanguageProvider(PackOutput output) {
        super(output, RegionsUnexploredMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Block translations
        RegionsUnexploredMod.BLOCK_REGISTRY.getEntries().forEach(blockRegistryObject -> {
            if(!blockRegistryObject.get().toString().contains("potted_")&&
                    !blockRegistryObject.get().toString().contains("_plant")&&
                    !blockRegistryObject.get().toString().contains("_wall_sign")&&
                    !blockRegistryObject.get().toString().contains("_wall_hanging_sign")){
                this.add(blockRegistryObject.get(), capitalizeString(filterBlockLang(blockRegistryObject.get())));
            }
        });

        // Biome Translations
        this.add(RuBiomes.ALPHA_GROVE, capitalizeString(filterBiomeLang(RuBiomes.ALPHA_GROVE)));
        this.add(RuBiomes.ANCIENT_DELTA, capitalizeString(filterBiomeLang(RuBiomes.ANCIENT_DELTA)));
        this.add(RuBiomes.ARID_MOUNTAINS, capitalizeString(filterBiomeLang(RuBiomes.ARID_MOUNTAINS)));
        this.add(RuBiomes.ASHEN_WOODLAND, capitalizeString(filterBiomeLang(RuBiomes.ASHEN_WOODLAND)));
        this.add(RuBiomes.AUTUMNAL_MAPLE_FOREST, capitalizeString(filterBiomeLang(RuBiomes.AUTUMNAL_MAPLE_FOREST)));
        this.add(RuBiomes.BAOBAB_SAVANNA, capitalizeString(filterBiomeLang(RuBiomes.BAOBAB_SAVANNA)));
        this.add(RuBiomes.BAMBOO_FOREST, capitalizeString(filterBiomeLang(RuBiomes.BAMBOO_FOREST)));
        this.add(RuBiomes.BARLEY_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.BARLEY_FIELDS)));
        this.add(RuBiomes.BAYOU, capitalizeString(filterBiomeLang(RuBiomes.BAYOU)));
        this.add(RuBiomes.BIOSHROOM_CAVES, capitalizeString(filterBiomeLang(RuBiomes.BIOSHROOM_CAVES)));
        this.add(RuBiomes.BLACKSTONE_BASIN, capitalizeString(filterBiomeLang(RuBiomes.BLACKSTONE_BASIN)));
        this.add(RuBiomes.BLACKWOOD_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.BLACKWOOD_TAIGA)));
        this.add(RuBiomes.BOREAL_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.BOREAL_TAIGA)));
        this.add(RuBiomes.CHALK_CLIFFS, capitalizeString(filterBiomeLang(RuBiomes.CHALK_CLIFFS)));
        this.add(RuBiomes.COLD_BOREAL_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.COLD_BOREAL_TAIGA)));
        this.add(RuBiomes.COLD_DECIDUOUS_FOREST, capitalizeString(filterBiomeLang(RuBiomes.COLD_DECIDUOUS_FOREST)));
        this.add(RuBiomes.COLD_RIVER, capitalizeString(filterBiomeLang(RuBiomes.COLD_RIVER)));
        this.add(RuBiomes.DECIDUOUS_FOREST, capitalizeString(filterBiomeLang(RuBiomes.DECIDUOUS_FOREST)));
        this.add(RuBiomes.DRY_BUSHLAND, capitalizeString(filterBiomeLang(RuBiomes.DRY_BUSHLAND)));
        this.add(RuBiomes.EUCALYPTUS_FOREST, capitalizeString(filterBiomeLang(RuBiomes.EUCALYPTUS_FOREST)));
        this.add(RuBiomes.FEN, capitalizeString(filterBiomeLang(RuBiomes.FEN)));
        this.add(RuBiomes.FLOWER_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.FLOWER_FIELDS)));
        this.add(RuBiomes.FROZEN_PINE_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.FROZEN_PINE_TAIGA)));
        this.add(RuBiomes.FROZEN_TUNDRA, capitalizeString(filterBiomeLang(RuBiomes.FROZEN_TUNDRA)));
        this.add(RuBiomes.FUNGAL_FEN, capitalizeString(filterBiomeLang(RuBiomes.FUNGAL_FEN)));
        this.add(RuBiomes.GLISTERING_MEADOW, capitalizeString(filterBiomeLang(RuBiomes.GLISTERING_MEADOW)));
        this.add(RuBiomes.GOLDEN_BOREAL_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.GOLDEN_BOREAL_TAIGA)));
        this.add(RuBiomes.GRASSLAND, capitalizeString(filterBiomeLang(RuBiomes.GRASSLAND)));
        this.add(RuBiomes.GRASSY_BEACH, capitalizeString(filterBiomeLang(RuBiomes.GRASSY_BEACH)));
        this.add(RuBiomes.GRAVEL_BEACH, capitalizeString(filterBiomeLang(RuBiomes.GRAVEL_BEACH)));
        this.add(RuBiomes.HIGHLAND_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.HIGHLAND_FIELDS)));
        this.add(RuBiomes.HYACINTH_DEEPS, capitalizeString(filterBiomeLang(RuBiomes.HYACINTH_DEEPS)));
        this.add(RuBiomes.ICY_HEIGHTS, capitalizeString(filterBiomeLang(RuBiomes.ICY_HEIGHTS)));
        this.add(RuBiomes.INFERNAL_HOLT, capitalizeString(filterBiomeLang(RuBiomes.INFERNAL_HOLT)));
        this.add(RuBiomes.JOSHUA_DESERT, capitalizeString(filterBiomeLang(RuBiomes.JOSHUA_DESERT)));
        this.add(RuBiomes.MAGNOLIA_HIGHLANDS, capitalizeString(filterBiomeLang(RuBiomes.MAGNOLIA_HIGHLANDS)));
        this.add(RuBiomes.MARSH, capitalizeString(filterBiomeLang(RuBiomes.MARSH)));
        this.add(RuBiomes.MAPLE_FOREST, capitalizeString(filterBiomeLang(RuBiomes.MAPLE_FOREST)));
        this.add(RuBiomes.MOUNTAINS, capitalizeString(filterBiomeLang(RuBiomes.MOUNTAINS)));
        this.add(RuBiomes.MAUVE_HILLS, capitalizeString(filterBiomeLang(RuBiomes.MAUVE_HILLS)));
        this.add(RuBiomes.MUDDY_RIVER, capitalizeString(filterBiomeLang(RuBiomes.MUDDY_RIVER)));
        this.add(RuBiomes.MYCOTOXIC_UNDERGROWTH, capitalizeString(filterBiomeLang(RuBiomes.MYCOTOXIC_UNDERGROWTH)));
        this.add(RuBiomes.ORCHARD, capitalizeString(filterBiomeLang(RuBiomes.ORCHARD)));
        this.add(RuBiomes.OUTBACK, capitalizeString(filterBiomeLang(RuBiomes.OUTBACK)));
        this.add(RuBiomes.OLD_GROWTH_BAYOU, capitalizeString(filterBiomeLang(RuBiomes.OLD_GROWTH_BAYOU)));
        this.add(RuBiomes.PINE_SLOPES, capitalizeString(filterBiomeLang(RuBiomes.PINE_SLOPES)));
        this.add(RuBiomes.PINE_TAIGA, capitalizeString(filterBiomeLang(RuBiomes.PINE_TAIGA)));
        this.add(RuBiomes.PRAIRIE, capitalizeString(filterBiomeLang(RuBiomes.PRAIRIE)));
        this.add(RuBiomes.PRISMACHASM, capitalizeString(filterBiomeLang(RuBiomes.PRISMACHASM)));
        this.add(RuBiomes.POPPY_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.POPPY_FIELDS)));
        this.add(RuBiomes.PUMPKIN_FIELDS, capitalizeString(filterBiomeLang(RuBiomes.PUMPKIN_FIELDS)));
        this.add(RuBiomes.RAINFOREST, capitalizeString(filterBiomeLang(RuBiomes.RAINFOREST)));
        this.add(RuBiomes.REDWOODS, capitalizeString(filterBiomeLang(RuBiomes.REDWOODS)));
        this.add(RuBiomes.REDSTONE_ABYSS, capitalizeString(filterBiomeLang(RuBiomes.REDSTONE_ABYSS)));
        this.add(RuBiomes.REDSTONE_CAVES, capitalizeString(filterBiomeLang(RuBiomes.REDSTONE_CAVES)));
        this.add(RuBiomes.ROCKY_MEADOW, capitalizeString(filterBiomeLang(RuBiomes.ROCKY_MEADOW)));
        this.add(RuBiomes.ROCKY_REEF, capitalizeString(filterBiomeLang(RuBiomes.ROCKY_REEF)));
        this.add(RuBiomes.SAGUARO_DESERT, capitalizeString(filterBiomeLang(RuBiomes.SAGUARO_DESERT)));
        this.add(RuBiomes.SHRUBLAND, capitalizeString(filterBiomeLang(RuBiomes.SHRUBLAND)));
        this.add(RuBiomes.SCORCHING_CAVES, capitalizeString(filterBiomeLang(RuBiomes.SCORCHING_CAVES)));
        this.add(RuBiomes.SPIRES, capitalizeString(filterBiomeLang(RuBiomes.SPIRES)));
        this.add(RuBiomes.STEPPE, capitalizeString(filterBiomeLang(RuBiomes.STEPPE)));
        this.add(RuBiomes.SILVER_BIRCH_FOREST, capitalizeString(filterBiomeLang(RuBiomes.SILVER_BIRCH_FOREST)));
        this.add(RuBiomes.SPARSE_RAINFOREST, capitalizeString(filterBiomeLang(RuBiomes.SPARSE_RAINFOREST)));
        this.add(RuBiomes.SPARSE_REDWOODS, capitalizeString(filterBiomeLang(RuBiomes.SPARSE_REDWOODS)));
        this.add(RuBiomes.TEMPERATE_GROVE, capitalizeString(filterBiomeLang(RuBiomes.TEMPERATE_GROVE)));
        this.add(RuBiomes.TROPICS, capitalizeString(filterBiomeLang(RuBiomes.TROPICS)));
        this.add(RuBiomes.TROPICAL_RIVER, capitalizeString(filterBiomeLang(RuBiomes.TROPICAL_RIVER)));
        this.add(RuBiomes.TOWERING_CLIFFS, capitalizeString(filterBiomeLang(RuBiomes.TOWERING_CLIFFS)));
        this.add(RuBiomes.WILLOW_FOREST, capitalizeString(filterBiomeLang(RuBiomes.WILLOW_FOREST)));
        this.add(RuBiomes.LUPINE_PLAINS, capitalizeString(filterBiomeLang(RuBiomes.LUPINE_PLAINS)));

        this.add("itemGroup.regions_unexplored_main", "Regions Unexplored");
    }

    /**
     * A method to capitalize a string and remove anything what's between it.
     * <a href="https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string">Source</a>
     * @param string the string you want to capitalize.
     * @return a capitalised string.
     */
    private static @NotNull String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '_') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    private static @NotNull String filterBlockLang(@NotNull Block key) {
        return key.getDescriptionId()
                .replace("block.regions_unexplored.", "")
                .replace("_", " ");
    }

    private static String filterBiomeLang(ResourceKey<Biome> key) {
        return key.location().toLanguageKey()
                .replace("regions_unexplored.", "")
                .replace("_", " ");
    }

    // used to create a biome translation string
    private void add(ResourceKey<Biome> key, String translation) {
        this.add("biome." + key.location().toLanguageKey(), translation);
    }
}
