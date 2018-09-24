package rpictl.swing.frame;

import processing.core.PApplet;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;

public class RpiCtl extends PApplet {
    public static void main(String[] args) {
        String[] param = {"Hello Processing"};
        RpiCtl myCls = new RpiCtl();
        PApplet.runSketch(param, myCls);
}

//    @Override
//    public void settings() {
//        size(599, 500);
//    }
}
