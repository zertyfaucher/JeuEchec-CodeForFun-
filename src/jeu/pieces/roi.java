package jeu.pieces;

import jeu.plateau;

public class roi extends pieces {
    public roi(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public String toString(){
        return "K";
    }
}
