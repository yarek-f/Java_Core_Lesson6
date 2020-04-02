package ua.lgs.lviv.task1;

public class Worker2 implements Salary{
	
	private String name;
	private int fixedSalary;
	
	public Worker2 (String name, int fixedSalary) {
		super();
		this.name = name;
		this.fixedSalary = fixedSalary;
	}
	
	@Override
	public void salary() {
		System.out.println(name + " earns " + fixedSalary + " dollars per month");		
	}
}
