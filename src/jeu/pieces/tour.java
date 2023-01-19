package jeu.pieces;

import jeu.plateau;

public class tour extends pieces {
    public tour(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public String toString(){
        return "T";
    }
}
