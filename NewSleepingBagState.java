package state;

public class NewSleepingBagState implements State {
	SleepingBag sleepingBag;
	public NewSleepingBagState(SleepingBag sleepingBag) {
		this.sleepingBag = sleepingBag;
	}

	public void newSleepingBag() {
		System.out.println("This is a new Sleeping Bag");
		System.out.println("Preparation of new Sleeping bag");
		SleepingBagBuilder builder=new SyntheticSleepingBagBuilder();
		SleepingBagModel model=builder.addPolyester().addNylon().addpolycotton().addRipstop().addSilk().addTaffeta().build();
		model.prepare();
		model.LayeredAndOffSet();
		model.Shingled();
		model.DifferentialCut();
		model.Zipping();
		
		System.out.println(model);
		 builder=new DownSleepingBagBuilder();
		 model=builder.addPolyester().addNylon().addpolycotton().addRipstop().addSilk().addTaffeta().build();
		model.prepare();
		model.LayeredAndOffSet();
		model.Shingled();
		model.DifferentialCut();
		model.Zipping();
		System.out.println(model);

	}

	@Override
	public void pack() {
		System.out.println("You need to get out first to pack sleeping bag");

	}

	@Override
	public void unpack() {
		System.out.println("Unable to unpack sleeping bag when you are inside");

	}

	@Override
	public void getInside() {
		System.out.println("Inside of Sleeping bag");

	}

	@Override
	public void getOutside() {
		System.out.println("Getting outside of Sleeping bag");
		sleepingBag.setState(sleepingBag.getOutsideState());
	}

}
