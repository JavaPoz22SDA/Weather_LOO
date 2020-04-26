package pl.sda.weather;

public class Weather {

    private Double temperature;
    private String city;


    private Request request;
    private Location location;
    private Current current;

    public Weather(){}

    public Weather(Double temperature, String city, Request request, Location location) {
        this.temperature = temperature;
        this.city = city;
        this.request = request;
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
