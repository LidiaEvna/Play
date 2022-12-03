package com.mygdx.game;

import com.badlogic.gdx.Game;

public class MainGame extends Game {

	public MainGameScreen gameScreen;
	public GameOverScreen gameOverScreen;
	public MenuScreen menuScreen;

	@Override
	public void create () {
		menuScreen=new MenuScreen(this);
		gameScreen=new MainGameScreen(this);
		gameOverScreen=new GameOverScreen(this);
		setScreen(menuScreen);

		setScreen(new MainGameScreen(this));
	}
}
