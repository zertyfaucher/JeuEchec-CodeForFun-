package jeu;

import jeu.pieces.*;

public class plateau {
    private static final int TAILLE = 8;
    private static pieces[][] plateau;

    public plateau(){
        this.plateau = new pieces[TAILLE][TAILLE];
        initP();
    }

    public void initP(){
        for (int a = 0; a < TAILLE; a++) {
            setC(6, a, new pion(6, a, couleur.noir, this));
            setC(1,a,new pion(1,a,couleur.blanc,this));
        }
        setC(7,0,new tour(7,0, couleur.noir, this));
        setC(7,1,new cavalier(7,0, couleur.noir, this));
        setC(7,2,new fou(7,0, couleur.noir, this));
        setC(7,3,new reine(7,0, couleur.noir, this));
        setC(7,4,new roi(7,0, couleur.noir, this));
        setC(7,5,new fou(7,0, couleur.noir, this));
        setC(7,6,new cavalier(7,0, couleur.noir, this));
        setC(7,7,new tour(7,0, couleur.noir, this));

        setC(0,0,new tour(0,0, couleur.blanc, this));
        setC(0,1,new cavalier(0,0, couleur.blanc, this));
        setC(0,2,new fou(0,0, couleur.blanc, this));
        setC(0,3,new reine(0,0, couleur.blanc, this));
        setC(0,4,new roi(0,0, couleur.blanc, this));
        setC(0,5,new fou(0,0, couleur.blanc, this));
        setC(0,6,new cavalier(0,0, couleur.blanc, this));
        setC(0,7,new tour(0,0, couleur.blanc, this));
    }

    public void setC(int x, int y, pieces p){
        plateau[x][y] = p;
    }

    public pieces getC(int x,int y){
        return (x<0 || x>7 || y<0 || y>7) ? null : plateau[x][y];
    }

    private String CadreJeu(){
        String s = "";
        s += "  ";
        for (int cadreTop = 0;cadreTop<TAILLE;cadreTop++)
            s +=" ---";
        s+="\n";
        return s;
    }

    public String toString(){
        String s = "";
        int cpt = TAILLE;
        for (int y=0;y<TAILLE;y++) {
            s += CadreJeu();
            s += cpt + " | ";
            for (int x=0;x<TAILLE;x++) {
                if (plateau[y][x] == null)
                    s += ". | ";
                else
                    s += plateau[y][x].toString() + " | ";
            }
            s += "\n";
            cpt--;
        }
        s += CadreJeu();
        s += "   ";
        cpt = 0;
        for (char c = 'A'; c <= 'Z'; c++){
            if(cpt == TAILLE)
                break;
            cpt++;
            s += " " + c + "  ";
        }
        return s;//affichage plateau
    }
}
