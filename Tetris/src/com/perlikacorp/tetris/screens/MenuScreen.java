package com.perlikacorp.tetris.screens;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.perlikacorp.tetris.TetrisGame;

public class MenuScreen extends AbstractScreen {

	    public MenuScreen(
	        TetrisGame game )
	    {
	        super( game );
	    }

	    @Override
	    public void show()
	    {
	        super.show();

	        Table table = super.getTable();
	        table.setBackground("background");
	        
	        
	        
	        Label titleLabel = new Label("El Tetris",getSkin(),"title");
	        table.add(titleLabel).expandY().top().padTop(100);
	        table.row();
	        
	        TextButton startGameButton = new TextButton( "Jugar", getSkin() );
	        
	        startGameButton.addListener( new ClickListener() {
	            @Override
	            public void clicked (InputEvent event, float x, float y)
	            {
	            	game.setScreen(new GameScreen(game));
	            }
	        } );
	        table.add( startGameButton ).size( 300, 80 ).expandY().top();
	        table.row();

	    }
}
