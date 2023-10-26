package topic7.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {

    private DiceCup diceCup;
    private List<Player> players;

    public static void main(String[] args) {
        Game knockout = new Game();
        knockout.startGame();

    }


    public void startGame() {

        // make player objects - need names
        // get knockout numbers
        // create a dice cup
        // play game = take turns until only one player is left
        // each player roll the dice in turn - use dice cup
        // print the winner
        
        diceCup = new DiceCup(2);

            int numberOfPlayers = positiveIntInput("How many players are there?");

            // limit the number of players
            while (numberOfPlayers < 2 || numberOfPlayers > 5) {
                System.out.println("You need between 2 and 5 players to play. Try again!");
                numberOfPlayers = positiveIntInput("How many players are there?");
            }

            createPlayers(numberOfPlayers);

            setKnockoutNumbers();

            play();

            System.out.println();

            printGameResult();

    }


    private void createPlayers(int numberOfPlayers) {
        players = new ArrayList<>();
        for (int x=0; x<numberOfPlayers; x++) {
            String name = stringInput("Enter player" + (x+1) + "'s name:");
            Player player = new Player(name);
            players.add(player);
        }
    }


    private void setKnockoutNumbers() {
        for (Player p : players) {
            int knockoutNumber;
            do {
                knockoutNumber = intInput("Player " + p.getName() + ", enter your knock out number. " +
                        "It must be 6, 7, 8, or 9 :");
            } while (knockoutNumber < 6 || knockoutNumber > 9);
            p. setKnockoutNumber(knockoutNumber);
        }
    }


    private void play() {
        int playerIndex = 0;
        int totalPlayers = players.size();

        while (moreThanOnePlayer()) {
            Player currentPlayer = players.get(playerIndex);

            if (currentPlayer.isKnockedOut()) {
                System.out.println("Sorry, " + currentPlayer.getName() + ". You are knocked out.");
            } else {
                stringInput("\nPlayer " + currentPlayer.getName() + ", press enter to roll.");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult); // what if you want to know the value of individual dice?
            }
            playerIndex = (playerIndex+1) % totalPlayers;
        }
    }


    private boolean moreThanOnePlayer() {
        int totalPlayer = 0;
        for (Player p : players) {
            if (!p.isKnockedOut()) {
                totalPlayer++;
            }
        }
        System.out.println("There are "+ totalPlayer + " player(s) in the game");

        if (totalPlayer > 1) {
            return true;
        } else {
            return false;
        }
    }


    private void printGameResult() {
        for (Player p : players) {
            if (p.isKnockedOut()) {
                System.out.println("Player " + p.getName() + " is knocked out.");
            } else {
                System.out.println("Player " + p.getName() + " IS THE WINNER!!!");
            }
        }
    }


}
