public class Product {

    // 속성
    private String productName; // 상품명
    private int productPrice; // 상품 가격
    private String productDescription; // 상품 설명
    private int productStock; // 상품 재고수량

    // 생성자
    public Product(String productName, int productPrice, String productDescription, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productStock = productStock;
    }

    // 기능
    // 상품명 반환
    public String getProductName() {
        return productName;
    }
    // 상품 가격 반환
    public int getProductPrice() {
        return productPrice;
    }
    // 상품 설명 반환
    public String getProductDescription() {
        return productDescription;
    }
    // 상품 재고수량 반환
    public int getProductStock() {
        return productStock;
    }
    // 주문 확정 시 주문한 수량만큼 상품 재고를 차감하는 메서드
    public void reduceProductStock(int orderQuantity) {
        productStock -= orderQuantity;
    }
}