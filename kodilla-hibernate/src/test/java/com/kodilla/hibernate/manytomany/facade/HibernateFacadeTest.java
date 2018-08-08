package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class HibernateFacadeTest {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private Employee johnSmith = new Employee("John", "Smith");
    private Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    private Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    Company softwareMachine = new Company("Software Machine");
    Company dataMaesters = new Company("Data Maesters");
    Company greyMatter = new Company("Grey Matter");


    @Test
    public void testFindCompanyByPartOfName() {
        //Given

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        int id = softwareMachine.getId();
        int id1 = dataMaesters.getId();
        int id2 = greyMatter.getId();

        List<Company> companyList1 = companyDao.findCompanyByPartOfName("s");
        List<Company> companyList2 = companyDao.findCompanyByPartOfName("da");
        List<Company> companyList3 = companyDao.findCompanyByPartOfName("grey");

        //Then

        assertEquals(2, companyList1.size(), 0);
        assertEquals(1, companyList2.size(), 0);
        assertEquals(1, companyList3.size(), 0);

        //Delete

        companyDao.delete(id);
        companyDao.delete(id1);
        companyDao.delete(id2);

    }

    @Test
    public void testFindEmployeeByPartOfLastName() {

        //Given & When

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        int id = johnSmith.getId();
        int id1 = stephanieClarckson.getId();
        int id2 = lindaKovalsky.getId();

        List<Employee> employees = employeeDao.findEmployeeByPartOfLastName("kov");
        List<Employee> employees1 = employeeDao.findEmployeeByPartOfLastName("es");
        List<Employee> employees2 = employeeDao.findEmployeeByPartOfLastName("sm");

        //Then

        assertEquals( 1, employees.size() , 0);
        assertEquals( 0, employees1.size() , 0);
        assertEquals( 1, employees2.size() , 0);

        //Delete

        employeeDao.delete(id);
        employeeDao.delete(id1);
        employeeDao.delete(id2);


    }

}