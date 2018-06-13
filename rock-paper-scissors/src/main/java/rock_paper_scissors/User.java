package rock_paper_scissors;

public class User {
   private String username;
    private int userChoice;
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

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public String getUsername() {
        return username;
    }

    public int getUserChoice(){


        return userChoice;

    }
}
