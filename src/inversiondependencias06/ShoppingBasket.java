package inversiondependencias06;

public class ShoppingBasket implements Shopping {
	SqlDatabase db = new SqlDatabase();
	CreditCard2 creditCard = new CreditCard2();
	Cash cash = new Cash();

	public void buy(Tipo tipo) {
		db.save(this);
		switch (tipo) {
		case credit:
			creditCard.pay(this);
			break;
		case cash:
			cash.pay(this);
			break;
		}

	}
}