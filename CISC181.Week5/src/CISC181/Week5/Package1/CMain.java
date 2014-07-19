package CISC181.Week5.Package1;

/**
 * Purpose of this example is to show how simple and complex enums work... work with function calls, and switch statements
 * @version 1.0
 * @since 7/19/2014
 * @author Dad
 *
 */
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

	/**
	 * WhichCoin uses a CurrencyBasic enum to use in a sample switch case
	 * @param coin
	 */
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
	
	/**
	 * WhichCoin uses a CurrencyBasic enum to use in a complex switch case
	 * @param coin
	 */
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
