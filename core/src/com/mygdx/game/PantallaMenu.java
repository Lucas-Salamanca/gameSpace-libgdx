package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;


public class PantallaMenu implements Screen {

	//private SpaceNavigation game;
	private OrthographicCamera camera;

	public PantallaMenu() {
		//this.game = game;
        
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1200, 800);
	}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(0, 0, 0.2f, 1);

		camera.update();
		SpaceNavigation.getInstance().getBatch().setProjectionMatrix(camera.combined);
		//game.getBatch().setProjectionMatrix(camera.combined);
		
		SpaceNavigation.getInstance().getBatch().begin();
		SpaceNavigation.getInstance().getFont().draw(SpaceNavigation.getInstance().getBatch(),
				"Bienvenido a Space Navigation !", 140, 400);
		SpaceNavigation.getInstance().getFont().draw(SpaceNavigation.getInstance().getBatch(),
				"Pincha en cualquier lado o presiona cualquier tecla para comenzar ...", 100, 300);
		//game.getBatch().begin();
		//game.getFont().draw(game.getBatch(), "Bienvenido a Space Navigation !", 140, 400);
		//game.getFont().draw(game.getBatch(), "Pincha en cualquier lado o presiona cualquier tecla para comenzar ...", 100, 300);
		
		SpaceNavigation.getInstance().getBatch().end();
		//game.getBatch().end();

		if (Gdx.input.isTouched() || Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
			Screen ss = new PantallaJuego(1,5,0,1,1,5);
			ss.resize(1200, 800);
			SpaceNavigation.getInstance().setScreen(ss);
			//game.setScreen(ss);
			dispose();
		}
	}
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
   
}