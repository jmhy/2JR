package com.twojr.protocol.devices;

import com.twojr.protocol.Packet;
import com.twojr.protocol.TwoJrDataGram;
import com.twojr.protocol.aps.ApsPacket;
import com.twojr.protocol.network.NetworkPacket;

/**
 * Created by rcunni002c on 4/7/2017.
 */
public class TwoJrPacketRequestHandler extends TwoJrPacketHandler {

    //==================================================================================================================
    // Constructors(s)
    //==================================================================================================================

    public TwoJrPacketRequestHandler() {

    }

    //==================================================================================================================
    // Getter and Setters(s)
    //==================================================================================================================


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public void handle(TwoJrDataGram dataGram) {

        NetworkPacket networkPacket = dataGram.getPacket();
        ApsPacket apsPacket = new ApsPacket(networkPacket.getPayload());


        switch (apsPacket.getCommandFrame()) {

            case READ:


        }

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================

    private void handleReadRequest() {
    }

    private void handleWriteRequest() {
    }

    private void handleDiscoverRequest() {
    }

    private void handleCheckInRequest() {
    }

    private void handleWakeRequest() {
    }

    private void handleSleepRequest() {
    }


    @Override
    public Packet handle(Packet packet) {
        return null;
    }
}/*********************************************END OF FILE*************************************************************/

