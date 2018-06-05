package good.patterns.challenges.productorder2;

public class User {
    String userName;
    String RealName;

    public User(String userName, String realName) {
        this.userName = userName;
        RealName = realName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", RealName='" + RealName + '\'' +
                '}';
    }

    public String getRealName() {
        return RealName;
    }
}
