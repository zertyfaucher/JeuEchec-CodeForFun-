package jeu.pieces;

public enum couleur {
    blanc("Blanc"),
    noir("Noir");

    private String symbole;

    couleur(String symbole) {
        this.symbole = symbole;
    }

    public String toString() {
        return "" + this.symbole;
    }

    public String getSymbole() {
        return this.symbole;
    }
}
