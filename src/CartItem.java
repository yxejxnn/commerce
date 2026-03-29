public class CartItem {

    // 속성
    private String cartProduct; // 장바구니에 담긴 상품
    private int cartQuantity; // 장바구니에 담긴 상품 수량

    // 생성자
    public CartItem(String cartProduct, int cartQuantity) {
        this.cartProduct = cartProduct;
        this.cartQuantity = cartQuantity;
    }

    // 기능
    // 장바구니에 담긴 상품 반환
    public String getCartProduct() {
        return cartProduct;
    }
    // 장바구니에 담긴 상품 수량 반환
    public int getCartQuantity() {
        return cartQuantity;
    }
}