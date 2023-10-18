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
        if (agencia.matches("\\d{3}-\\d")) {
            return this.agencia; // Retorna a agência formatada existente
        } else {
            // Caso a agência não esteja no formato correto, a formata
            // Supondo que a agência seja um número inteiro
            String numero = agencia.substring(0, 3);
            String digito = agencia.substring(3, 4);
            int numeroSemDigito = Integer.parseInt(numero);
            int digitoAgencia = Integer.parseInt(digito);
            String agenciaFormatada = String.format("%3d-%d", numeroSemDigito, digitoAgencia);
            return agenciaFormatada;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
