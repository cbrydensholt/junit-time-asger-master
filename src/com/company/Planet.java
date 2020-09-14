package com.company;

public class Planet extends orbitalObject {


    public Planet() {

    }

    public void addPlanets(){

        Planet Earth = new Planet("Earth", 365, 6371, "Sun", 0);
        Planet Mercury = new Planet("Mercury", 88,2439, "Sun", 890 );
        Planet Venus = new Planet("Venus", 225, 6051, "Sun", 1010);
        Planet Mars = new Planet("Mars", 687, 3389, "Sun", 555 );
        Planet Jupiter = new Planet("Jupiter", 555, 5325, "Luna",  692);


    }



public void distanceFromEarth(Planet planet1, Planet planet2){

        int distance1 = planet1.getDistanceFromEarth();
        int distance2 = planet2.getDistanceFromEarth();




}





  String belongingSun;
    int distanceFromEarth;

    public Planet(String name, double lengthOfYear, int size, String belongingSun, int distanceFromEarth) {
        super(name, lengthOfYear, size);
        this.belongingSun = belongingSun;
        this.distanceFromEarth = distanceFromEarth;
    }

    public Planet(String belongingSun, int distanceFromEarth) {
        this.belongingSun = belongingSun;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getBelongingSun() {
        return belongingSun;
    }

    public void setBelongingSun(String belongingSun) {
        this.belongingSun = belongingSun;
    }

    public int getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDistanceFromEarth(int distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    // Planet earth = new Planet("Earth", 365.25, 6371);

    public void testPlanet(){

    }


}
