package designPatternBishi1.decorator;

public class Battercake extends ABattercake{

	@Override
	protected String getDesc() {
		return "���";
	}

	@Override
	protected int cost() {
		return 8;
	}
	
}
