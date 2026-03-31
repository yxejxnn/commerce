import java.util.List;

public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        List<Category> categoryList = data.createCategoryList();

        Cart cart = new Cart();

        CommerceSystem commerceSystem = new CommerceSystem(categoryList, cart);

        commerceSystem.start();
    }
}