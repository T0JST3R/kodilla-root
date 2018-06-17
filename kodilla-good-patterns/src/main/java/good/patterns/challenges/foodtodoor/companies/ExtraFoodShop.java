package good.patterns.challenges.foodtodoor.companies;

import good.patterns.challenges.foodtodoor.companiesProcessors.ExtraFoodShopProcessor;
import good.patterns.challenges.foodtodoor.companiesabstract.Company;

public class ExtraFoodShop extends Company {
    public ExtraFoodShop(String companyName) {
        super(companyName);
        this.processor = new ExtraFoodShopProcessor();
    }
}

