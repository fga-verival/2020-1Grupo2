import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CDBTest {
    CDB c;
    @Before
    public void setUp() throws Exception {
        c = new CDB(0,0.0,0.0);
    }
    @Test
    public void getRendimentoBrutoTeste1(){
        c.setDias(60);
        c.setValorInicial(1000);
        c.setTaxaDeJurosAnual(0.085);

        assertEquals(13.97d, c.getRendimentoBruto(), 0);
    }

    @Test
    public void getRendimentoBrutoTeste2(){
        c.setDias(420);
        c.setValorInicial(250);
        c.setTaxaDeJurosAnual(0.08);

        assertEquals(23.01d, c.getRendimentoBruto(), 0);
    }
}