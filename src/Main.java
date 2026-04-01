import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        List<Category> categoryList = data.createCategoryList();

        Cart cart = new Cart();

        CommerceSystem commerceSystem = new CommerceSystem(categoryList, cart);

        commerceSystem.start();
    }
}