public class Car {

    private String type="Just a car";

    private int carVinNumber;
    private static int carCount=0;

    public ParkLightsStatus parkingLights = ParkLightsStatus.OFF;

    public Car () {
        carCount++;
        carVinNumber=carCount*10000+((int)(Math.random()*1000));

    }

    public void startEngine() {

     System.out.println("типичное ВРУМ-ВРУМ");

    }

    public String getType() {
        return this.type;
    }

    public int getVinNumber () {
        return carVinNumber;
    }

    //STATIC METHOD
     static int getCarCount () {
        return carCount;
    }

    public void headLights () {

        System.out.println("Fa-fa");
    }

    public void parkingLightsOn() {
        parkingLights=ParkLightsStatus.ON;
    }

}
