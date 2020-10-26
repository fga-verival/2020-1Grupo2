import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class CDBRendimentoBrutoTest {
    private int dias;
    private double valorInicial, taxaDeJurosAnual, tributacaoIR, rendimentoBruto;
    CDB c;
    @Before
    public void setUp() throws Exception {
        c = new CDB(0,0.0,0.0);
    }

    @Test
    public void getRendimentoBrutoTesteTriangularParametrizado() {
        c.setDias(dias);
        c.setValorInicial(valorInicial);
        c.setTaxaDeJurosAnual(taxaDeJurosAnual);
        assertEquals(rendimentoBruto, c.getRendimentoBruto(), 0);
    }

    public CDBRendimentoBrutoTest(int dias, double valorInicial, double taxaDeJurosAnual, double rendimentoBruto){
        this.dias = dias;
        this.valorInicial = valorInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.tributacaoIR = dias <= 180? 22.5:dias <= 360? 20.0:dias<=720?17.5:15.0;
        this.rendimentoBruto = rendimentoBruto;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        Object[][] respostas = new Object[][] {
                {60, 1000.0, 0.085, 13.97},
                {120, 500.00, 0.080, 13.15},
                {240, 3000.0, 0.090, 177.53},
                {270, 2000.0, 0.085, 125.75},
                {390, 100.0, 0.075, 8.01},
                {420, 250.00, 0.080, 23.01},
                {550, 400.0, 0.080, 48.22},
                {670, 800.0, 0.080, 117.48},
                {700, 2500.0, 0.090, 431.51},
                {900, 4200.00, 0.095, 983.84},
                {1000, 100.00, 0.075, 20.55}
        };

        return Arrays.asList(respostas);
    }
}