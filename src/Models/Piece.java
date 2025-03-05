package Models;

public class Piece {
    private int piece = 500;

    public Piece(int piece) {
        this.piece = piece;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public String toString() {
        return "Pièce: " + piece;
    }
}
