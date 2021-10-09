package state;

public class DownSleepingBagBuilder extends SleepingBagBuilder {
	public DownSleepingBagBuilder() {
		this.name = "Down SleepingBag";
	}

	@Override
	public SleepingBagBuilder addPolyester() {
		return this;
	}

	@Override
	public SleepingBagBuilder addNylon() {
		return this;
	}

	@Override
	public SleepingBagBuilder addpolycotton() {
		return this;
	}

	@Override
	public SleepingBagBuilder addRipstop() {
		this.materials.add("RipStop");
		return this;
	}

	@Override
	public SleepingBagBuilder addSilk() {
		this.materials.add("Silk");

		return this;
	}

	@Override
	public SleepingBagBuilder addTaffeta() {
		this.materials.add("Taffeta");

		return this;
	}
	

}
