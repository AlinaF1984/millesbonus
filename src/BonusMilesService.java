public class BonusMilesService {
    public int calculate(int cost) {
        int price = cost;
        int milli = 20;
        int bonus = price / milli;
        System.out.println(price / milli);
        return bonus;
    }
}
