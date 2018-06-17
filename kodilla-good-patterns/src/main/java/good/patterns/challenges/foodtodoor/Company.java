package good.patterns.challenges.foodtodoor;

import good.patterns.challenges.foodtodoor.companiesProcessors.Processor;
import good.patterns.challenges.foodtodoor.messageSenders.MessageSender;

public abstract class Company {
    private String companyName;
    protected Processor processor;

    public Company(String companyName , Processor processor) {
        this.companyName = companyName;
        this.processor = processor;
    }

    public void process(Customer customer , Order order , MessageSender messageSender) {
        processor.process(customer , order , messageSender);
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
