import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void shouldRunExceptionTestCase1() {
        Player playerOne = new Player(1, "Smut", 3);
        Player playerTwo = new Player(2, "Stone", 1);

        Game game = new Game();
        game.register(playerOne);
        game.register(playerTwo);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Smit", "Stone");
        });
    }

    @Test
    public void shouldRunExceptionTestCase2() {
        Player playerOne = new Player(1, "Smut", 3);
        Player playerTwo = new Player(2, "Stone", 1);

        Game game = new Game();
        game.register(playerOne);
        game.register(playerTwo);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Smut", "Stine");
        });
    }

    @Test
    public void shouldWinPlayerOne() {
        Player playerOne = new Player(1, "Smut", 3);
        Player playerTwo = new Player(2, "Stone", 1);

        Game game = new Game();
        game.register(playerOne);
        game.register(playerTwo);

        Assertions.assertEquals(1, game.round("Smut", "Stone"));
    }

    @Test
    public void shouldWinPlayerTwo() {
        Player playerOne = new Player(1, "Smut", 1);
        Player playerTwo = new Player(2, "Stone", 3);

        Game game = new Game();
        game.register(playerOne);
        game.register(playerTwo);

        Assertions.assertEquals(2, game.round("Smut", "Stone"));
    }

    @Test
    public void shouldWinFriendship() {
        Player playerOne = new Player(1, "Smut", 1);
        Player playerTwo = new Player(2, "Stone", 1);

        Game game = new Game();
        game.register(playerOne);
        game.register(playerTwo);

        Assertions.assertEquals(0, game.round("Smut", "Stone"));
    }

}
