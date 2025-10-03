import org.example.StripeManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StripeManagerTest {
    @Test
    void deveRetornarApiKey() {
        assertEquals("sk_test_123456789", StripeManager.getInstance().getApiKey());
    }

    @Test
    void deveProcessarPagamento() {
        StripeManager manager = StripeManager.getInstance();
        manager.processPayment(100.0, "USD");
        assertEquals("Pagamento de 100.0 USD processado", manager.getLastPaymentStatus());
    }

    @Test
    void mesmaInstancia() {
        StripeManager s1 = StripeManager.getInstance();
        StripeManager s2 = StripeManager.getInstance();
        assertSame(s1, s2);
    }
}
