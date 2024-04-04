public class Game {
    private Player[] players = new Player[0];

    private Player[] addToArray(Player[] current, Player player) {
        Player[] tmp = new Player[current.length + 1];
        for (int i = 0; i < current.length; i++) {
            tmp[i] = current[i];
        }
        tmp[tmp.length - 1] = player;
        return tmp;
    }

    public void register(Player player) {
        players = addToArray(players, player);
    }

    public Player findByName(String name) {
        for (Player player : players) {
            if (player.getName() == name) {
                return player;
            }
        }
        return null;
    }

    public int round(String playerName1, String playerName2) {
        Player firstPlayer = findByName(playerName1);
        Player secondPlayer = findByName(playerName2);
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
