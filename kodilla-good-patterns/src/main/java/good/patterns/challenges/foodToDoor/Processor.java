package good.patterns.challenges.foodToDoor;

public interface Processor {
    boolean process(Customer customer , Order order , MessageSender messageSender);
}
