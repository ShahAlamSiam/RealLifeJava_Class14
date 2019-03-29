package PackageClass14;

public class MotorCycle {
	private String Name;
	private int Wheel;
	private String Brand;
	private String Model;
	
	
	
	public void setModel(String model) {

		String validModel =model.toLowerCase();
		if(validModel.contentEquals("pulser")|| validModel.contentEquals("honda")) {
			Model = model;
		}else {
			Model = "Unknown";
		}
	}

	public String getModel() {
		// TODO Auto-generated method stub
		return Model;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getWheel() {
		return Wheel;
	}

	public void setWheel(int wheel) {
		Wheel = wheel;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}
	

}
