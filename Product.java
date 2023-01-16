public class Product {
    private final String name;
    private final int prise;
    public static int count;
    public static int totalPrise;

    public Product(String name, int prise) {
        count = count + 1;
        totalPrise = totalPrise + prise;
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }

    public static int getCount() {
        return count;
    }
    public static double getAveregePrise() {
        return (double) totalPrise/count;
    }
}
