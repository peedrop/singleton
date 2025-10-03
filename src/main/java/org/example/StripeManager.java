package org.example;

public class StripeManager {
    private static StripeManager instance = new StripeManager();

    private String apiKey;
    private String lastPaymentStatus;

    private StripeManager() {
        this.apiKey = "sk_test_123456789"; // chave fictícia
        this.lastPaymentStatus = "Nenhum pagamento realizado";
    }

    public static StripeManager getInstance() {
        return instance;
    }

    public void processPayment(double amount, String currency) {
        this.lastPaymentStatus = "Pagamento de " + amount + " " + currency + " processado";
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getLastPaymentStatus() {
        return lastPaymentStatus;
    }
}