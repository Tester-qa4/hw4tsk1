public class BonusMilesService {
    public int calculate(int price) {
        int prcBonus = 20;
        int miles = price / prcBonus;
        return miles;
    }
}
