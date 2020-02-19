package Model;

public class KontoBankowe {
    private long bankNumber, bankBalance;
    private KartaKred karta;

    KontoBankowe(long numer_konta, long pin) {
        setBankNumber(numer_konta);
        karta = new KartaKred(numer_konta, pin);
        updateBankBalance(0);
    }

    @Deprecated
    KontoBankowe(){
        this(0,0);
    }

    void setBankNumber(long bankNumber) {
        this.bankNumber = bankNumber;
    }

    long getBankNumber() {
        return bankNumber;
    }

    void updateBankBalance(long bankBalance) {
        this.bankBalance = bankBalance;
    }

    long getBankBalance() {
        return bankBalance;
    }

    void addKartaKred(long pin) {
        karta = new KartaKred(bankNumber, pin);
    }

    long getPin() {
        return karta.getPin();
    }
}
