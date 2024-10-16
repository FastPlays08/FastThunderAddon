package fastplays.addon;

import fastplays.addon.commands.ExampleCommand;
import fastplays.addon.hud.ExampleHudElement;
import fastplays.addon.modules.AntiCrawl;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thunder.hack.api.IAddon;
import thunder.hack.features.cmd.Command;
import thunder.hack.features.hud.HudElement;
import thunder.hack.features.modules.Module;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class fastaddon implements IAddon {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}

	@Override
	public List<Module> getModules() {
		// Return a list of your modules here
		return Arrays.asList(new AntiCrawl());
	}

	@Override
	public List<Command> getCommands() {
		return Arrays.asList(new ExampleCommand());
		return Arrays.asList(new shutdowncommand());
	}

	@Override
	public List<HudElement> getHudElements() {
		return Arrays.asList(new ExampleHudElement());
	}

	@Override
	public String getPackage() {
		return "fastplays.addon";
	}

	@Override
	public String getName() {
		return "FastAddon";
	}

	@Override
	public String getAuthor() {
		return "fastplays08";
	}

	@Override
	public String getRepo() {
		return "https://github.com/cvs0/ThunderHack-Recode-Addon-Template";
	}

	@Override
	public String getVersion() {
		return "1.0.0";
	}
}
