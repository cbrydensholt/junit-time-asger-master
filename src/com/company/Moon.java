package com.company;

import java.util.ArrayList;

public class Moon extends orbitalObject {

    ArrayList<Moon> moonList = new ArrayList<>();



    public Moon() {
        super();
    }


    public void createList(){
        Moon moon = new Moon("Moon", 17, 1737,"Earth");
        Moon luna = new Moon("Luna", 67, 1737,"Venus");
        Moon tuna = new Moon("Tuna", 57, 1737,"Jupiter");
        Moon muna = new Moon("Muna", 27, 1737,"Venus");
        Moon suna = new Moon("Suna", 557, 1737,"Mars");
        Moon kuna = new Moon("Kuna", 237, 1737,"Saturn");



        moonList.add(moon);
        moonList.add(luna);
        moonList.add(tuna);
        moonList.add(muna);
        moonList.add(suna);
        moonList.add(kuna);

    }


   public void checkList(String planet){


        int i = 0;

        for(Moon moon : moonList){
            if(moon.getBelongingPlanet() == planet){
                i++;
            }

        }
       System.out.println("There are " +  i + " moons for " + planet);




   }



















    String belongingPlanet;

    public Moon(String name, double lengthOfYear, int size, String belongingPlanet) {
        super(name, lengthOfYear, size);
        this.belongingPlanet = belongingPlanet;
    }

    public String getBelongingPlanet() {
        return belongingPlanet;
    }

    public void setBelongingPlanet(String belongingPlanet) {
        this.belongingPlanet = belongingPlanet;
    }





}
