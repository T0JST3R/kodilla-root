package good.patterns.challenges.companies;

import javax.jws.soap.SOAPBinding;

public interface Company {
    void getOrder(Product product);

    void getAdress(User user);



}
