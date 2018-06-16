package good.patterns.challenges.foodToDoor;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop extends Company {
    public ExtraFoodShop(String companyName) {
        super(companyName);
        this.processor = new ExtraFoodShopProcessor();
    }
}
