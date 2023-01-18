package jeu;

import jeu.pieces.couleur;
import jeu.pieces.pieces;
import jeu.pieces.tour;

public class plateau {
    private static final int TAILLE = 8;
    private static pieces[][] plateau;

    public plateau(){
        this.plateau = new pieces[TAILLE][TAILLE];
    }

    public void initP(){
        setC(0,0,new tour(0,0, couleur.noir, this));
        setC(0,1,new tour(0,0, couleur.noir, this));
        setC(0,2,new tour(0,0, couleur.noir, this));
        setC(0,3,new tour(0,0, couleur.noir, this));
        setC(0,4,new tour(0,0, couleur.noir, this));
        setC(0,5,new tour(0,0, couleur.noir, this));
        setC(0,6,new tour(0,0, couleur.noir, this));
        setC(0,7,new tour(0,0, couleur.noir, this));

        setC(7,0,new tour(7,0, couleur.blanc, this));
        setC(7,1,new tour(7,0, couleur.blanc, this));
        setC(7,2,new tour(7,0, couleur.blanc, this));
        setC(7,3,new tour(7,0, couleur.blanc, this));
        setC(7,4,new tour(7,0, couleur.blanc, this));
        setC(7,5,new tour(7,0, couleur.blanc, this));
        setC(7,6,new tour(7,0, couleur.blanc, this));
        setC(7,7,new tour(7,0, couleur.blanc, this));
    }

    public void setC(int x, int y, pieces p){
        plateau[x][y] = p;
    }



}
