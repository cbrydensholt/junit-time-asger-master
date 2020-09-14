package com.company;

import com.company.Planet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

   /* @Test
    void testPlanet() {

        Planet earth = new Planet("Earth", 365.25, 6371, "vores");
        assertEquals("Earth", earth.getName());
        assertEquals(365, earth.getSize());
        assertEquals(6371, earth.getSize());

    }

    @Test
    void numberOfMoons() {
        Planet Earth = new Planet("Earth", 365, 6371, "Sun");
        Planet Mercury = new Planet("Mercury", 88, 2439, "Sun");
        Planet Venus = new Planet("Venus", 225, 6051, "Sun");
        Planet Mars = new Planet("Mars", 687, 3389, "Sun");

*/
    //}
    @Test
     void distanceFromEarth() {




        Planet Earth = new Planet("Earth", 365, 6371, "Sun", 0);
        Planet Mercury = new Planet("Mercury", 88, 2439, "Sun", 890);
        Planet Venus = new Planet("Venus", 225, 6051, "Sun", 1010);
        Planet Mars = new Planet("Mars", 687, 3389, "Sun", 555);
        Planet Jupiter = new Planet("Jupiter", 555, 5325, "Luna", 692);

        assertEquals(500, Mercury.getDistanceFromEarth() + Mars.getDistanceFromEarth(), 1000);



    }
}