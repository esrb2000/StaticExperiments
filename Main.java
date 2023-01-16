public class Main {
    public static void main(String[] args) {
    Product product = new Product("хлеб", 30);
    Product product1 = new Product("Мясо", 250);
        System.out.println(Product.getCount());
        System.out.println(Product.getAveregePrise());
    }
}