package jeu;

import jeu.pieces.*;

public class plateau {
    private static final int TAILLE = 8;
    private static pieces[][] plateau;
    private static boolean priseEnPassantPossible;
    private static pieces dernierePiece;
    private int cote;

    public plateau(){
        this.plateau = new pieces[TAILLE][TAILLE];
        initP();
    }

    public void initP(){
        for (int a = 0; a < TAILLE; a++) {
            setC(1, a, new pion(1, a, couleur.noir, this));
            setC(6,a,new pion(6,a,couleur.blanc,this));
        }
        setC(0,0,new tour(0,0, couleur.noir, this));
        setC(0,1,new cavalier(0,1, couleur.noir, this));
        setC(0,2,new fou(0,2, couleur.noir, this));
        setC(0,3,new reine(0,3, couleur.noir, this));
        setC(0,4,new roi(0,4, couleur.noir, this));
        setC(0,5,new fou(0,5, couleur.noir, this));
        setC(0,6,new cavalier(0,6, couleur.noir, this));
        setC(0,7,new tour(0,7, couleur.noir, this));

        setC(7,0,new tour(7,0, couleur.blanc, this));
        setC(7,1,new cavalier(7,1, couleur.blanc, this));
        setC(7,2,new fou(7,2, couleur.blanc, this));
        setC(7,3,new reine(7,3, couleur.blanc, this));
        setC(7,4,new roi(7,4, couleur.blanc, this));
        setC(7,5,new fou(7,5, couleur.blanc, this));
        setC(7,6,new cavalier(7,6, couleur.blanc, this));
        setC(7,7,new tour(7,7, couleur.blanc, this));
    }

    public static void setC(int x, int y, pieces p){
        plateau[x][y] = p;
    }

    public pieces getCase(int x,int y){
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

    public void deplacer(couleur c, int x, int y, int x2, int y2) {
        if (plateau[x][y].coupPossible(c,x,y,x2,y2)) {
            if (plateau[x][y] instanceof pion) {//verif prise en passant (pion)
                verifPriseEnPassantPossible(x, y, x2, y2);
            }else priseEnPassantPossible = false;
            plateau[x2][y2] = plateau[x][y];
            plateau[x][y] = null;
            dernierePiece = plateau[x2][y2];//sauvegarde le dernier coup joue
            ValideEtSetPriseEnPassant(x2, y2);//si condition prise en passant valide alors effectue suppr du pion ennemi
        }else System.out.println("err");// a modif par rejouer ou jsp
    }

    private void verifPriseEnPassantPossible(int x,int y,int x2,int y2){// methode pour pion
        cote = plateau[x][y].getCouleur().getSymbole() == "Blanc" ? -1 : 1;
        if (y2==y && x == x2-(2*cote)){
            priseEnPassantPossible = true;
        }else priseEnPassantPossible = false;
    }

    private void ValideEtSetPriseEnPassant(int x2, int y2){// methode pour pion
        if (pion.getPriseEnPassantValide()){
            cote = plateau[x2][y2].getCouleur().getSymbole() == "Blanc" ? -1 : 1;
            plateau[x2 - cote][y2] = null;
            pion.setPriseEnPassantValide();
        }
    }

    public static boolean GetPriseEnPassantPossible() {
        return priseEnPassantPossible;
    }

    public static pieces getDernierePiece() {
        return dernierePiece;
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
