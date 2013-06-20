package portserie;

import processing.core.PApplet;
import static processing.core.PApplet.println;
import processing.serial.Serial;

public final class LectureBoutonPoussoir extends PApplet {

    public LectureBoutonPoussoir() {

        Serial myPort;
        println(Serial.list());
        myPort = new Serial(this, Serial.list()[1], 9600);// [1] pour COM3

        while (true) {
            while (myPort.available() > 0) {
                System.out.print((char) myPort.read());
            }

        }
    }
}
