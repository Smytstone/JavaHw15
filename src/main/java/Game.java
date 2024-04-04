import java.util.HashMap;
import java.util.Map;

public class Game {
    private Map<String, Player> players = new HashMap<>();


    public void addPlayer(String name, Player player) {
        players.put(name, player);
    }

    public int round(String playerName1, String playerName2) {
        Player firstPlayer = players.get(playerName1);
        Player secondPlayer = players.get(playerName2);
        if (firstPlayer == null || secondPlayer == null) {
            throw new NotRegisteredException(
                    "Player not registered"
            );
        }
        int result;
        if (firstPlayer.getStrength() > secondPlayer.getStrength()) {
            result = 1;
        } else if (firstPlayer.getStrength() < secondPlayer.getStrength()) {
            result = 2;
        } else {
            result = 0;
        }

        return result;
    }

}
