package com.redsponge.oneroom.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.redsponge.oneroom.OneRoom;

/** Launches the desktop (LWJGL) application. */
public class DesktopLauncher {
	public static void main(String[] args) {
		createApplication();
	}

	private static LwjglApplication createApplication() {
		return new LwjglApplication(new OneRoom(), getDefaultConfiguration());
	}

	private static LwjglApplicationConfiguration getDefaultConfiguration() {
		LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
		configuration.title = "No Escape";
		configuration.width = 640;
		configuration.height = 480;
		for (int size : new int[] { 128, 64, 32, 16 }) {
			configuration.addIcon("noescapex" + size + ".png", FileType.Internal);
		}
		return configuration;
	}
}