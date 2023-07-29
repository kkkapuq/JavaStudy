class Product
{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product() {} // 이거 추가

  
    Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product {
    Tv() {}
  
    public String toString() {
        return "Tv";
    }
}
class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
