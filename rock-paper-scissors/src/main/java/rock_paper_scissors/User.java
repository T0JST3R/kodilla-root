package rock_paper_scissors;

public class User {
   private String username;
    private Move userChoice = Move.ROCK;
    public boolean needChoice = true;

    public boolean isneedChoice() {
        return needChoice;
    }

    public void setNeedChoice(boolean needChoice) {
        this.needChoice = needChoice;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userChoice=" + userChoice +
                '}';
    }

    public User(String username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserChoice(Move userChoice) {
        this.userChoice = userChoice;
    }

    public String getUsername() {
        return username;
    }

    public Move getUserChoice(){


        return userChoice;

    }
}
