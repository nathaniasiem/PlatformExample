/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platformexamplens.game;

import com.badlogic.gdx.Screen;

/**
 *
 * @author simon7323
 */
public class MainGame implements Screen {
    
    private PlatformExample game;
    Player p1;
    
    public MainGame(PlatformExample game){
        this.game = game;
        p1 = 
    }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render(float deltaTime) {
       //update the player
        p1.update(deltaTime);
        
        //draw the player
        
    }

    @Override
    public void resize(int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
