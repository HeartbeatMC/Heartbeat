package io.github.heartbeatmc.heartbeat;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Heartbeat implements ModInitializer {
    public static final String MOD_ID = "heartbeat";
    public static final Logger LOGGER = LogManager.getLogger("Heartbeat");

    @Override
    public void onInitialize() {
        LOGGER.info("Starting the Heartbeat!");
    }
}
