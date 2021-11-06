package model;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

import java.awt.*;

public class PlayerFactory {

    public GamePlayer getPlayer(String striker) {
        switch (striker) {
            case ("striker") -> {
                return new Striker("Striker", Color.blue);
            }

            case ("goalkeeper") -> {
                return new Goalkeeper("Goalkeeper", Color.yellow);
            }

            default -> {
                throw new IllegalArgumentException("Argument provided is neither a striker nor a goalkeeper");
            }
        }
    }
}
