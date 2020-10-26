public class CDB {
    private int dias;
    private double valorInicial, taxaDeJurosAnual, tributacaoIR;
    public CDB(int dias, double valorInicial, double taxaDeJurosAnual) {
        this.dias = dias;
        this.valorInicial = valorInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.tributacaoIR = dias <= 180? 22.5:dias <= 360? 20.0:dias<=720?17.5:15.0;
    }
}
