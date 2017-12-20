/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platformexamplens.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 *
 * @author simon7323
 */
public class Player {

    private float x;
    private float y;
    private float elapsed;
    private Animation<TextureRegion> run;
    private TextureAtlas atlas;
    private TextureRegion stand;
    private float dx;
    private float dy;

    public Player(float x, float y) {
        this.x = x;
        this.y = y;
        this.dx = 0;
        this.dy = 0;
        this.elapsed = 0;

        this.atlas = new TextureAtlas("packed/player.atlas");
        Texture[] runFrames = new Texture[6];
        this.stand = atlas.findRegion("stand");
        run = new Animation(1f / 10f, atlas.findRegions("run"));
        run = new Animation(1f / 10f, atlas.findRegions("run"));
    }

    public void update(float deltaTime) {
        // if I'm pressing right
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            this.dx = 3;
            this.elapsed = this.elapsed + deltaTime;
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            this.dx = -3;
            this.elapsed = this.elapsed + deltaTime;
        } else {
            this.dx = 0;
            this.elapsed = 0;
        }

        this.x = this.x + this.dx;
    }
public void fixedCollision(){
    //are they colliding
    if(bounds.overlaps(block)){
        float width = Math.abs(bounds.y)
    }
}
    public void render(SpriteBatch batch) {
        // standing
        if (this.dx == 0) {
            batch.draw(stand, x, y);
        } else if (this.dx > 0) {
            batch.draw(run.getKeyFrame(elapsed, true), x, y);
        } else if (this.dx < 0) {
            batch.draw(run.getKeyFrame(elapsed, true), x, y);
        }
    }
    
}
