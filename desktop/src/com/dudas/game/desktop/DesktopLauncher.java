package com.dudas.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dudas.game.MatchLayout;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "MatchLayout";
		config.width = 1280;
//		config.width = 800;
		config.height = 720;
//		config.height = 600;
		new LwjglApplication(new MatchLayout(), config);
	}
}
