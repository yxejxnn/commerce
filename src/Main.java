import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 상품 생성
        Product galaxyS25 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 30);
        Product iphone16 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 20);
        Product macBookPro = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 10);
        Product airPodsPro = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 50);

        // 상품들을 저장할 List 생성
        List<Product> productList = new ArrayList<>();

        // 생성한 상품을 List에 추가
        productList.add(galaxyS25);
        productList.add(iphone16);
        productList.add(macBookPro);
        productList.add(airPodsPro);
    }
}