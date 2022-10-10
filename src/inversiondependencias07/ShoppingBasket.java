package inversiondependencias07;

public class ShoppingBasket  {
	SqlDatabase db = new SqlDatabase();
	CreditCard creditCard = new CreditCard();
	
	public void buy(Shopping shopping) {
		db.save(shopping);
		creditCard.pay(shopping);
	}
}

