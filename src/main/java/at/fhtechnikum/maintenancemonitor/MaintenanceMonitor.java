package at.fhtechnikum.maintenancemonitor;

public class MaintenanceMonitor {

    private String message = "";

    private int zahl = 0;

    public String getMessage(){
        return this.message;
    }

    public int getZahl(){ return this.zahl;}
    public void updateMessage(String message){
        this.message = message;
    }

    public void add(int input1, int input2){
        zahl = input1 + input2;
    }

    public void adds(String input){
        String[] splitArray = input.split(" ");
        int[] array = new int[splitArray.length];

        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }

        this.zahl = array[0] + array[1];
    }
}
