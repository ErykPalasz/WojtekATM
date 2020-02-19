package Model;

public class KontoBankowe {
    private long bankNumber, bankBalance;
    private KartaKred karta;

    KontoBankowe(long numer_konta, int pin) {
        setBankNumber(numer_konta);
        setBankBalance(0);
        setKartaKred(pin);
    }

    @Deprecated
    KontoBankowe(long numer_konta) {
        setBankNumber(numer_konta);
        setBankBalance(0);
    }

    @Deprecated
    KontoBankowe(){
        this(0, 0);
    }

    private void setBankNumber(long bankNumber) {
        this.bankNumber = bankNumber;
    }

    long getBankNumber() {
        return bankNumber;
    }

    void setBankBalance(long bankBalance) {
        this.bankBalance = bankBalance;
    }

    long getBankBalance() {
        return bankBalance;
    }

    @Deprecated
    void setKartaKred(int pin) {
        karta = new KartaKred(bankNumber, pin);
    }

    long getPin() {
        if(karta!=null){
            return karta.getPin();
        } else {
            return 0;
        }
    }
}
