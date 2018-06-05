package exception.nullpointer;

public class MessageSender {
    public void messageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("sending message " + message + " to " + user);
        }
        else {
            throw new MessageNotSentException("Object was null");
        }
        }

    }

