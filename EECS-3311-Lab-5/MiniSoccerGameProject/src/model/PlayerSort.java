package model;

import model.players.GamePlayer;

public class PlayerSort {

    // Singleton Class
    private static PlayerSort uniqInstance;

    private PlayerSort() {}
    public static PlayerSort getInstance() {
        if(uniqInstance == null) {
            uniqInstance = new PlayerSort();
        }
        return uniqInstance;
    }

    public void sort(GamePlayer[] gamePlayers) {
        if(gamePlayers[0].compareTo(gamePlayers[1]) > 0) {
            GamePlayer temp = gamePlayers[0];
            gamePlayers[0] = gamePlayers[1];
            gamePlayers[1] = temp;
        }
    }
}
