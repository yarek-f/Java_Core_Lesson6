package ua.lgs.lviv.task1;

public class Worker1 implements Salary {

	private String name;
	private int NumberOfHours;
	private int HourlyRate;
	
	public Worker1(String name, int NumbeOfHours, int HourlyRate) {
		super();
		this.name = name;
		this.NumberOfHours = NumbeOfHours;
		this.HourlyRate = HourlyRate;
	}
	
	
	@Override
	public void salary() {
		System.out.println(name + " earns " + NumberOfHours*HourlyRate + " dollars per month");		
	}
	
}
