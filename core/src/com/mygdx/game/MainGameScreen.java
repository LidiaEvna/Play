package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.actors.ActorJugador;
import com.mygdx.game.actors.ActorPinchos;


public class MainGameScreen extends BaseScreen {
    public MainGameScreen (MainGame game) {
        super(game);
        texturaJugator=new Texture("minijoe.png");
        texturaPinchos=new Texture("pinchos.png");
        regionPinchos=new TextureRegion(texturaPinchos, 0, 64, 128, 64);


    }

    private Stage stage;
    private ActorJugador jugador;
    private ActorPinchos pinchos;
    private Texture texturaJugator, texturaPinchos;
    private TextureRegion regionPinchos;

    @Override
    public void show() {

        stage = new Stage();
        jugador = new ActorJugador(texturaJugator);
        pinchos=new ActorPinchos(regionPinchos);
        stage.addActor(jugador);
        stage.addActor(pinchos);
        jugador.setPosition(20,100);
        pinchos.setPosition(500,100);
    }
    @Override
    public void hide() {
        stage.dispose();

    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f, 0.5f, 0.8f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        comprobarColisiones();
        stage.draw();
    }
    private void comprobarColisiones(){
        if (jugador.isAlive()&&jugador.getX()+jugador.getWidth()>pinchos.getX()){
            System.out.println("Colision");
            jugador.setAlive(false);
            game.setScreen(game.gameOverScreen);
        }
    }
    @Override
    public void dispose() {
        texturaJugator.dispose();
    }
}