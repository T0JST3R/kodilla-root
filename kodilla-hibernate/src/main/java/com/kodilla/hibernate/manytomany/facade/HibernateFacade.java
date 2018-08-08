package com.kodilla.hibernate.manytomany.facade;

import org.springframework.stereotype.Component;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

    @NamedQueries({
            @NamedQuery(
                    name = "Company.findCompanyByPartOfName",
                    query = "FROM Company WHERE name LIKE :%NAME%"
            ),
            @NamedQuery(
                    name ="Employee.findEmployeeByPartOfLastName" ,
                    query = "FROM Employee WHERE lastname LIKE :%LASTNAME% "
            )
    })

@Component
public class HibernateFacade {












}
