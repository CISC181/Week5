package CISC181.Week5.Package1;

public class CMain {

	public static void main(String[] args) {

		WhichCoin(CurrencyBasic.PENNY);
		WhichCoin(Currency.PENNY);
		WhichCoin(Currency.DIME);
		WhichCoin(Currency.NICKLE);		

		for (Currency coin : Currency.values()) {
			System.out.println("coin: " + coin);
		}

	}

	
	private static void WhichCoin(CurrencyBasic coin) {
		switch (coin) {
		case PENNY:
			System.out.println("Penny coin");
			break;
		case NICKLE:
			System.out.println("Nickle coin");
			break;
		case DIME:
			System.out.println("Dime coin");
			break;
		case QUARTER:
			System.out.println("Quarter coin");
		}
	}	
	
	private static void WhichCoin(Currency coin) {
		switch (coin) {
		case PENNY:
			System.out.println("Penny coin");
			System.out.println("Color of Coin:" + Currency.PENNY.color());
			break;
		case NICKLE:
			System.out.println("Nickle coin");
			break;
		case DIME:
			System.out.println("Dime coin");
			break;
		case QUARTER:
			System.out.println("Quarter coin");
		}
	}
}
