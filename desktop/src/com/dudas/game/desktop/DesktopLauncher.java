package com.dudas.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dudas.game.MatchLayout;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "MatchLayout";
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new MatchLayout(), config);
	}
}
