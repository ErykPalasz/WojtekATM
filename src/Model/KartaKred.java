package Model;

public class KartaKred {
    private long number, pin;
    KartaKred(long numer_karty, long pin){
        this.number = numer_karty;
        this.pin = pin;
    }

    void setNumber(long numer_karty){
        this.number = numer_karty;
    }

    long getNumber() {
        return number;
    }

    void setPin(long pin){
        this.pin = pin;
    }

    long getPin(){
        return pin;
    }
}
