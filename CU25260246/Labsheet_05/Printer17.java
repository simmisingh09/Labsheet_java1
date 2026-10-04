// Q17. Printer + Scanner -> MultiFunctionMachine



interface Printer17 {
    void print();
}

interface Scanner17 {
    void scan();
}

class MultiFunctionMachine17
        implements Printer17, Scanner17 {

    private String machineName;
    private int machineId;

    // Setter for machineName
    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    // Getter for machineName
    public String getMachineName() {
        return machineName;
    }

    // Setter for machineId
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    // Getter for machineId
    public int getMachineId() {
        return machineId;
    }

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    public void displayDetails() {
        System.out.println("Machine Name: " + getMachineName());
        System.out.println("Machine ID: " + getMachineId());
    }

    public static void main(String[] args) {

        MultiFunctionMachine17 machine =
                new MultiFunctionMachine17();

        machine.setMachineName("HP MultiFunction");
        machine.setMachineId(101);

        machine.displayDetails();

        machine.print();
        machine.scan();
    }
}

  
