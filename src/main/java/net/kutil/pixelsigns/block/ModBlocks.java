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

    public static final RegistryObject<Block> SIDEWALK_GRAY = registerBlock("sidewalk_gray", () -> new SidewalkBlock(AbstractBlock.Properties.create(Material.EARTH).notSolid()));

    public static final RegistryObject<Block> TRAFFIC_COLUMN = registerBlock("traffic_column", () -> new TrafficColumnBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_COLUMN_BASE = registerBlock("traffic_column_base", () -> new MediumColumnBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));

    public static final RegistryObject<Block> TRAFFIC_SIGN_A1 = registerBlock("traffic_sign_a1", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A2 = registerBlock("traffic_sign_a2", () -> new YieldSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A3 = registerBlock("traffic_sign_a3", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A4 = registerBlock("traffic_sign_a4", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A5 = registerBlock("traffic_sign_a5", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A6 = registerBlock("traffic_sign_a6", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A7 = registerBlock("traffic_sign_a7", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A8 = registerBlock("traffic_sign_a8", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A9 = registerBlock("traffic_sign_a9", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A10 = registerBlock("traffic_sign_a10", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A11 = registerBlock("traffic_sign_a11", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A12 = registerBlock("traffic_sign_a12", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A13 = registerBlock("traffic_sign_a13", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A14 = registerBlock("traffic_sign_a14", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A15 = registerBlock("traffic_sign_a15", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A16 = registerBlock("traffic_sign_a16", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_A17 = registerBlock("traffic_sign_a17", () -> new TriangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B1 = registerBlock("traffic_sign_b1", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B2 = registerBlock("traffic_sign_b2", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B3 = registerBlock("traffic_sign_b3", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B4 = registerBlock("traffic_sign_b4", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B5 = registerBlock("traffic_sign_b5", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B6 = registerBlock("traffic_sign_b6", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B7 = registerBlock("traffic_sign_b7", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B8 = registerBlock("traffic_sign_b8", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B9 = registerBlock("traffic_sign_b9", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B10 = registerBlock("traffic_sign_b10", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B11 = registerBlock("traffic_sign_b11", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B12 = registerBlock("traffic_sign_b12", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B13 = registerBlock("traffic_sign_b13", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B14 = registerBlock("traffic_sign_b14", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B15 = registerBlock("traffic_sign_b15", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B16 = registerBlock("traffic_sign_b16", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B17 = registerBlock("traffic_sign_b17", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B18 = registerBlock("traffic_sign_b18", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B19 = registerBlock("traffic_sign_b19", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B20 = registerBlock("traffic_sign_b20", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B21 = registerBlock("traffic_sign_b21", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B22 = registerBlock("traffic_sign_b22", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B23 = registerBlock("traffic_sign_b23", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B24 = registerBlock("traffic_sign_b24", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B25 = registerBlock("traffic_sign_b25", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B26 = registerBlock("traffic_sign_b26", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B27 = registerBlock("traffic_sign_b27", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B28 = registerBlock("traffic_sign_b28", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_B29 = registerBlock("traffic_sign_b29", () -> new TrafficSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C1 = registerBlock("traffic_sign_c1", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C2 = registerBlock("traffic_sign_c2", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C3 = registerBlock("traffic_sign_c3", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C4 = registerBlock("traffic_sign_c4", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C5 = registerBlock("traffic_sign_c5", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C6 = registerBlock("traffic_sign_c6", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C7 = registerBlock("traffic_sign_c7", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C8 = registerBlock("traffic_sign_c8", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C9 = registerBlock("traffic_sign_c9", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C10 = registerBlock("traffic_sign_c10", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C11 = registerBlock("traffic_sign_c11", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C12 = registerBlock("traffic_sign_c12", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C13 = registerBlock("traffic_sign_c13", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C14 = registerBlock("traffic_sign_c14", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C15 = registerBlock("traffic_sign_c15", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C16 = registerBlock("traffic_sign_c16", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C17 = registerBlock("traffic_sign_c17", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C18 = registerBlock("traffic_sign_c18", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C19 = registerBlock("traffic_sign_c19", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C20 = registerBlock("traffic_sign_c20", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C21 = registerBlock("traffic_sign_c21", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C22 = registerBlock("traffic_sign_c22", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C23 = registerBlock("traffic_sign_c23", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C24 = registerBlock("traffic_sign_c24", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C25 = registerBlock("traffic_sign_c25", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C26 = registerBlock("traffic_sign_c26", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C27 = registerBlock("traffic_sign_c27", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C28 = registerBlock("traffic_sign_c28", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C29 = registerBlock("traffic_sign_c29", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_C30 = registerBlock("traffic_sign_c30", () -> new RoundSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D1 = registerBlock("traffic_sign_d1", () -> new RhombusSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D2 = registerBlock("traffic_sign_d2", () -> new RhombusSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D3 = registerBlock("traffic_sign_d3", () -> new StopSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D4 = registerBlock("traffic_sign_d4", () -> new XSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D12 = registerBlock("traffic_sign_d12", () -> new RectangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D13 = registerBlock("traffic_sign_d13", () -> new RectangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D14 = registerBlock("traffic_sign_d14", () -> new RectangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D15 = registerBlock("traffic_sign_d15", () -> new RectangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> TRAFFIC_SIGN_D16 = registerBlock("traffic_sign_d16", () -> new RectangleSignBlock(AbstractBlock.Properties.create(Material.IRON).notSolid()));

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
