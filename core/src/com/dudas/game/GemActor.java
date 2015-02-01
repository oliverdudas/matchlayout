package com.dudas.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by OLO on 1. 2. 2015
 */
public class GemActor extends Actor {

    private Texture texture;

    public GemActor() {
        init();
    }

    private void init() {
        texture = new Texture(Gdx.files.internal("green_square.PNG"));
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
//        Color color = getColor();
//        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
//        batch.draw(region, getX(), getY(), getOriginX(), getOriginY(),
//                getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    }
}
