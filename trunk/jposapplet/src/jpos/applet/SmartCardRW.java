package jpos.applet;

import netscape.javascript.JSObject;

public class SmartCardRW extends jpos.SmartCardRW {

    public void readData(int action, JSObject count, JSObject data) throws jpos.JposException {
        int[] ints = new int[1];
        String[] strings = new String[1];
        super.readData(action, ints, strings);
        count.setSlot(0, ints[0]);
        data.setSlot(0, strings[0]);
    }

    public void compareFirmwareVersion(String firmwareFileName, JSObject result) throws jpos.JposException {
        int[] ints = new int[1];
        super.compareFirmwareVersion(firmwareFileName, ints);
        result.setSlot(0, ints[0]);
    }

    public void retrieveStatistics(JSObject statisticsBuffer) throws jpos.JposException {
        String[] strings = new String[1];
        super.retrieveStatistics(strings);
        statisticsBuffer.setSlot(0, strings[0]);
    }

    public void addDataListener(JSObject event) {
        super.addDataListener(DataListener.get(event));
    }

    public void removeDataListener(JSObject event) {
        super.removeDataListener(DataListener.get(event));
    }

    public void addDirectIOListener(JSObject event) {
        super.addDirectIOListener(DirectIOListener.get(event));
    }

    public void removeDirectIOListener(JSObject event) {
        super.removeDirectIOListener(DirectIOListener.get(event));
    }

    public void addErrorListener(JSObject event) {
        super.addErrorListener(ErrorListener.get(event));
    }

    public void removeErrorListener(JSObject event) {
        super.removeErrorListener(ErrorListener.get(event));
    }

    public void addOutputCompleteListener(JSObject event) {
        super.addOutputCompleteListener(OutputCompleteListener.get(event));
    }

    public void removeOutputCompleteListener(JSObject event) {
        super.removeOutputCompleteListener(OutputCompleteListener.get(event));
    }
}
