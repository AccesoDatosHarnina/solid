package inversiondependencias07;

public class Principal {
	public static void main(String[] args) {
		// cliente
		SqlDatabase sqlDatabase = new SqlDatabase();
		CreditCard creditCard = new CreditCard();
		MobileNFC mobileNFC = new MobileNFC();
		Shopping shopping = new Shopping() {
			@Override
			public void buy(Shopping shopping) {
				// TODO Auto-generated method stub
			}
		};
		new ShoppingBasket2(sqlDatabase, mobileNFC).buy(shopping);
		new ShoppingBasket2(sqlDatabase, creditCard).buy(shopping);
	}
}
