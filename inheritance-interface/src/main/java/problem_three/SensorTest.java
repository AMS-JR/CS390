package problem_three;

public class SensorTest {
    public static void main(String[] args) {
        // Create an array of Sensor objects
        Sensor[] sensors = {
                new LightSensor("Living Room", 50.0),
                new LightSensor("Garden", 150.0),
                new SoundSensor("Bedroom", 80.0),
                new TemperatureSensor("Kitchen", 35.0),
                new TemperatureSensor("Bathroom", 15.0)
        };

        // Iterate through the array and print the sensor type, location, last updated, and action
        for (Sensor sensor : sensors) {
            System.out.println(sensor);
        }
    }
}
