package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    ArrayList<Moon> moonList = new ArrayList<>();

    Moon moon = new Moon("Moon", 17, 1737,"Earth");
    Moon luna = new Moon("Luna", 67, 1737,"Venus");
    Moon tuna = new Moon("Tuna", 57, 1737,"Jupiter");
    Moon muna = new Moon("Muna", 27, 1737,"Venus");
    Moon suna = new Moon("Suna", 557, 1737,"Mars");
    Moon kuna = new Moon("Kuna", 237, 1737,"Saturn");



    @Test
    void orbitalTo() {



        assertEquals("Earth", moon.getBelongingPlanet());

    }

    @Test
    void createList(){
        moonList.add(moon);
        moonList.add(luna);
        moonList.add(tuna);
        moonList.add(muna);
        moonList.add(suna);
        moonList.add(kuna);

        assertEquals(6, moonList.size());
    }

    @Test
    void checkList(String planet){

        moonList.add(moon);
        moonList.add(luna);
        moonList.add(tuna);
        moonList.add(muna);
        moonList.add(suna);
        moonList.add(kuna);

        int i = 0;

        for(Moon moon : moonList){
            if(moon.getBelongingPlanet() == "planet"){
                i++;
            }

        }

        assertEquals(2, i);



    }


}