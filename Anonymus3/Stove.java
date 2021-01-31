package Anonymus3;

public class Stove {
    private GasLighter lighter;
    private Vessel vessel;

    public void igniteGas() {
        lighter = new GasLighter();
        // ignites
    }

    public void putUpVessel(Vessel vessel) {
        this.vessel = vessel;
    }

    public void heatVessel(Vessel vessel) {
       // high flame
    }

    public void continueHeating(Vessel vessel) {
        if (this.vessel.equals(vessel)) {
            vessel.setTea(new Tea());
        }
    }

    public void switchOff() {

    }

}
