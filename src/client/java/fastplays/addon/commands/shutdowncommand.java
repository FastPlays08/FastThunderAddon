package fastplays.addon.modules;

import meteordevelopment.orbit.EventHandler;
import meteordevelopment.orbit.EventManager;

import java.awt.*;
import java.io.IOException;
import org.slf4j.Logger;

// I would like to say that I wrote 1% of this and have not tested so don't use!!!

public class ShutdownModule {
    public static final Logger LOGGER = LogUtils.getLogger();

    @EventHandler
    public void onShutdown() {
        // Determine the operating system
        String os = System.getProperty("os.name").toLowerCase();

        try {
            // Handle shutdown based on the operating system
            if (os.contains("windows")) {
                Runtime.getRuntime().exec("shutdown -s -t 0");
            } else if (os.contains("linux") || os.contains("unix")) {
                Runtime.getRuntime().exec("shutdown -h now");
            } else if (os.contains("mac os")) {
                Runtime.getRuntime().exec("shutdown -h now");
            } else {
                // Handle unsupported operating systems or display a message
                Toolkit.getDefaultToolkit().beep();
                LOGGER.info("[ThunderHack] Could not shut down due to Unsupported operating system!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
