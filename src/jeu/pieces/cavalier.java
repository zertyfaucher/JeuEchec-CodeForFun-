package jeu.pieces;

import jeu.plateau;

public class cavalier extends pieces {
    public cavalier(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public String toString(){
        return "C";
    }

    public boolean coupPossible(couleur c, int x, int y, int x2, int y2){
        if (x2<0 || x2>7 || y2<0 || y2 > 7)// a voir
            return false;
        if (((x == x2+1||x==x2-1)&&(y==y2-2||y==y2+2))||((x==x2-2||x==x2+2)&&(y==y2-1||y==y2+1)))
            if (p.getCase(x2, y2)==null||p.getCase(x2, y2).getCouleur()!=c)
                return true;
        return false;
    }
}
