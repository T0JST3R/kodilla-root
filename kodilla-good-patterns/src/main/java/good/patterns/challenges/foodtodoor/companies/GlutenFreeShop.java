package good.patterns.challenges.foodtodoor.companies;

import good.patterns.challenges.foodtodoor.companiesProcessors.GlutenFreeProcessor;
import good.patterns.challenges.foodtodoor.companiesabstract.Company;

public class GlutenFreeShop extends Company {
    public GlutenFreeShop(String companyName) {
        super(companyName);
        this.processor=new GlutenFreeProcessor();
    }


}
