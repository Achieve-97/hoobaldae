package com.sparta.hbd.hoobalde.prac01.reporter;

public class NormalReporter implements Reportable{
    @Override
    public void report() {
        System.out.println("텍스트로 일반 화재를 신고합니다.");
    }
}
