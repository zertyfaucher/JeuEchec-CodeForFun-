package jeu.pieces;

import jeu.plateau;

public class roi extends pieces {
    public roi(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public boolean coupPossible(couleur c, int x, int y, int x2, int y2){
        return false;
    }

    public String toString(){
        return "K";
    }
}
