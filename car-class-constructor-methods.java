public class Car {
    private int yearModel;
    private String make;
    private int currentSpeed;

    public Car(int newYear, String newMake) {
        this.yearModel = newYear;
        this.make = newMake;
        this.currentSpeed = 0;
    }

    public int getYearModel() {
        return this.yearModel;
    }

    public String getMake() {
        return this.make;
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public void setYearModel(int newYear) {
        this.yearModel = newYear;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void setSpeed(int newSpeed) {
        this.currentSpeed = newSpeed;
    }

    public void accelerate() {
        this.currentSpeed += 5;
    }

    public void brake() {
        this.currentSpeed -= 5;
    }
}
