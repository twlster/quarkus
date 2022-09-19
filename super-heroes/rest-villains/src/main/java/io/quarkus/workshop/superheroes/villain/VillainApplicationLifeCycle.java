package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class VillainApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
    	LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile()+" and showing a custom message.");
        LOGGER.info("                  ____                  _                  _               ");
        LOGGER.info("  /\\/\\  _   _    /___ \\_   _  __ _ _ __| | ___   _ ___    /_\\  _ __  _ __ ");
        LOGGER.info(" /    \\| | | |  //  / / | | |/ _` | '__| |/ / | | / __|  //_\\\\| '_ \\| '_ \\ ");
        LOGGER.info("/ /\\/\\ \\ |_| | / \\_/ /| |_| | (_| | |  |   <| |_| \\__ \\ /  _  \\ |_) | |_) |");
        LOGGER.info("\\/    \\/\\__, | \\___,_\\ \\__,_|\\__,_|_|  |_|\\_\\\\__,_|___/ \\_/ \\_/ .__/| .__/ ");
        LOGGER.info("        |___/                                                 |_|   |_|    ");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}