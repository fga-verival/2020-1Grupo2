import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class CDBImpostoRendaTest {

    @Test
    public void getImpostoRendaTesteTriangularParametrizado() {
        CDB c = new CDB(0, 0.0, 0.0);

        // Teste por falsificação
        c.setDias(120);
        c.setValorInicial(500);
        c.setTaxaDeJurosAnual(0.080);
        c.setTributacaoIR(120);
        assertEquals(2.96, c.getImpostoRenda(), 0);
    }

}
