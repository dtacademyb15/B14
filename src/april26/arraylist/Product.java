package april26.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Product {
    int id;
    String name;
    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Shop {
    public static void main(String[] args) {

        List<Product> lst = new ArrayList<>();
        lst.add(new Product(10, "IceCream"));
        lst.add(new Product(11, "Chocolate"));
        Product pi = new Product(10, "IceCream");
        System.out.println(lst.indexOf(pi));
    }

}



