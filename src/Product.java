public class Product {

    // 속성
    private String productName;
    private int productPrice;
    private String productDescription;
    private int productStock;

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
    // 상품 재고 반환
    public int getProductStock() {
        return productStock;
    }
    // 상품 목록 출력 정보 반환
    public String getProductInfo() {
        return productName + " | " + String.format("%,d" , productPrice) + "원 | " + productDescription;
    }
    // 상품 상세 정보 반환
    public String getProductDetailInfo() {
        return productName + " | " + String.format("%,d" , productPrice) + "원 | " + productDescription + " | 재고: " + productStock + "개";
    }
    // 재고 확인 및 차감 처리
    public boolean updateStock(boolean reduceStock) {
        if (productStock <= 0) {
            return false;
        }
        if (reduceStock) {
            productStock--;
        }
        return true;
    }
}