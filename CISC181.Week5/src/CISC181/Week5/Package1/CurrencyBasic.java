package CISC181.Week5.Package1;

 
public enum CurrencyBasic {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private int value;

    private CurrencyBasic(int value) {
            this.value = value;
    }
};   
