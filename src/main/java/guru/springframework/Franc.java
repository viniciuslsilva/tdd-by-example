package guru.springframework;

public class Franc extends Money {

    public Franc(int amount, String curency) {
        super(amount, curency);
    }

    @Override
    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
