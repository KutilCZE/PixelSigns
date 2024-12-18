package net.kutil.pixelsigns.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup PIXEL_GROUP = new ItemGroup("pixelSignsTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.SPRAY.get());
        }
    };
}
