package jeu.pieces;

import jeu.plateau;

public class pieces {
    plateau p;
    couleur c;
    int x, y;
    pieces(couleur c,plateau p, int x, int y){
        this.c = c;
        this.p = p;
        this.x = x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public couleur getC() {return c;}

    @Override
    public String toString() {
        return "erreur";
    }


}
