package Assignment4;

public class AirIndia implements Airfare {
	private int hours;
	private double costPerHour;
	
	public AirIndia() {
		super();
	}

	public AirIndia(int hours, double costOerHour) {
		super();
		this.hours = hours;
		this.costPerHour = costOerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostOerHour() {
		return costPerHour;
	}

	public void setCostOerHour(double costOerHour) {
		this.costPerHour = costOerHour;
	}

	@Override
	public double calculateAmount() {
		return hours*costPerHour;
	}
	@Override
	public void display() {
		System.out.printf("%.2f\n",calculateAmount());
	}
}