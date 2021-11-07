package model;

import model.players.GamePlayer;

import java.util.Iterator;

public class PlayerCollection implements Iterable<GamePlayer>{

    private GamePlayer[] players = new GamePlayer[2];
    private int index = 0;

    public PlayerCollection() {}

    // Can do a test on this to check whether the code allows more than 2 players or not

    public void add(GamePlayer player) {
        if(index >= 2) {
            throw new RuntimeException("More than 2 number of Players");
        }
        players[index++] = player;
    }

    public GamePlayer get(String player) {
        for(int i = 0; i < 2; i++) {
            if(players[i].getPlayerName().equals(player)) {
                return players[i];
            }
        }   // If player could not be found then throw an exception.
            throw new RuntimeException("Player Could not be found");

    }

    private class PlayerCollectionIterator implements Iterator<GamePlayer>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index <= 1;
        }

        @Override
        public GamePlayer next() {
            return players[index++];
        }
    }
    @Override
    public Iterator<GamePlayer> iterator() {
        return new PlayerCollectionIterator();
    }

    public void sort() {
        PlayerSort playerSort = PlayerSort.getInstance();
        playerSort.sort(players);
    }

    GamePlayer[] getPlayers() {
        return players;
    }
}
