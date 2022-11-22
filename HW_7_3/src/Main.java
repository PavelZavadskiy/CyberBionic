/*
* Описать класс с именем Price, содержащую следующие поля:
  название товара;
  название магазина, в котором продается товар;
  стоимость товара в гривнах.
 Написать программу, выполняющую следующие действия:
  ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны быть упорядочены
 *  в алфавитном порядке по названиям магазинов);
  вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры
 * (если такого магазина нет, вывести исключение).
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Price> getProductsByShop(ArrayList<Price> inArray, String shop) throws NoneProductsInTheShopException {
        ArrayList<Price> byShop = (ArrayList<Price>) inArray.clone();
        byShop.removeIf((n -> (n.getShop().compareTo(shop) != 0)));
        if(byShop.size() == 0)
            throw new NoneProductsInTheShopException("Exception: the shop hasn't products!");
        return byShop;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Price> products = new ArrayList<>();
        do {

            while (true) {
                System.out.println("Enter product's name (Empty string - exit)");
                String product = sc.nextLine();
                if (product.length() == 0)
                    break;
                System.out.println("Enter shop");
                String shop = sc.nextLine();
                System.out.println("Enter price");
                float price = Float.parseFloat(sc.nextLine());

                products.add(new Price(product, shop, price));
            }

            if(products.size() == 0)
                break;

            System.out.println("_____________Before sort_____________");
            for (Price elem : products) {
                System.out.println(elem);
            }

            ShopComparator shopComparator = new ShopComparator();
            products.sort(shopComparator);

            System.out.println("_____________After sort_____________");
            for (Price elem : products) {
                System.out.println(elem);
            }

            System.out.println("_____________Only shop_____________");
            System.out.println("Enter shop");
            String shop = sc.nextLine();
            try {
                ArrayList<Price> byShop = getProductsByShop(products, shop);
                for (Price elem : byShop) {
                    System.out.println(elem);
                }
            } catch (NoneProductsInTheShopException e) {
                System.out.println(e.getMessage());
            }

        }while (false);
    }

}

