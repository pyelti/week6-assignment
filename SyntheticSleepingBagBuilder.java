package state;

public class SyntheticSleepingBagBuilder extends SleepingBagBuilder{
	
	public SyntheticSleepingBagBuilder() {
		this.name = "Synthetic SleepingBag";
	}

	@Override
	public SleepingBagBuilder addPolyester() {
		this.materials.add("Ployester");
		return this;
	}

	@Override
	public SleepingBagBuilder addNylon() {
		this.materials.add("Nylon");
		return this;
	}

	@Override
	public SleepingBagBuilder addpolycotton() {
		this.materials.add("Polycotton");
		return null;
	}

	@Override
	public SleepingBagBuilder addRipstop() {
		return this;
	}

	@Override
	public SleepingBagBuilder addSilk() {
		return this;
	}

	@Override
	public SleepingBagBuilder addTaffeta() {
		return this;
	}
	

}
