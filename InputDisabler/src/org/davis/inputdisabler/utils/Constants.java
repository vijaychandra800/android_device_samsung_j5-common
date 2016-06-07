package org.davis.inputdisabler.utils;

/*
 * Created by Dāvis Mālnieks on 04/10/2015
 */

public final class Constants {

    // Paths to input devices

    public static final String TS_PATH = "/sys/devices/soc.0/78b9000.i2c/i2c-5/5-0050/input/input4/enabled";

    public static final String TK_PATH = "/sys/devices/soc.0/i2c.69/i2c-7/7-0020/input/input2/enabled";

    // Doze

    public static final int DOZING_TIME = 1000 * 5;

    public static final String ACTION_DOZE_PULSE_STARTING = "android.intent.action.DOZE_PULSE_STARTING";
}
