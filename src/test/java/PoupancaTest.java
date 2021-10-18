import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoupancaTest {
    @Test
    void deveRetonarSaldoPoupanca() {
        Poupanca poupanca = new Poupanca();
        poupanca.deposita(100.00);
        poupanca.saque(10.00);
        assertEquals(89.5, poupanca.getSaldo());
    }
}
