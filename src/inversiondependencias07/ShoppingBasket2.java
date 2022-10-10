package inversiondependencias07;

public class ShoppingBasket2 {
	private final Persistence persistence;
	private final PaymentMethod paymentMethod;

	public ShoppingBasket2(Persistence persistence, PaymentMethod paymentMethod) {
		this.persistence = persistence;
		this.paymentMethod = paymentMethod;
	}

	public void buy(Shopping shopping) {
		persistence.save(shopping);
		paymentMethod.pay(shopping);
	}
}
