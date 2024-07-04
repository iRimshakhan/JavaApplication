public class BluePrintOfHouse {
    /*
    * Data Structure:Store data
    * Behaviour class: Store data perfom operation
    * */
    private int noOfBedrooms;
    private int noOfLivingRooms;
    private int noOfWashrooms;
    private int noOfToilets;
    private boolean isAttached;

    private int noOfKitchen;

    public BluePrintOfHouse() {
    }

    public BluePrintOfHouse(int noOfBedrooms, int noOfLivingRooms, int noOfWashrooms, int noOfToilets, boolean isAttached, int noOfKitchen) {
        this.noOfBedrooms = noOfBedrooms;
        this.noOfLivingRooms = noOfLivingRooms;
        this.noOfWashrooms = noOfWashrooms;
        this.noOfToilets = noOfToilets;
        this.isAttached = isAttached;
        this.noOfKitchen = noOfKitchen;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public int getNoOfLivingRooms() {
        return noOfLivingRooms;
    }

    public void setNoOfLivingRooms(int noOfLivingRooms) {
        this.noOfLivingRooms = noOfLivingRooms;
    }

    public int getNoOfWashrooms() {
        return noOfWashrooms;
    }

    public void setNoOfWashrooms(int noOfWashrooms) {
        this.noOfWashrooms = noOfWashrooms;
    }

    public int getNoOfToilets() {
        return noOfToilets;
    }

    public void setNoOfToilets(int noOfToilets) {
        this.noOfToilets = noOfToilets;
    }

    public boolean isAttached() {
        return isAttached;
    }

    public void setAttached(boolean attached) {
        isAttached = attached;
    }

    public int getNoOfKitchen() {
        return noOfKitchen;
    }

    public void setNoOfKitchen(int noOfKitchen) {
        this.noOfKitchen = noOfKitchen;
    }
}
