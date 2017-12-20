package com.platformexamplens.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlatformExample extends ApplicationAdapter {
	SpriteBatch batch;
	
	@Override
	public void create () {
		 batch = new SpriteBatch();
            // create the main game screen
            MainGame game = new MainGame(this);
            // set the screen to show it
            this.setScreen(game);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		 batch.dispose();
	}
          public SpriteBatch getBatch(){
            return batch;
        }
}
