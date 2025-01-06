package net.kutil.pixelsigns;

import net.kutil.pixelsigns.block.ModBlocks;
import net.kutil.pixelsigns.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PixelSigns.MOD_ID)
public class PixelSigns
{
    public static final String MOD_ID = "pixelsigns";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public PixelSigns() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_COLUMN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A1.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A2.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A3.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A4.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A5.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A6.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A7.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A8.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A9.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A10.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A11.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A12.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A13.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A14.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A15.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A16.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_A17.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B1.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B2.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B3.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B4.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B5.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B6.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B7.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B8.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B9.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B10.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B11.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B12.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B13.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B14.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B15.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B16.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B17.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B18.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B19.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B20.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B21.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B22.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B23.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B24.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B25.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B26.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B27.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B28.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_B29.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C1.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C2.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C3.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C4.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C5.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C6.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C7.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C8.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C9.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C10.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C11.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C12.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C13.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C14.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C15.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C16.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C17.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C18.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C19.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C20.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C21.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C22.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C23.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C24.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C25.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C26.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C27.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C28.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C29.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_C30.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D1.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D2.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D3.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D12.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D13.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D14.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D15.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TRAFFIC_SIGN_D16.get(), RenderType.getCutout());

    }

    // You can use SubscribeEvent to automatically register all static methods to be called on the EventBus
    // You don't need to worry about registering for Minecraft's event bus since this class is annotated with @Mod.EventBusSubscriber
    // for handling all events on the EventBus
    @SubscribeEvent
    public static void onClientEvent(FMLClientSetupEvent event) {
        // Any client-specific event can be handled here
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
