package IHM;

import jeu.pieces.couleur;
import jeu.plateau;

import java.util.Scanner;

public class tmp {
    private plateau p;
    public tmp(){
        this.p = new plateau();
        System.out.println(p);
        jouer();
    }
    public void jouer(){
        Scanner sc = new Scanner(System.in);
        String tmp;
        String tmp2;
        int x;
        int y;
        int x2;
        int y2;
        int inverse = 7;//car blanc en bas
        String clr = "blanc";
        while(true){
            System.out.println(p);
            System.out.println("entre case joueur : " + clr);
            tmp = sc.next();
            tmp2 = sc.next();
            x = inverse - (tmp.charAt(0)-49);// a changer juste pour les tests ...
            y = (tmp.charAt(1)-49);
            x2 = inverse - (tmp2.charAt(0)-49);
            y2 = (tmp2.charAt(1)-49);
            p.deplacer(couleur.valueOf(clr),x,y,x2,y2);//tmp
            clr = clr == "blanc"?"noir":"blanc";
            System.out.println("suite : ");
        }
    }
}
