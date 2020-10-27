import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CDBImpostoRendaTest {

    private int dias;
    private double valorInicial;
    private double taxaDeJurosAnual;
    private double rendimentoBruto;
    private double impostoRenda;

    @Test
    public void getImpostoRendaTesteTriangularParametrizado() {
        CDB c = new CDB(0, 0.0, 0.0);

        c.setDias(dias);
        c.setValorInicial(valorInicial);
        c.setTaxaDeJurosAnual(taxaDeJurosAnual);
        c.setTributacaoIR(dias);
        assertEquals(impostoRenda, c.getImpostoDeRenda(), 0);
    }


    public CDBImpostoRendaTest(int dias,
                               double valorInicial,
                               double taxaDeJurosAnual,
                               double rendimentoBruto,
                               double impostoRenda) {
        this.dias = dias;
        this.valorInicial = valorInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.rendimentoBruto = rendimentoBruto;
        this.impostoRenda = impostoRenda;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        Object[][] respostas = new Object[][]{
                {60, 1000.0, 0.085, 13.97, 3.14},
                {120, 500.00, 0.080, 13.15, 2.96},
                {240, 3000.0, 0.090, 177.53, 35.51},
                {270, 2000.0, 0.085, 125.75, 25.15},
                {390, 100.0, 0.075, 8.01, 1.40},
                {420, 250.00, 0.080, 23.01, 4.03},
                {550, 400.0, 0.080, 48.22, 8.44},
                {670, 800.0, 0.080, 117.48, 20.56},
                {700, 2500.0, 0.090, 431.51, 75.51},
                {900, 4200.00, 0.095, 983.84, 147.58},
                {1000, 100.00, 0.075, 20.55, 3.08}
        };

        return Arrays.asList(respostas);
    }

}

