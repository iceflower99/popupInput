package input.model;

public class Thingy
{
	private String name;
	private int age;
	private double weight;

	public Thingy()
	{
		name = "";
		age = -99;
		weight = -.008;
	}

	public Thingy(String name, int age, double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
}