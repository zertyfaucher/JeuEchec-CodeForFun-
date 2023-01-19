package jeu.pieces;

import jeu.plateau;

public class fou extends pieces {
    public fou(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public String toString(){
        return "F";
    }
}
