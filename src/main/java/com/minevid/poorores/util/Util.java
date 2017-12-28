package com.minevid.poorores.util;

import com.minevid.poorores.references.Reference;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Util {

    private static Logger logger;

    public static Logger getLogger(){
        if(logger == null)
            logger = LogManager.getFormatterLogger(Reference.MODID);
        return logger;
    }
}
