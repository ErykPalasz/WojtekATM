package Model;

import java.math.BigInteger;

public class KontoBankowe {
    private BigInteger numerKonta;
    private String typKonta;
    private BigInteger stan_konta;

    public KontoBankowe(BigInteger numerKonta, String typKonta) {
        this.numerKonta = numerKonta;
        this.typKonta = typKonta;
        this.stan_konta = BigInteger.valueOf(0);
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

    public BigInteger getStan_konta() {
        return stan_konta;
    }

    public void setStan_konta(BigInteger stan_konta) {
        this.stan_konta = stan_konta;
    }

}
