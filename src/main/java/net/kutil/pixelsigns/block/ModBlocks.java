package net.kutil.pixelsigns.block;

import net.kutil.pixelsigns.PixelSigns;
import net.kutil.pixelsigns.item.ModItemGroup;
import net.kutil.pixelsigns.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, PixelSigns.MOD_ID);

    public static final RegistryObject<Block> TRAFFIC_COLUMN = registerBlock("traffic_column", () -> new TrafficColumnBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));

    public static final RegistryObject<Block> TRAFFIC_SIGN_A1 = registerBlock("traffic_sign_a1", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A2 = registerBlock("traffic_sign_a2", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A3 = registerBlock("traffic_sign_a3", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A4 = registerBlock("traffic_sign_a4", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A5 = registerBlock("traffic_sign_a5", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A6 = registerBlock("traffic_sign_a6", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A7 = registerBlock("traffic_sign_a7", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A8 = registerBlock("traffic_sign_a8", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A9 = registerBlock("traffic_sign_a9", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A10 = registerBlock("traffic_sign_a10", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A11 = registerBlock("traffic_sign_a11", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A12 = registerBlock("traffic_sign_a12", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A13 = registerBlock("traffic_sign_a13", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A14 = registerBlock("traffic_sign_a14", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A15 = registerBlock("traffic_sign_a15", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A16 = registerBlock("traffic_sign_a16", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A17 = registerBlock("traffic_sign_a17", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.PIXEL_GROUP)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
