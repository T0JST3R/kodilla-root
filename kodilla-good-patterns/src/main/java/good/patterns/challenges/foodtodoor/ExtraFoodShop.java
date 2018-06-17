package good.patterns.challenges.foodToDoor;

import good.patterns.challenges.foodToDoor.companiesProcessors.ExtraFoodShopProcessor;

public class ExtraFoodShop extends Company {
    public ExtraFoodShop(String companyName) {
        super(companyName);
        this.processor = new ExtraFoodShopProcessor();
    }
}
