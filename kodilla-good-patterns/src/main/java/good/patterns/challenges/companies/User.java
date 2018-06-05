package good.patterns.challenges.companies;

public class User {
   private final String userName;
   private final String realName;
   private final String adress;

    public User(String userName, String realName, String adress) {
        this.userName = userName;
        this.realName = realName;
        this.adress = adress;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
