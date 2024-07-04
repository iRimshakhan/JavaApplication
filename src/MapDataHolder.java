public class MapDataHolder {
    private String locationName;
    private int rating;
    private int reviewed;
    private String address;

    public MapDataHolder() {
    }

    public MapDataHolder(String locationName, int rating, int reviewed, String address) {
        this.locationName = locationName;
        this.rating = rating;
        this.reviewed = reviewed;
        this.address = address;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReviewed() {
        return reviewed;
    }

    public void setReviewed(int reviewed) {
        this.reviewed = reviewed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LocationName: "+locationName+ "Reviewd: "+reviewed;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
