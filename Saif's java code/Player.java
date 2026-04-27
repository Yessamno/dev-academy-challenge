class Player {
    String player1Name;
    String player2Name;
    int player1Score;
    int player2Score;

    Player(String player1Name, String player2Name, int player1Score, int player2Score) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }
    public int getPlayer2Score() {
        return player2Score;
    }
    public String getPlayer1Name() {
        return player1Name;
    }
    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }
    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }
    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public void SwitchPlayer() {
        if(currentPlayer == player1Name){
            currentPlayer == player2Name;
        }else{
            currentPlayer == player1Name;
        }
    }
}