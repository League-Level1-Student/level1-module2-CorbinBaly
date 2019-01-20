
public class TeaMakerMachine {
public static void main(String[] args) {
	TeaMaker teaMaker = new TeaMaker();
	Cup cup = new Cup();
	Kettle kettle = new Kettle();
	TeaBag teabag = new TeaBag("Mint");
	teabag.getFlavor();
	
	kettle.boil();
	cup.makeTea(teabag, kettle.getWater());

	
	
	
	
	
	
	
}
}
