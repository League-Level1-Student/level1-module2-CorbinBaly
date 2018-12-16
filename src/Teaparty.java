public class Teaparty {
	private String isWoman;
	private String isKnighted;
	private String name;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted == true && isWoman == false) {
			return "Welcome Sir " + name;
		} else if (isKnighted == false && isWoman == false) {
			return "Welcome Mr." + name;
		}
		if (isKnighted == true && isWoman == true) {
			return "Welcome Lady" + name;

		} else if (isKnighted == false && isWoman == true) {
			return "Welcome Ms." + name;
		}
	}

}


