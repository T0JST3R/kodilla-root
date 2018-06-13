import rock_paper_scissors.GameRules;
import rock_paper_scissors.User;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        User user = new User("Adam");
        Random random = new Random();
        GameRules gameRules = new GameRules();
        System.out.println("Wpisz liczbe rund do ktorej bedziesz grac");
        gameRules.setMaxRounds(scanner.nextInt());
        while (gameRules.getRoundNumber() < gameRules.getMaxRounds()) {
            System.out.println("Twoja liczba punktow = " + gameRules.getUserPoints() + " Liczba punktow przeciwnika " + gameRules.getComputerPoints());
            while (user.getUserChoice() > 2 || user.getUserChoice() < 0 || user.needChoice) {
                System.out.println("0 Kamien , 1 Papier , 2 Nozyce");
                user.setUserChoice(scanner.nextInt());
                if (user.getUserChoice() >= 0 && user.getUserChoice() <= 2) {
                    user.setNeedChoice(false);
                }
            }
            gameRules.setComputerChoice(random.nextInt(2));
            System.out.println("Round number " + gameRules.getRoundNumber());
//0 - Kamien
//1 - Papier
//2 - Nozyce

            if (user.getUserChoice() == 0 && gameRules.getComputerChoice() == 0) {
                System.out.println("Remis");
                user.setNeedChoice(true);
            } else if (user.getUserChoice() == 0 && gameRules.getComputerChoice() == 1) {
                gameRules.addComputerPoints();
                System.out.println("Ty - Kamień . Komputer - Papier. :( ");
                user.setNeedChoice(true);

            } else if (user.getUserChoice() == 0 && gameRules.getComputerChoice() == 2) {
                gameRules.addUserPoints();
                System.out.println("Ty - Kamień. Komputer - Nożyce  Punkcik! :) ");
                user.setNeedChoice(true);

            } else if (user.getUserChoice() == 1 && gameRules.getComputerChoice() == 0) {
                gameRules.addUserPoints();
                user.setNeedChoice(true);
            } else if (user.getUserChoice() == 1 && gameRules.getComputerChoice() == 1) {
                System.out.println("Remis");
                user.setNeedChoice(true);

            } else if (user.getUserChoice() == 1 && gameRules.getComputerChoice() == 2) {

                gameRules.addComputerPoints();
                user.setNeedChoice(true);
            } else if (user.getUserChoice() == 2 && gameRules.getComputerChoice() == 0) {
                gameRules.addComputerPoints();
                user.setNeedChoice(true);
            } else if (user.getUserChoice() == 2 && gameRules.getComputerChoice() == 1) {
                gameRules.addUserPoints();
                user.setNeedChoice(true);

            } else if (user.getUserChoice() == 2 && gameRules.getComputerChoice() == 2) {
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