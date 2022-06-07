package Model.computer;

public class PC extends Computer {

    private boolean powerSupplied;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        powerSupplied = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public void setPowerSupply(boolean powerSupply) {
        powerSupplied = powerSupply; 
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (powerSupplied) {
            super.switchOn();
        } else {
            System.out.println("Power supply not connected");
        }
        
    }

}
