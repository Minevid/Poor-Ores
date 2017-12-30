package com.minevid.poorores.blocks;


import com.minevid.poorores.references.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NetherIronOre extends Block {

    public NetherIronOre(){
        super(Material.ROCK);
        setUnlocalizedName(Reference.MODID + ".netherironore");
        setRegistryName("netherironore");
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString(), "inventory"));
    }
}
