package com.mygdx.game.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;


public class ActorJugador extends Actor {

    private Texture jugator;
    private boolean alive;

    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {

        this.alive = alive;
    }
    public ActorJugador(Texture jugator){
        this.jugator=jugator;
        this.alive=true;
        setSize(jugator.getWidth(), jugator.getHeight());
    }
    public void act (float delta){
        super.act(delta);
    }
    public void draw (Batch batch, float parentAlpha){
        batch.draw(jugator, getX(), getY());
    }
    public void dispose(){

    }
}