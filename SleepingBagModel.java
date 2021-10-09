package state;

import java.util.List;

public class SleepingBagModel {
	String name;
	List<String> materials;
	public void addMaterials(List<String> materials) {
		this.materials = materials;
	}
	void prepare() {
		System.out.println("Preparing SleepingBag..... " + name);
		for(String material: materials) {
			System.out.println("   " + material);
		}
	}
	void LayeredAndOffSet() {
		System.out.println(" Two layers are insulated and placed one on top of the other and sewn.");
	}
	void Shingled() {
		System.out.println("This method takes shingles of insulation and stitches them to the outer shell and to the lining. ");
	}
	void DifferentialCut() {
		System.out.println(" The lining is cut and shaped into different shapes of sleeping bags");
		
	}
	
	void Zipping() {
		System.out.println("The zip is installed");
	}
	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("" + this.name + "=");
		for(String material : materials) {
			display.append(material + "\n");
		}
		return display.toString();
	}


}
