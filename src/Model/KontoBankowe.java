package Model;

public class KontoBankowe {
    private long bankNumber, bankBalance;
    private KartaKred karta;

    KontoBankowe(long numer_konta) {
        setBankNumber(numer_konta);
        updateBankBalance(0);
    }

    @Deprecated
    KontoBankowe(){
        this(0);
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
        if(karta!=null){
            return karta.getPin();
        } else {
            return 0;
        }
    }
}
