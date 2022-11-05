package entities;

public class Rectangle {
	
	private double height;
	private double width;
	
	public Rectangle() {}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2*(this.width + this.height);
	}
	
	public double diagonal() {
		double hipotenusa = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(hipotenusa);
	}
	
}
