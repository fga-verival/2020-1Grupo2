import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Arrays;
import org.junit.runners.Parameterized;

import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CDBRendimentoLiquidoTest {
    private int dias;
    private double valorInicial, taxaDeJurosAnual, rendimentoBruto, tributacaoIR, rendimentoLiquido;
    CDB c;

    @Before
    public void setUp() throws Exception {
        c = new CDB(0,0.0,0.0);
    }

    @Test
    public void getRendimentoLiquidoTesteTriangularParametrizado(){
        c.setDias(dias);
        c.setValorInicial(valorInicial);
        c.setTaxaDeJurosAnual(taxaDeJurosAnual);
        c.setTributacaoIR(dias);
        c.setRendimentoBruto(rendimentoBruto);
        assertEquals(rendimentoLiquido,c.getRendimentoLiquido(),  0);
    }

    public CDBRendimentoLiquidoTest(int dias,
                                         double valorInicial,
                                         double taxaDeJurosAnual,
                                         double rendimentoBruto,
                                         double tributacaoIR,
                                         double rendimentoLiquido) {
        this.dias = dias;
        this.valorInicial = valorInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.rendimentoBruto = rendimentoBruto;
        this.tributacaoIR = tributacaoIR;
        this.rendimentoLiquido = rendimentoLiquido;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        Object[][] respostas = new Object[][] {
                {60, 1000.0, 8.5, 13.97, 3.14, 1.0829},
                {120, 500.00, 8.0, 13.15, 2.96, 2.0384},
                {240, 3000.0, 9.0,  177.53, 35.51,4.7342},
                {270, 2000.0, 8.5, 125.75, 25.15, 5.0301},
                {390, 100.0, 7.5, 8.01, 1.40, 6.6113},
                {420, 250.00, 8.0, 23.01, 4.03, 7.5945},
                {550, 400.0, 8.0, 48.22, 8.44, 9.9452},
                {670, 800.0, 8.0, 117.48, 20.56, 12.1151},
                {700, 2500.0, 9.0, 431.51, 75.51, 14.2397},
                {900, 4200.00, 9.5, 983.84, 147.58, 19.9110},
                {1000, 100.00, 7.5, 20.55, 3.08, 17.4657}
        };

        return Arrays.asList(respostas);
    }
}
