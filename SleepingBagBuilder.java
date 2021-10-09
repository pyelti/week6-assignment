package state;

import java.util.ArrayList;
import java.util.List;

public abstract class SleepingBagBuilder {
	String name;
	List<String> materials = new ArrayList<String>();
	public abstract SleepingBagBuilder addPolyester();
	public abstract SleepingBagBuilder addNylon();
	public abstract SleepingBagBuilder addpolycotton();
	public abstract SleepingBagBuilder addRipstop();
	public abstract SleepingBagBuilder addSilk();
	public abstract SleepingBagBuilder addTaffeta();

	public SleepingBagModel build() {
		SleepingBagModel sleepingBagModel = new SleepingBagModel();

		sleepingBagModel.setName(this.name);
		sleepingBagModel.addMaterials(materials);
		return sleepingBagModel;
	}

}
