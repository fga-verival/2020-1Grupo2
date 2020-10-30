import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CDBRendimentoLiquidoTest {
    CDB c;
    @Before
    public void setUp() throws Exception {
        c = new CDB(0,0.0,0.0);
    }
    @Test
    public void getRendimentoLiquidoCorrect(){
        c.setDias(60);
        c.setValorInicial(1000);
        c.setTaxaDeJurosAnual(8.5);
        double rendimentoLiquido = c.getRendimentoLiquido();
        assertEquals(1.0829,rendimentoLiquido,  0);
    }

    @Test
    public void getRendimentoLiquidoCorrect2(){
        c.setDias(120);
        c.setValorInicial(500);
        c.setTaxaDeJurosAnual(8.0);
        double rendimentoLiquido = c.getRendimentoLiquido();
        assertEquals(2.0384, rendimentoLiquido, 0);
    }
}
