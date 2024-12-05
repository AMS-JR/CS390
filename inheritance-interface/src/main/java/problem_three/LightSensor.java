package problem_three;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private String location;
    private LocalTime lastUpdated;
    private double lightlevel;

    public LightSensor(String location, double lightlevel) {
        this.location = location;
        this.lightlevel = lightlevel;
        this.lastUpdated = LocalTime.now();
    }

    /**
     * @return 
     */
    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    /**
     * @return 
     */
    @Override
    public double getReading() {
        return lightlevel;
    }

    /**
     * @return 
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * @return 
     */
    @Override
    public LocalTime getLastUpdated() {
        lastUpdated = LocalTime.now();
        return lastUpdated;
    }

    /**
     * @return 
     */
    @Override
    public String performAction() {
        return (lightlevel < 100)?
                "Turn on the light":
                "Light is sufficient";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + getReading() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a")) + "\n" +
                "Action: " + performAction() + "\n";
    }
}
