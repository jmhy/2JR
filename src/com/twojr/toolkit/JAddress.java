package com.twojr.toolkit;

/**
 * Created by rcunni002c on 11/17/2016.
 */
public class JAddress extends JData{

    private byte[] address;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public JAddress(){

    }

    public JAddress(int id, String name, int size, byte[] address) {
        super(id, name, size);
        this.address = address;
    }

    //==================================================================================================================
    // Getter(s) & Setter(s)
    //==================================================================================================================

    public byte[] getAddress() {
        return address;
    }

    public void setAddress(byte[] address) {
        this.address = address;
    }

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    @Override
    public byte[] compress() {
        return new byte[0];
    }

    @Override
    public int getSavings() {
        return 0;
    }

    @Override
    public String print() {

        String output = "Address: ";

        for(byte bits : address)
        {
            output  += bits + ":";

        }

        output += "\n";

        return output;

    }

    @Override
    public byte[] toByte() {

        return address;
        
    }


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================

} /*********************************************END OF FILE*************************************************************/
