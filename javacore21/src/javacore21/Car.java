package javacore21;

public class Car{
	
	@CarInfo("Nice car")
	private String brand;
	@CarInfo("maybe you need more?")
	private int horsePower;
	private int price;
	
	public Car(String brand, int horsePower, int price) {
		super();
		this.brand = brand;
		this.horsePower = horsePower;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", horsePower=" + horsePower + ", price=" + price + "]";
	}
	
	
}

