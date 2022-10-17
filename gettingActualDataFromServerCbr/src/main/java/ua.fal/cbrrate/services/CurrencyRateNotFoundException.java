package ua.fal.cbrrate.services;

public class CurrencyRateNotFoundException extends RuntimeException {
    public CurrencyRateNotFoundException(String message) {
        super(message);
    }
}
