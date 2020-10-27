import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CDBImpostoRendaTest {

    @Test
    public void getImpostoRendaTesteTriangularParametrizado() {
        CDB c = new CDB(0, 0.0, 0.0);

        c.setDias(60);
        c.setValorInicial(1000);
        c.setTaxaDeJurosAnual(0.085);
        c.setTributacaoIR(60);
        assertEquals(3.14d, c.getImpostoDeRenda(), 0);
    }

}
