package com.perlikacorp.tetris.game;

public interface Pieces {
	public static final boolean[][] O = {{false,false,false,false},
		  {false,true,true,false},
		  {false,true,true,false},
		  {false,false,false,false}};

	public static final boolean[][] I_H = {{false,false,false,false},
				  {true,true,true,true},
				  {false,false,false,false},
				  {false,false,false,false}};
	
	public static final boolean[][] I_V = {{false,false,true,false},
			  {false,false,true,false},
			  {false,false,true,false},
			  {false,false,true,false}};
	
	public static final boolean[][] S_H = {{false,false,false,false},
				  {false,false,true,true},
				  {false,true,true,false},
				  {false,false,false,false}};
	
	public static final boolean[][] S_V = {{false,false,true,false},
				  {false,false,true,true},
				  {false,false,false,true},
				  {false,false,false,false}};

	public static final boolean[][] Z_H = {{false,false,false,false},
		  {false,true,true,false},
		  {false,false,true,true},
		  {false,false,false,false}};

public static final boolean[][] Z_V = {{false,false,false,true},
		  {false,false,true,true},
		  {false,false,true,false},
		  {false,false,false,false}};
	
	public static final boolean[][] L_1 = {{false,false,false,false},
				  {false,true,true,true},
				  {false,true,false,false},
				  {false,false,false,false}};
	
	public static final boolean[][] L_2 = {{false,false,true,false},
				  {false,false,true,false},
				  {false,false,true,true},
				  {false,false,false,false}};
	
	public static final boolean[][] L_3 = {{false,false,false,true},
				  {false,true,true,true},
				  {false,false,false,false},
				  {false,false,false,false}};
	
	public static final boolean[][] L_4 = {{false,true,true,false},
					  {false,false,true,false},
					  {false,false,true,false},
					  {false,false,false,false}};
	

	public static final boolean[][] J_1 = {{false,false,false,false},
				  {false,true,true,true},
				  {false,false,false,true},
				  {false,false,false,false}};
	
	public static final boolean[][] J_2 = {{false,false,true,true},
				  {false,false,true,false},
				  {false,false,true,false},
				  {false,false,false,false}};
	
	public static final boolean[][] J_3 = {{false,true,false,false},
				  {false,true,true,true},
				  {false,false,false,false},
				  {false,false,false,false}};
	
	public static final boolean[][] J_4 = {{false,false,true,false},
					  {false,false,true,false},
					  {false,true,true,false},
					  {false,false,false,false}};


	public static final boolean[][] T_1 = {{false,false,false,false},
				  {false,true,true,true},
				  {false,false,true,false},
				  {false,false,false,false}};
	
	public static final boolean[][] T_2 = {{false,false,true,false},
				  {false,false,true,true},
				  {false,false,true,false},
				  {false,false,false,false}};
	
	public static final boolean[][] T_3 = {{false,false,true,false},
				  {false,true,true,true},
				  {false,false,false,false},
				  {false,false,false,false}};
	
	public static final boolean[][] T_4 = {{false,false,true,false},
					  {false,true,true,false},
					  {false,false,true,false},
					  {false,false,false,false}};

	public static final int NUM_PIECES = 7;
	public static final int TRANSITIONS = 4;
	
	public static final boolean[][][][] PIECES = {
		{O,O,O,O},
		{I_H,I_V,I_H,I_V},
		{S_H,S_V,S_H,S_V},
		{Z_H,Z_V,Z_H,Z_V},

		{L_1,L_2,L_3,L_4},
		{J_1,J_2,J_3,J_4},
		{T_1,T_2,T_3,T_4}

	};
	
}
