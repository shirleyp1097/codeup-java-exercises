import java.util.Date;

public class WeatherReading {
    private double latitude;
    private double longitude;
    private Date recordedAt;
    private double tempInCelsius;

    public static double kelvinToCelsius(double temp) {
        return temp - 273.15;
    }

    public void tempInCelsius(double temp) {
        this.tempInCelsius = kelvinToCelsius(temp);
    }

    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInCelsius) {

    }

    public static void main(String[] args) {
        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println(wr.getTempInCelsius());
    }
}
