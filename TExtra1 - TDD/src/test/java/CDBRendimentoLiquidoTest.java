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
        double rendimentoBruto = c.getRendimentoBruto();
        System.out.println(rendimentoBruto);
        rendimentoLiquido = c.getRendimentoLiquido();
        assertEquals(rendimentoLiquido, 1.0829);
    }
}
