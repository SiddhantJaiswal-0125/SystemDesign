package tictactoe.models;

public class Player {
    String uName;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    PlayingPiece playingPiece;
    public Player(String uName, PlayingPiece playingPiece)
    {
        this.uName = uName;
        this.playingPiece = playingPiece;
    }
}
