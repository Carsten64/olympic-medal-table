package com.carsten.grid;

import com.carsten.model.Country;
import com.vaadin.ui.Grid;

import java.util.Arrays;
import java.util.List;

public class GridTable extends Grid<Country>{

    private static GridTable grid = null;

    private GridTable(){
        setCaption("Olympic Medal Table");
        addColumn(Country::getName).setCaption("Country");
        addColumn(Country::getTotal).setCaption("Total");
        addColumn(Country::getGold).setCaption("Gold");
        addColumn(Country::getSilver).setCaption("Silver");
        addColumn(Country::getBronze).setCaption("Bronze");

        setItems(setData());
    }

    public static GridTable getGrid(){
        if(grid == null){
            grid = new GridTable();
        }
        return  grid;
    }

    private List<Country> setData(){
        return Arrays.asList(
                new Country("Germany", "DE",1,2,3),
                new Country("Norway", "no",2,2,3)
        );
    }

}
