package jeu.pieces;

import jeu.plateau;

public class roi extends pieces {
    public roi(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public boolean coupPossible(couleur c, int x, int y, int x2, int y2){
        int tmpX = Math.abs(x2 - x);
        int tmpY = Math.abs(y2 - y);
        if ((tmpX == 1 || tmpX == 0)&&(tmpY == 1 || tmpY == 0))
            if (x+1==x2 || x-1==x2 || y-1 == y2 || y+1 == y2)
                if (p.getCase(x2,y2)==null || p.getCase(x2,y2).getCouleur() != c)
                    return true;
        return false;
    }

    public String toString(){
        return "K";
    }
}