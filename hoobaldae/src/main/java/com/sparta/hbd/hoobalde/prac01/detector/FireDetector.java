package com.sparta.hbd.hoobalde.prac01.detector;

public class FireDetector implements Detectable{

    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재를 감지합니다.");
    }
}
