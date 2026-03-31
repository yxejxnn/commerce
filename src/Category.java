import java.util.List;
import java.util.Scanner;

public class Category {

    // 속성
    private String categoryName;
    private List<Product> productList;

    // 생성자
    public Category(String categoryName, List<Product> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    // 기능
    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }
    // 카테고리 목록 출력
    public static void showCategoryList(List<Category> categoryList) {
        System.out.println("[ 실시간 커머스 플랫폼 메인 ]");

        int categoryIndex = 1;
        for (Category category : categoryList) {
            System.out.println(categoryIndex + ". " + category.getCategoryName());
            categoryIndex++;
        }
        System.out.println("0. 종료 | 프로그램 종료");
        System.out.println();
    }
    // 카테고리 선택
    public static Category selectCategory(List<Category> categoryList, int categoryChoice) {
        if (categoryChoice >= 1 && categoryChoice <= categoryList.size()) {
            return categoryList.get(categoryChoice - 1);
        }
        return null;
    }
    // 선택한 카테고리 상품 목록 출력
    public void showProductList() {
        System.out.println("[ " + categoryName + " 카테고리 ]");

        int productIndex = 1;
        for (Product product : productList) {
            System.out.println(productIndex + ". " + product.getProductInfo());
            productIndex++;
        }
        System.out.println("0. 뒤로가기");
        System.out.println();
    }
    // 선택한 상품 반환
    public Product selectProduct(int productChoice) {
        if (productChoice >= 1 && productChoice <= productList.size()) {
            return productList.get(productChoice - 1);
        }
        return null;
    }
    // 카테고리 메뉴 실행
    public void runCategoryMenu(Scanner scanner, Cart cart) {
        showProductList();
        System.out.print("메뉴 입력: ");
        int productChoice = scanner.nextInt();
        System.out.println();

        if (productChoice == 0) {
            return;
        }
        Product selectedProduct = selectProduct(productChoice);

        if (selectedProduct != null) {
            System.out.println(selectedProduct.getProductDetailInfo());
            System.out.println();

            cart.showAddCartMenu();

            System.out.print("메뉴 입력: ");
            int cartChoice = scanner.nextInt();
            System.out.println();

            cart.addProduct(selectedProduct, cartChoice);
        } else {
            System.out.println("잘못된 상품 번호입니다.");
            System.out.println();
        }
    }
}