package com.sparta.hbd.hoobalde.prac01;

import com.sparta.hbd.hoobalde.prac01.camera.FactoryCam;
import com.sparta.hbd.hoobalde.prac01.detector.AdvancedFireDetector;
import com.sparta.hbd.hoobalde.prac01.detector.Detectable;
import com.sparta.hbd.hoobalde.prac01.detector.FireDetector;
import com.sparta.hbd.hoobalde.prac01.reporter.AdvancedrReporter;
import com.sparta.hbd.hoobalde.prac01.reporter.NormalReporter;

public class InterTest {
    public static void main(String[] args) {

        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        AdvancedrReporter advancedrReporter = new AdvancedrReporter();
        advancedrReporter.report();

        System.out.println("------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("---------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);

        factoryCam.setReporter(advancedrReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
