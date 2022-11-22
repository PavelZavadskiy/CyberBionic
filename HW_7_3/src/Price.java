import java.util.Comparator;

public class Price {
    private String product;
    private String shop;
    private float price;

    public Price(String product, String shop, float price) {
        this.product = product;
        this.shop = shop;
        this.price = price;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public String getShop() {
        return shop;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" +
                "product='" + product + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price +
                ']';
    }

}

class ShopComparator implements Comparator<Price> {

    public int compare(Price h1, Price h2) {
        return h1.getShop().compareTo(h2.getShop());
    }
}