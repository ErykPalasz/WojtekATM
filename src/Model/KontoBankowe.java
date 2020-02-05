package Model;

import java.math.BigInteger;

public class KontoBankowe {
    private BigInteger numerKonta;
    private String typKonta;
    private BigInteger stanKonta;

    public KontoBankowe(BigInteger numerKonta, String typKonta) {
        this.numerKonta = numerKonta;
        this.typKonta = typKonta;
        this.stanKonta = BigInteger.valueOf(0);
    }

    public BigInteger getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(BigInteger numerKonta) {
        this.numerKonta = numerKonta;
    }

    public String getTypKonta() {
        return typKonta;
    }

    public void setTypKonta(String typKonta) {
        this.typKonta = typKonta;
    }

    public BigInteger getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(BigInteger stanKonta) {
        this.stanKonta = stanKonta;
    }

}
