package good.patterns.challenges.foodToDoor;

import java.util.List;

public class Company {
    private String companyName;
    protected Processor processor;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void process(Customer customer , Order order , MessageSender messageSender) {
        processor.process(customer , order , messageSender);
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
