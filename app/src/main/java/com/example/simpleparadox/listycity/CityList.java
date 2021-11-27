package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns the number of cities
     * @return
     *      returns the count of array list elements
     */

    public int Count(){
        return cities.size();

    }

    /**
     * This deletes a city from the list if it exists, else throws exception
     * @param city
     *       This is a candidate city to delete
     */

    public void delete(City city){

        try{
            cities.remove(city);
        }
        catch (Exception exp){
            System.out.println("Exception : " + exp.toString() );
        }


    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

}
