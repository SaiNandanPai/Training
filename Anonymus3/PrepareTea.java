package Anonymus3;

public class PrepareTea {

    private Milk milk;
    private TeaPowder teaPowder;
    private Vessel vessel;
    private Stove stove;

    private Water water;
    private Sugar sugar;

    public void initialzeTea() {
        stove = new Stove();
        vessel = new Vessel();

        //vessel imports
        vessel.add(water, teaPowder);

        stove.putUpVessel(vessel);
        stove.igniteGas();
        stove.heatVessel(vessel);

        //vessel imports
        vessel.add(milk, sugar);

        stove.continueHeating(vessel);

        stove.switchOff();

    }

    public Vessel getVessel() {
        return vessel;
    }

}
