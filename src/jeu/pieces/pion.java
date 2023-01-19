package jeu.pieces;

import jeu.plateau;

public class pion extends pieces {

    private boolean premierCoup = true;

    public pion(int x, int y, couleur c, plateau p){
        super(c,p,x,y);
    }

    //ajouter verif par rapport au roi et prise en passant donc ajouter bool au pion ?
    public boolean coupPossible(couleur c,int x, int y,int x2,int y2){//x l, y c
        if (x2<0 || x2>7 || y2<0 || y2 > 7)// a voir
            return false;

        int cote = c.getSymbole()== "Blanc"?1:-1;//lecture inverse si noir

        if (x2==x-cote) {
            if (y2 == y - 1 || y2 == y + 1)//ajout coup spe a faire avec le bool
                if (p.getC(x2, y2).getC() != c)
                    return true;
            if (y2 == y)
                if (p.getC(x2,y2)==null)
                    return true;
        }
        if (y2==y && x2 == x-(2*cote) && premierCoup)//ajout verif premier coup a faire
            if (p.getC(x2-(1*cote),y2)==null && p.getC(x2-(2*cote),y2) == null)
                return true;
        return false;
    }

    public void deplacement(couleur c,int x, int y,int x2,int y2){//x pos deb x2 pos final
        if (coupPossible(c,x,y,x2,y2));

    }

    public String toString(){
        return "P";
    }
}
