package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {
    public static String ERR_NOT_AUTHORISED = "User isn't authorized!";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected!";
    public static String ERR_VERIFICATION_ERROR = "Verification error!";
    public static String ERR_SUBMITING_ERROR = "cannot submit order!";

    public OrderProcessingException(String message) {
        super(message);
    }
}
