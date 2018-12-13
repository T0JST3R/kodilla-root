import rock_paper_scissors.GameRules;
import rock_paper_scissors.User;

import java.util.Random;
import java.util.Scanner;

import static rock_paper_scissors.Move.*;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User("Adam");
        Random random = new Random();
        GameRules gameRules = new GameRules();
        System.out.println("Wpisz liczbe rund do ktorej bedziesz grac");
        gameRules.setMaxRounds(scanner.nextInt());
        scanner.nextLine();
        while (gameRules.getRoundNumber() < gameRules.getMaxRounds()) {
            System.out.println("Twoja liczba punktow = " + gameRules.getUserPoints() + " Liczba punktow przeciwnika " + gameRules.getComputerPoints());
            while (user.getUserChoice().ordinal() > 2 || user.getUserChoice().ordinal() < 0 || user.needChoice) {
                System.out.println("CHOOSE BETWEEN ROCK , PAPER , SCISSORS");
                String move = scanner.nextLine();
                user.setUserChoice(valueOf(move));
                if (user.getUserChoice().ordinal() >= ROCK.ordinal() && user.getUserChoice().ordinal() <= SCISSORS.ordinal()) {
                    user.setNeedChoice(false);
                }
            }
            gameRules.setComputerChoice(values()[random.nextInt(2)]);
            System.out.println("Round number " + gameRules.getRoundNumber());


            if (user.getUserChoice() == ROCK && gameRules.getComputerChoice() == PAPER) {
                gameRules.addComputerPoints();
                System.out.println("Ty - Kamień . Komputer - Papier. :( ");
                user.setNeedChoice(true);

            } else if (user.getUserChoice() == ROCK && gameRules.getComputerChoice() == SCISSORS) {
                gameRules.addUserPoints();
                System.out.println("Ty - Kamień. Komputer - Nożyce  Punkcik! :) ");
                user.setNeedChoice(true);

            } else if (user.getUserChoice() == PAPER && gameRules.getComputerChoice() == ROCK) {
                gameRules.addUserPoints();
                user.setNeedChoice(true);
            }  else if (user.getUserChoice() == PAPER && gameRules.getComputerChoice() == SCISSORS) {

                gameRules.addComputerPoints();
                user.setNeedChoice(true);
            } else if (user.getUserChoice() == SCISSORS && gameRules.getComputerChoice() == ROCK) {
                gameRules.addComputerPoints();
                user.setNeedChoice(true);
            } else if (user.getUserChoice() == SCISSORS && gameRules.getComputerChoice() == PAPER) {
                gameRules.addUserPoints();
                user.setNeedChoice(true);

            } else if (user.getUserChoice() == gameRules.getComputerChoice() ) {
                System.out.println("Remis");
                user.setNeedChoice(true);

            } else System.out.println("Error!");
            gameRules.setRoundNumber(gameRules.getRoundNumber() + 1);
            user.setNeedChoice(true);
        }


        if (gameRules.getUserPoints() > gameRules.getComputerPoints()) {
            System.out.println("Gratulacje! Wynik to " + gameRules.getUserPoints() + " " + gameRules.getComputerPoints());
        } else if (gameRules.getUserPoints() < gameRules.getComputerPoints()) {
            System.out.println("Przegrales! :( Wynik to : " + gameRules.getUserPoints() + " " + gameRules.getComputerPoints());
        } else System.out.println("remis ;)");
    }
}