package com.mygdx.game;

public class RuleEngine {
          int nbSouls;
          
          
           public RuleEngine()
           {
        	   this.nbSouls = 0;
           }


		public int getNbSouls() {
			return nbSouls;
		}


		public void setNbSouls(int nbSouls) {
			this.nbSouls = nbSouls;
		}


		public void addTurn() {
			this.nbSouls += 10;
			
		}






           
           
	
}
