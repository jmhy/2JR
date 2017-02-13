package com.twojr.protocol;

import com.twojr.toolkit.JData;

/**
 * Created by rcunni002c on 11/17/2016.
 */
public class Attribute{

    private JData data;
    private String name;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Attribute() {
    }

    public Attribute(JData data, String name) {
        this.data = data;
        this.name = name;
    }

    //==================================================================================================================
    // Getter(s) & Setter(s)
    //==================================================================================================================

    public JData getData() {
        return data;
    }

    public void setData(JData data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================

}/*********************************************END OF FILE*************************************************************/

