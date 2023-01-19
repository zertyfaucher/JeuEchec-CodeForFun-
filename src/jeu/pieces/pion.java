package jeu.pieces;

import jeu.plateau;

public class pion extends pieces {
    public pion(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public String toString(){
        return "P";
    }
}
