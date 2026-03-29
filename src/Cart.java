import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 속성
    List<CartItem> cartItemList = new ArrayList<>(); // 장바구니에 담긴 상품 목록

    // 기능
    // 장바구니 추가 기능
    public void addCartItem(CartItem cartItem) {
        cartItemList.add(cartItem);
    }
    // 장바구니에 담긴 상품 목록을 반환
    public List<CartItem> getCartItemList() {
        return cartItemList;
    }
}