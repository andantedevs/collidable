package me.andante.collidable;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Collidable implements ModInitializer {
    public static final String MOD_ID = "collidable";
    public static final String MOD_NAME = "Collidable";

    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        log(Level.INFO, "Loaded");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
