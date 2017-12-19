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

/**
 *
 * @author simon7323
 */
public class Player {
    private float x;
    private float y;
    
    private float elapsed;
    
    private Animation<Texture>run;
    private Texture stand;
    
    private float dx;
    private float dy;
    
    
    public Player(float x,float y){
        this.x=x;
        this.y=y;
        this.dx = 0;
        this.dy=0;
        this.elapsed=0;
        this.stand=new Texture("raw/stand.png");
        Texture[]runFrames = new Texture[6];
        for (int i = 0;i<6;i++){
            runFrames[i]= new Texture("raw/run_"+i+".png");
        }
        //need the 'f' to indicate that it is floats not integers
        run = new Animation(1f/10f,runFrames);
    }
    
    public void update(float deltaTime){
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
        this.dx = 3;
        this.elapsed=this.elapsed +deltaTime;
    }else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
        this.dy = -3;
        
    }else{
    this.dx = 0;
    this.elapsed = 0;
}
this.x = this.x+this.dx;
    public void render(SpriteBatch batch){
        //standing
        if(this.dx== 0){
    }
}
