package com.back;

public class Rq {


    private String cmd;

    public Rq(String cmd){
        this.cmd = cmd;
    }

    public String getActionName(){

        //모르겠으면 의사코드를 이용해서 풀어보기
        //? 기준 왼쪽을 잘라서 반환하면 된다.
        //문자를 자르는 방법? -> gpt한테 물어보자
       return cmd.split("\\?")[0];

    }

    public String getParam(String paramName){

        return paramName.split("\\?")[1].split("=")[1];
    }
}
