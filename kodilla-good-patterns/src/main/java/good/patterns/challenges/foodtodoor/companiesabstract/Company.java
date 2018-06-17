package good.patterns.challenges.foodtodoor.companiesabstract;

import good.patterns.challenges.foodtodoor.Customer;
import good.patterns.challenges.foodtodoor.Order;
import good.patterns.challenges.foodtodoor.companiesProcessors.Processor;
import good.patterns.challenges.foodtodoor.messageSenders.MessageSender;

public abstract class Company {
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
