package CISC181.Week5.Package5;

public class Rectangle {

	private int Length;
	private int Width;
	
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}

	public Rectangle(int Length, int Width)
	{
		this.Width = Width;
		this.Length = Length;
	}
	
	public double Area()
	{
		return this.Width * this.Length;
	}
}
