package jeu.pieces;

import jeu.plateau;

public abstract class pieces {
    static plateau p;
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

    public abstract boolean coupPossible(couleur c, int x, int y, int x2, int y2);

    @Override
    public String toString() {
        return "erreur";
    }

}
