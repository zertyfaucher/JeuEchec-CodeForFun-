package jeu;

import jeu.pieces.*;

public class plateau {
    private static final int TAILLE = 8;
    private static pieces[][] plateau;

    public plateau(){
        this.plateau = new pieces[TAILLE][TAILLE];
    }

    public void initP(){
        for (int a = 0; a < TAILLE; a++)
            setC(1,a,new pion(1,a,couleur.noir,this));
        setC(0,0,new tour(0,0, couleur.noir, this));
        setC(0,1,new cavalier(0,0, couleur.noir, this));
        setC(0,2,new fou(0,0, couleur.noir, this));
        setC(0,3,new reine(0,0, couleur.noir, this));
        setC(0,4,new roi(0,0, couleur.noir, this));
        setC(0,5,new fou(0,0, couleur.noir, this));
        setC(0,6,new cavalier(0,0, couleur.noir, this));
        setC(0,7,new tour(0,0, couleur.noir, this));

        for (int a = 0; a < TAILLE; a++)
            setC(7,a,new pion(7,a,couleur.blanc,this));
        setC(6,0,new tour(6,0, couleur.blanc, this));
        setC(6,1,new cavalier(6,0, couleur.blanc, this));
        setC(6,2,new fou(6,0, couleur.blanc, this));
        setC(6,3,new reine(6,0, couleur.blanc, this));
        setC(6,4,new roi(6,0, couleur.blanc, this));
        setC(6,5,new fou(6,0, couleur.blanc, this));
        setC(6,6,new cavalier(6,0, couleur.blanc, this));
        setC(6,7,new tour(6,0, couleur.blanc, this));
    }

    public void setC(int x, int y, pieces p){
        plateau[x][y] = p;
    }



}
