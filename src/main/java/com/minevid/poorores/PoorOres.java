package com.minevid.poorores;

import com.minevid.poorores.proxy.CommonProxy;
import com.minevid.poorores.references.Reference;
import com.minevid.poorores.util.Util;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class PoorOres {
    @Mod.Instance(Reference.MODID)
    public static PoorOres instance;

    @SidedProxy(serverSide = Reference.serverProxy, clientSide = Reference.clientProxy)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        Util.getLogger().info("Pre initialize");
        proxy.preInit(event);


    }




    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        Util.getLogger().info("Initialize");
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        Util.getLogger().info("Post Initialize");
        proxy.postInit(event);
    }
}


