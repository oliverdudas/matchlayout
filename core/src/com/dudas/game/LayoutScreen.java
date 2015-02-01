package com.dudas.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

/**
 * Created by OLO on 31. 1. 2015
 */
public class LayoutScreen extends AbstractGameScreen {

    private static final String TAG = LayoutScreen.class.getName();
    public static final int BOARD_POSITION_X = 8;
    public static final int BOARD_POSITION_Y = 1;
    public static final int BOARD_WIDTH = 9;
    public static final int BOARD_HEIGHT = 9;
    public static final int BOARD_RELATIVE_X = 0;
    public static final int BOARD_RELATIVE_Y = 0;

    private Stage stage;
    private Group group;

    public LayoutScreen(Game game) {
        super(game);
    }

    @Override
    public void render(float deltaTime) {
        Gdx.gl.glClearColor(0.0f, 0.5f, 1.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        initStage();
        initStack();
        initGameContainerActor();
        initGemActors();
    }

    private void initGemActors() {
        group.addActor(createGemActor(0, 0));
        group.addActor(createGemActor(1, 1));
        group.addActor(createGemActor(2, 2));
        group.addActor(createGemActor(3, 3));
        group.addActor(createGemActor(5, 9));
    }

    private GemActor createGemActor(float x, float y) {
        GemActor gemActor = new GemActor();
        gemActor.setBounds(x, y, 1, 1);
        return gemActor;
    }

    private void initStack() {
        group = new Group();
        stage.addActor(group);

        group.setPosition(BOARD_POSITION_X, BOARD_POSITION_Y);
        group.setWidth(BOARD_WIDTH);
        group.setHeight(BOARD_HEIGHT);
//        group.setBounds(8, 1, 9, 9);
//        group.clipBegin(8, 1, 9, 9);
//        group.clipEnd();
//        group.setFillParent(true);
        group.setTransform(true);

//        group.setCullingArea(new Rectangle(8, 10, 9, 1));

    }

    private void initGameContainerActor() {
        GameContainerActor containerActor = new GameContainerActor();
        containerActor.setBounds(BOARD_RELATIVE_X, BOARD_RELATIVE_Y, group.getWidth(), group.getHeight());
        containerActor.setTouchable(Touchable.enabled);
        group.addActor(containerActor);
    }

    private void initStage() {
        ExtendViewport viewport = new ExtendViewport(17, 11);
        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
