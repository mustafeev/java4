public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int Price = 10_000;
        int Miles = service.calculate (Price);
        System.out.println(Miles);
    }
}