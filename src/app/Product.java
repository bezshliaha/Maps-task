package app;

import java.util.Objects;

public class Product {

    private final String name;
    private final String quantity;
    private final String price;

    public Product(String name, String quantity, String price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;

        if (!Objects.equals(name, product.name)) return false;
        if (!Objects.equals(quantity, product.quantity)) return false;
        return Objects.equals(price, product.price);
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "name of product: " + name + ", " + "quantity, psc: " + quantity + ", price, EUR: " + price;
    }
}
