public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Глобус", "Ибраимова");
        OldestSalesman oldestSalesman = new OldestSalesman(shop, WorkInCompany.FOR, 30, "Бакай");
        System.out.println(oldestSalesman.getInfo());
        oldestSalesman.GoSalesmen();
        oldestSalesman.GoSalesmen("Здравтвуйте");
        Shop shop1 = new Shop("Глобус", "Ибраимова");
        Salesman salesman = new Salesman(shop,WorkInCompany.FIVE, 30, "Серега", 180, "Голубые");
        System.out.println(salesman.getInfo());
        salesman.GoSalesmen();
        Shop shop2 = new Shop("Глобус", "Ибраимова");
        Salesman salesman1 = new Salesman(shop2, WorkInCompany.FOR, 45, "Паша", 185, "Голубые");
        System.out.println(salesman1.getInfo());
        salesman1.GoSalesmen();
    }
}