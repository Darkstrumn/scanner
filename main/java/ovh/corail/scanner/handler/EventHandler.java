package ovh.corail.scanner.handler;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ovh.corail.scanner.core.Main;

public class EventHandler {
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.getModID().equals(Main.MOD_ID)) {
			ConfigurationHandler.refreshConfig();
		}
	}
	
}
