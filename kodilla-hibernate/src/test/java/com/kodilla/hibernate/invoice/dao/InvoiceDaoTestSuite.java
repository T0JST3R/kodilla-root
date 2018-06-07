package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        // Given
        Invoice invoice = new Invoice("1213abc12");
        Item item1 = new Item(new BigDecimal("1222"), 2, new BigDecimal("12215"));
        Item item2 = new Item(new BigDecimal("12232"), 21, new BigDecimal("1311"));
        Item item3 = new Item(new BigDecimal("12242"), 25, new BigDecimal("12331"));
        Product product1 = new Product("Spodnie");
        Product product2 = new Product("Czapka");
        Product product3 = new Product("Szalik");
        Product product4 = new Product("Buty");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.getProducts().add(product1);
        item1.getProducts().add(product3);
        item2.getProducts().add(product2);
        item2.getProducts().add(product4);
        item3.getProducts().add(product3);
        item3.getProducts().add(product4);

        // When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        // Then

        Assert.assertNotEquals(0 ,invoiceId);


        // CleanUp

        invoiceDao.delete(invoiceId);


    }
}
