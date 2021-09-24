package inversiondependencias07;

public class ShoppingBasket implements Shopping {
	SqlDatabase db = new SqlDatabase();
	Payment payment;
	
	public ShoppingBasket(Payment payment) {
		super();
		this.payment = payment;
	}

	public void buy() {
		db.save(this);
		payment.pay(this);

	}
}
