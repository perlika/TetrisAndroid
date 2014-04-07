package com.perlikacorp.tetris.game;


import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * 
 * WorldRenderer
 * -------------------------------------
 * Implementa la vista del juego
 * @author apasos
 *
 */
public class WorldRenderer {
	
    
    /**
     * Referencia al modelo
     */
    World world;
    
    /**
     * La camara a dibujar
     */
    OrthographicCamera  cam;
    
    /**
     * El atlas (las imagenes)
     */
    public TextureAtlas atlas;
    
    /**
     * El objeto que dibuja las cosas en pantalla
     */
    SpriteBatch batch;    
    
    BitmapFont font;
    
    
    private int i,j;
    /**
     *  constructor
     * @param world referencia a el modelo
     * @param manager reference al recoletor de recursos
     */
    public WorldRenderer(World world, AssetManager manager) {
        this.world = world;
        this.cam = new OrthographicCamera(480, 800);
        this.cam.position.set(240, 400,0f);
        this.cam.update();
        this.atlas = manager.get("game.atlas", TextureAtlas.class);
        this.batch = new SpriteBatch();
        this.batch.setProjectionMatrix(cam.combined);
        this.font = manager.get("default-32.fnt",BitmapFont.class);
    }
    

    /**
     * Main method to draw objects
     * @param delta
     */
    public void render(float delta) {

    	batch.begin();
    	
    	
    	
    	font.draw(batch, "Puntos: " + world.state.score, 0, 750);
    	
    	//Dibujar tablero
    	for (i=0;i<GameState.COLUMNAS;i++){
    		for (j=0;j<GameState.FILAS;j++){
    			if (world.state.tablero[j][i])
    				batch.draw(atlas.findRegion("darkgray"), 80+32*j, 64+32*i,32,32);
    			else
    				batch.draw(atlas.findRegion("white"), 80+32*j, 64+32*i,32,32);
    		}
    	}
        
    	Piece piece = world.state.currentPiece;
    	//Dibujar pieza
    	for (i=0;i<4;i++){
    		for(j=0;j<4;j++){
    			if (world.state.currentPiece.type[i][j]){
    				batch.draw(atlas.findRegion("blue"), 80+32*(piece.x+(j-2)),64+(piece.y+(i-2))*32,32,32);
    			}//else{
    				//batch.draw(atlas.findRegion("white"), 80+32*(piece.x+(j-2)),64+(piece.y+(i-2))*32,32,32);
    			//}
    		}
    	}
    	
    	
        batch.end();
        
    }
  
}
