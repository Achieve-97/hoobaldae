package com.sparta.hbd.hoobalde.prac01;

import com.sparta.hbd.hoobalde.prac01.camera.Camera;
import com.sparta.hbd.hoobalde.prac01.camera.FactoryCam;
import com.sparta.hbd.hoobalde.prac01.camera.SpeedCam;

public class AbsractTest {
    public static void main(String[] args) {

//        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }
}
