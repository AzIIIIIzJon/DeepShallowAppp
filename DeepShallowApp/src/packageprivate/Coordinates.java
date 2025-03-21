package packageprivate;

public class Coordinates {

    double  latitude;

    private    double  longitude;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }


    public  Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public void setLatitude(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Coordinates [ latitude=" + latitude + ", longitude=" + longitude + "]";
    }




}
