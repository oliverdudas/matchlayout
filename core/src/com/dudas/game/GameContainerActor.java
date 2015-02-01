package com.dudas.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by OLO on 31. 1. 2015
 */
public class GameContainerActor extends Actor {

    private Texture texture;

    public GameContainerActor() {
        init();
    }

    private void init() {
        texture = new Texture(Gdx.files.internal("board.PNG"));
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    }


}
