package model;

public class ContaBanco {

    private String nomeCliente;
    private int numero;
    private String agencia;
    private double saldo;

    public ContaBanco(String nomeCliente, int numero, String agencia, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
