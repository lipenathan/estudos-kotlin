package orientacaoaobjetosjava;

public class ContaJv {
    private Double saldo;
    private String titular;
    private String agencia;
    private String codigo;

    public ContaJv(Double saldo, String titular, String agencia, String codigo) {
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
        this.codigo = codigo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
