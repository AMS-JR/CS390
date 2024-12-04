package problem_three;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private String location;
    private LocalTime lastUpdated;
    private double temperature;
    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        this.lastUpdated = LocalTime.now();
    }
    /**
     * @return 
     */
    @Override
    public String getSensorType() {
        return "Temperature";
    }

    /**
     * @return 
     */
    @Override
    public double getReading() {
        return temperature;
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
        // Update lastUpdated to the current system time whenever this method is called.
        lastUpdated = LocalTime.now();
        return lastUpdated;
    }

    /**
     * @return 
     */
    @Override
    public String performAction() {
        if (temperature > 30) {
            return "Turn on the AC";
        } else if (temperature < 18) {
            return "Turn on the heater";
        } else {
            return "Temperature is within normal range";
        }
    }
    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + getReading() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a")) + "\n" +
                "Action: " + performAction()+ "\n";
    }

}
