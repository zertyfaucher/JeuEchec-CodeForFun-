package jeu.pieces;

public enum couleur {
    blanc('B'),
    noir('N');

    private char symbole;

    couleur(char symbole) {
        this.symbole = symbole;
    }

    public String toString() {
        return "" + this.symbole;
    }

    public char getSymbole() {
        return this.symbole;
    }
}
