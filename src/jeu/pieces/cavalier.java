package jeu.pieces;

import jeu.plateau;

public class cavalier extends pieces {
    public cavalier(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public String toString(){
        return "C";
    }
}
