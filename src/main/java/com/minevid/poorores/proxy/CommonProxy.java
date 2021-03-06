package com.minevid.poorores.proxy;

import com.minevid.poorores.blocks.NetherIronOre;
import com.minevid.poorores.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

   public void preInit(FMLPreInitializationEvent event){

   }

   public void init(FMLInitializationEvent event){

   }

   public void postInit(FMLPostInitializationEvent event){

   }

   @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
       event.getRegistry().register(new NetherIronOre());

   }

   @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new ItemBlock(ModBlocks.netherIronOre).setRegistryName(ModBlocks.netherIronOre.getRegistryName().toString()));
   }

}
