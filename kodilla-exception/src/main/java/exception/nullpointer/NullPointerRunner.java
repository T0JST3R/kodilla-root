package exception.nullpointer;

public class NullPointerRunner {

    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();

        try {


            messageSender.messageTo(user, "Hello!");
        }
        catch (MessageNotSentException d){
            System.out.println("Message not sent! , but program still works. Reason of the problem: " + d);
        }
        System.out.println("Work!!");
        }
}
