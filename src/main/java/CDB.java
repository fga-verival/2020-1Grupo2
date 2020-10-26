import java.math.BigDecimal;
import java.math.RoundingMode;

public class CDB {
    private int dias;
    private double valorInicial, taxaDeJurosAnual, tributacaoIR;
    public CDB(int dias, double valorInicial, double taxaDeJurosAnual) {
        this.dias = dias;
        this.valorInicial = valorInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.tributacaoIR = dias <= 180? 22.5:dias <= 360? 20.0:dias<=720?17.5:15.0;
    }
    public double getRendimentoBruto(){
        return BigDecimal.valueOf(valorInicial*taxaDeJurosAnual*getFracaoAno(dias)).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    private double getFracaoAno(int dias){
        return dias/365d;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        setTributacaoIR(dias);
        this.dias = dias;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getTaxaDeJurosAnual() {
        return taxaDeJurosAnual;
    }

    public void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    }

    public double getTributacaoIR() {
        return tributacaoIR;
    }

    public void setTributacaoIR(int dias) {
        this.tributacaoIR = dias <= 180? 22.5:dias <= 360? 20.0:dias<=720?17.5:15.0;
    }
}
