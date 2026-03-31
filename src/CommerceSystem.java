import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 속성
    private List<Category> categoryList;
    private Cart cart;
    private Scanner scanner = new Scanner(System.in);

    // 생성자
    public CommerceSystem(List<Category> categoryList, Cart cart) {
        this.categoryList = categoryList;
        this.cart = cart;
    }

    // 기능
    public void start() {
        while (true) {
            Category.showCategoryList(categoryList);

            if (!cart.isEmpty()) {
                cart.showOrderMenu();
            }
            System.out.print("메뉴 입력: ");
            int categoryChoice = scanner.nextInt();
            System.out.println();

            if (categoryChoice == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }
            Category selectedCategory = Category.selectCategory(categoryList, categoryChoice);

            if (selectedCategory != null) {
                selectedCategory.runCategoryMenu(scanner, cart);
            } else if (categoryChoice == 4 && !cart.isEmpty()) {
                cart.runCartMenu(scanner);
            } else if (categoryChoice == 5 && !cart.isEmpty()) {
                cart.cancelOrder();
            } else {
                System.out.println("잘못된 카테고리 번호입니다.");
                System.out.println();
            }
        }
        scanner.close();
    }
}