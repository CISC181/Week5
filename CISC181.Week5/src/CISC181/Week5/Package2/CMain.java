package CISC181.Week5.Package2;

public class CMain {
	public static void main(String[] args) {

		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
