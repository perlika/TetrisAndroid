package com.perlikacorp.tetris.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.perlikacorp.tetris.TetrisGame;
import com.perlikacorp.tetris.game.World;
import com.perlikacorp.tetris.game.WorldRenderer;

/**
 * La base para todas las pantallas de juego
 * @author apasos
 *
 */
public class AbstractGameScreen extends AbstractScreen{

	protected World world;
	protected WorldRenderer renderer;
	
	
	public AbstractGameScreen(TetrisGame game) {
		super(game);
		
	    world = game.world;
	    renderer = game.renderer;

	}

	public void show(){
		super.show();
	    
	}
	
	@Override
	public void render(float delta){
        stage.act( delta );

        Gdx.gl.glClearColor( 0,0,0, 1f );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );

        // update and draw the stage actors
        stage.draw();
        Table.drawDebug(stage);
        
        if (world!=null) {
            world.update(delta);
            renderer.render(delta);
    }


	}

	

}
