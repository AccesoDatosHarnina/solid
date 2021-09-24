package inversiondependencias07;

public class Principal {
public static void main(String[] args) {
	ShoppingBasket shoppingBasket=new ShoppingBasket(new Cash());
	shoppingBasket.buy();
	ShoppingBasket shoppingBasket1=new ShoppingBasket(new CreditCard());
	shoppingBasket1.buy();
}
}
