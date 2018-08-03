package com.kodilla.stream.forum.com.kodilla.stream.invoice.simple;

import com.kodilla.stream.invoice.simple.SimpleInvoice;
import com.kodilla.stream.invoice.simple.SimpleItem;
import com.kodilla.stream.invoice.simple.SimpleProduct;
import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {

    @Test

    public void testGetValueToPay() {

        //Given

        SimpleInvoice invoice = new SimpleInvoice();

        // When

        invoice.addItem(new SimpleItem((new SimpleProduct("Product 1", 12.10)), 1));
        invoice.addItem(new SimpleItem((new SimpleProduct("Product 1", 12.10)), 1));
        invoice.addItem(new SimpleItem((new SimpleProduct("Product 2", 12.10)), 1.5));


        for (SimpleItem item : invoice.getItems()) {

            item.getProduct().getProductName();
            item.getValue();

        }


        //Then

        Assert.assertEquals(42.35, invoice.getValueToPay(), 0.0001);


    }
}
