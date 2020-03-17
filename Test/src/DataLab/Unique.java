package DataLab;

public class Unique {
	private String fentanyl;
	private String benzodiazepine;
	
	public Unique(String f, String b) {
		fentanyl = f;
		benzodiazepine = b;
		
	}

	public String getfentanyl() {
		return fentanyl;
	}

	public void setfentanyl(String fentanyl) {
		this.fentanyl = fentanyl;
	}

	public String getbenzodiazepine() {
		return benzodiazepine;
	}

	public void setbenzodiazepine(String benzodiazepine) {
		this.benzodiazepine = benzodiazepine;
	}
}