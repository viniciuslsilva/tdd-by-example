package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount, String curency) {
        super(amount, curency);
    }

    @Override
    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
