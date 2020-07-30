package me.auropol.bluemint.rpc;

import me.auropol.bluemint.primitive.Task;
import me.auropol.bluemint.rpc.util.DiscordEventHandlers;
import me.auropol.bluemint.rpc.util.DiscordRPC;
import me.auropol.bluemint.rpc.util.DiscordRichPresence;
import me.auropol.bluemint.util.Logger;
import me.auropol.bluemint.util.RandStream;
import me.auropol.bluemint.util.Thread;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RichPresenceCreator {
    private static DiscordRPC rpc;
    static {
        rpc = DiscordRPC.INSTANCE;
        presence = new DiscordRichPresence();
    }
    private static DiscordRichPresence presence;
    public void createSimpleRichPresence(String appID, String state, String details, String imageDesc, String imagePath)  {
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        rpc.Discord_Initialize(appID, handlers, true, "");
        presence.details = details;
        presence.state = state;
        presence.largeImageKey = imagePath;
        presence.largeImageText = imageDesc;
        rpc.Discord_UpdatePresence(presence);
        try {
            presence.details = details;
            presence.state = state;
            presence.largeImageKey = imagePath;
            presence.largeImageText = imageDesc;
        } catch(Exception exc) {
            exc.printStackTrace();
        }
    }
    public void createRichPresenceFromArrays(String appID, String[] states, String[] details, String[] imageDescriptions, String[] imagePaths, boolean constantlyUpdateAsGif, boolean updateImagesRandomly) {
        String detail = RandStream.pickFrom(details);
        String state = RandStream.pickFrom(states);
        String imageText = RandStream.pickFrom(imageDescriptions);
        final DiscordEventHandlers handlers = new DiscordEventHandlers();
        final Thread thread = new Thread() {
            @Override
            public String name() {
                return "BLUEMINT-RICHPRESENCE";
            }
        };
        rpc.Discord_Initialize(appID, handlers, true, "");
        presence.details = detail;
        presence.state = state;
        presence.largeImageKey = RandStream.pickFrom(imagePaths);
        presence.largeImageText = imageText;
        if(constantlyUpdateAsGif) {
            Logger.manage().info("Gif enabled", thread);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    rpc.Discord_UpdatePresence(presence);
                }
            };
            if(new Random().nextBoolean()) {
                rpc.Discord_UpdatePresence(presence);
            }
            try {
                if(updateImagesRandomly) {
                    presence.details = detail;
                    presence.state = state;
                    presence.largeImageKey = RandStream.pickFrom(imagePaths);
                    presence.largeImageText = imageText;
                } else  {
                    presence.details = detail;
                    presence.state = state;
                    presence.largeImageKey = RandStream.pickGradientlyFrom(imagePaths);
                    presence.largeImageText = imageText;
                }

            } catch(Exception exc) {
                exc.printStackTrace();
            }
        } else {
            Logger.manage().info("Gif disabled", thread);
        }
    }
}
