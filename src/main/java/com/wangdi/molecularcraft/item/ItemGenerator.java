package com.wangdi.molecularcraft.item;

import com.wangdi.molecularcraft.MolecularCraft;
import com.wangdi.molecularcraft.creativetab.ModCreativeTabs;
import com.wangdi.util.MainUtil;

import net.minecraft.item.Item;

public final class ItemGenerator extends Item
{
    public static final String NAME = "generator";

    public ItemGenerator()
    {
        super();
        this.setRegistryName(NAME);
        this.setUnlocalizedName(MainUtil.combinedStrings(MolecularCraft.MODID, ".", NAME));
        this.setCreativeTab(ModCreativeTabs.MISC);

        this.setMaxStackSize(1);
    }
}
