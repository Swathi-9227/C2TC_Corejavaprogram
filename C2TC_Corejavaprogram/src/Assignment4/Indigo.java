package Assignment4;

public class Indigo implements Airfare {
	int hours;
	double costPerHour;
	
	
	public Indigo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Indigo(int hours, double costPerHour) {
		super();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}


	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	@Override
	public double calculateAmount() {
		return hours*costPerHour*8;
	}
	@Override
	public void display() {
		System.out.printf("%.2f\n", calculateAmount());
	}
	

}