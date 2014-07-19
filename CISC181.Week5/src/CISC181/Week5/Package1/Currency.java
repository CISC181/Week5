package CISC181.Week5.Package1;

public enum Currency implements Runnable {
	PENNY(1) {
		@Override
		public String color() {
			return "copper";
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	},
	NICKLE(5) {
		@Override
		public String color() {
			return "bronze";
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	},
	DIME(10) {
		@Override
		public String color() {
			return "silver";
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	},
	QUARTER(25) {
		@Override
		public String color() {
			return "silver";
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	};
	private int value;

	public abstract String color();

	private Currency(int value) {
		this.value = value;
	}
}
