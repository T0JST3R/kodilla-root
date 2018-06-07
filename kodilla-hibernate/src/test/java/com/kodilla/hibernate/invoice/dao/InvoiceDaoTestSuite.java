package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {

    @Test
    public void testInvoiceDaoSave(){
        Invoice invoice = new Invoice("ss" , "ss" , "ss");
        Item item1 = new Item("ss" , "ss" , "ss" , )

    }
}
