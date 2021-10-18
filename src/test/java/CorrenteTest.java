import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrenteTest {
    @Test
    void deveRetonarSaldoCorrente() {
        Corrente corrente = new Corrente();
        corrente.deposita(100.00);
        corrente.saque(10.00);
        assertEquals(89.9, corrente.getSaldo());
    }
}
