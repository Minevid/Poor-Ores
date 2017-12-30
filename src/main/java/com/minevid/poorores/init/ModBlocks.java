package com.minevid.poorores.init;

import com.minevid.poorores.blocks.NetherIronOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("poorores:netherironore")
    public static NetherIronOre netherIronOre;



    @SideOnly(Side.CLIENT)
    public static void initModels(){
        netherIronOre.initModel();
    }
}
