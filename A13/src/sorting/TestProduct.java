package sorting;

import java.util.Arrays;

public class TestProduct
{
    public static <T extends Comparable<? super T>> void sortAscending(T[] tab) {
        Arrays.sort(tab);
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("a", 5.99),
                new Product("b", 2.99),
                new Product("c", 3.50)
        };
        System.out.println(Arrays.toString(products));
        sortAscending(products);
    }
}
