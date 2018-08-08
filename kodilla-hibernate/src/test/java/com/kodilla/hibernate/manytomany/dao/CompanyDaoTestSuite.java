package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    Employee johnSmith = new Employee("John", "Smith");
    Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    Company softwareMachine = new Company("Software Machine");
    Company dataMaesters = new Company("Data Maesters");
    Company greyMatter = new Company("Grey Matter");

    @Test
    public void testSaveManyToMany() {
        //Given

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
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

//        CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testfindEmployeesWithName() {
        //Given
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        int id = stephanieClarckson.getId();
        int id1 = johnSmith.getId();
        int id2 = lindaKovalsky.getId();

        //When
        List<Employee> employee = employeeDao.findEmployeesByLastName("Smith");
        List<Employee> employee1 = employeeDao.findEmployeesByLastName("Clarckson");
        List<Employee> employee2 = employeeDao.findEmployeesByLastName("Kovalsky");

        //Then
        assertEquals(1, employee.size());
        assertEquals("John", employee.get(0).getFirstname());
        assertEquals("Stephanie", employee.get(0).getFirstname());
        assertEquals("Linda", employee.get(0).getFirstname());

        //Delete
        employeeDao.delete(id);
        employeeDao.delete(id1);
        employeeDao.delete(id2);
    }

    @Test
    public void findCompaniesByNameWithThreeChars() {
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

        List<Company> companyList1 = companyDao.findCompaniesByNameWithThreeChars("sof");
        List<Company> companyList2 = companyDao.findCompaniesByNameWithThreeChars("dat");
        List<Company> companyList3 = companyDao.findCompaniesByNameWithThreeChars("gre");

        //Then
        assertEquals(1, companyList1.size());
        assertEquals(1, companyList2.size());
        assertEquals(1, companyList3.size());
        assertEquals(companyList1.get(0).getName(), "Software Machine");
        assertEquals(companyList2.get(0).getName(), "Data Maesters");
        assertEquals(companyList3.get(0).getName(), "Grey Matter");


        //Delete
        companyDao.delete(id);
        companyDao.delete(id1);
        companyDao.delete(id2);

    }
}