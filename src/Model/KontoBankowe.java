package Model;

public class KontoBankowe {
    private long bankNumber, bankBalance;
    private KartaKred karta;

    KontoBankowe(long numer_konta, long pin) {
        setBankNumber(numer_konta);
        karta = new KartaKred(numer_konta, pin);
        setBankBalance(0);
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

    long getPin() {
        return karta.getPin();
    }
}
