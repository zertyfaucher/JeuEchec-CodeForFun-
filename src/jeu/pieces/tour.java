package jeu.pieces;

import jeu.plateau;

public class tour extends pieces {
    public tour(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public boolean coupPossible(couleur c, int x, int y, int x2, int y2){
        if (x2<0 || x2>7 || y2<0 || y2 > 7)// a voir
            return false;

        if (x != x2 && y==y2){
            if (x > x2) {
                for (int i = 1; i < x - x2; i++)
                    if (p.getCase(x - i, y) != null)
                        return false;
                if (p.getCase(x2,y2)==null|| p.getCase(x2,y2).getCouleur()!=c)
                    return true;
                return false;
            }
            for (int i = 1; i < x - x2; i++)
                if (p.getCase(x + i, y) != null)
                    return false;
            if (p.getCase(x2,y2)==null|| p.getCase(x2,y2).getCouleur()!=c)
                return true;
            return false;
        }
        if (x == x2 && y!=y2){
            if (y > y2){
                for (int i = 1; i < x - x2; i++)
                    if (p.getCase(x, y - i) != null)
                        return false;
                if (p.getCase(x2,y2)==null|| p.getCase(x2,y2).getCouleur()!=c)
                    return true;
                return false;
            }
            for (int i = 1; i < x - x2; i++)
                if (p.getCase(x, y - i) != null)
                    return false;
            if (p.getCase(x2,y2)==null|| p.getCase(x2,y2).getCouleur()!=c)
                return true;
            return false;
        }
        return false;
    }


    public String toString(){
        return "T";
    }
}
