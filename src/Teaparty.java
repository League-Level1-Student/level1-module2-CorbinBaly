import javax.swing.JOptionPane;

public class Teaparty {
	private String isWoman;
	private String isKnighted;
	private String name;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting= "Hello ";
		if (isKnighted && !isWoman) {
			greeting +="Sir ";
		} else if (!isKnighted && !isWoman) {
			greeting +="Mr. ";
		}
		if (isKnighted && isWoman) {
			greeting += "Lady ";

		} else if (!isKnighted && isWoman) {
		greeting += "Ms. ";
		}
		return greeting+= name;
	}

}


