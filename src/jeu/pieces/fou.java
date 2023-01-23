package jeu.pieces;

import jeu.plateau;

public class fou extends pieces {
    public fou(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    public String toString(){
        return "F";
    }

    public boolean coupPossible(couleur c, int x, int y, int x2, int y2){
        if (x2<0 || x2>7 || y2<0 || y2 > 7)// a voir
            return false;
        if (x < x2) {//voir possi opti
            if (y < y2){
                for (int i = 1;i<x2-x;i++)
                    if (p.getCase(i+x,i+y)!=null)
                        return false;
                if (p.getCase(x2, y2)==null || p.getCase(x2,y2).getCouleur()!=c)
                    return true;
                return false;
            }
            else if (y>y2){
                for (int i = 1;i<x2-x;i++)
                    if (p.getCase(i+x,y-i)!=null)
                        return false;
                if (p.getCase(x2, y2)==null || p.getCase(x2,y2).getCouleur()!=c)
                    return true;
                return false;
            }
        } else if (x>x2){
            if (y<y2){
                for (int i = 1;i<x-x2;i++)
                    if (p.getCase(x-i,i+y)!=null)
                        return false;
                if (p.getCase(x2, y2)==null || p.getCase(x2,y2).getCouleur()!=c)
                    return true;
                return false;
            }
            else if (y>y2){
                for (int i = 1;i<x-x2;i++) {
                    if (p.getCase(x-i, i - y) != null)
                        return false;
                }
                if (p.getCase(x2, y2)==null||p.getCase(x2,y2).getCouleur()!=c)
                    return true;
                return false;
            }
        }
        return false;
    }
}
