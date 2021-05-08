package Day17;

public enum ChessPiece {
    KING_WHITE(100,"KW"), KING_BLACK(100,"KB"),
    QUEEN_WHITE(9,"QW"), QUEEN_BLACK(9,"QB"),
    ROOK_WITHE(5,"RW"), ROOK_BLACK(9,"RB"),
    BISHOP_WHITE(3.5,"BW"), BISHOP_BACK(3.5,"BB"),
    KNIGHT_WHITE(3,"KGW"),KNIGHT_BLACK(3,"KGB"),
    PAWN_WHITE(1,"PW"),PAWN_BLACK(3,"PB"),
    EMPTY(-1,"_");

    private double value;
    private String representation;

    ChessPiece(double value, String representation) {
        this.value = value;
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }


}
