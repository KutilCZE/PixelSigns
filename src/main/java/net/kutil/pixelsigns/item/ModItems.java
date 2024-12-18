package net.kutil.pixelsigns.item;

import net.kutil.pixelsigns.PixelSigns;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PixelSigns.MOD_ID);
    //This line keeps track of all items so it can register correct items

    public static final RegistryObject<Item> SPRAY = ITEMS.register("spray", () -> new Item(new Item.Properties().group(ModItemGroup.PIXEL_GROUP)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
