package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RqTest {


    @Test
    @DisplayName("getActionName(\"삭제?id=1\") : 삭제")
    void t1(){

        Rq rq = new Rq("삭제?id=1");

        String actionName= rq.getActionName();

        assertThat(actionName).isEqualTo("삭제");
    }

    @Test
    @DisplayName("getActionName(\"수정?id=1\") : 수정")
    void t2(){

        Rq rq = new Rq("수정?id=1");

        String actionName= rq.getActionName();

        assertThat(actionName).isEqualTo("수정");
    }

    @Test
    @DisplayName("getParam(입력값 : \"등록?이름=홍길동\") : 홍길동")
    void t3(){

        Rq rq = new Rq("");

        String actionName= rq.getParam("등록?이름=홍길동");

        assertThat(actionName).isEqualTo("홍길동");
    }

    @Test
    @DisplayName("getParam(입력값: \"등록?고향=서울\": getParam(\"고향\") : 서울")
    void t4(){

        Rq rq = new Rq("");

        String actionName= rq.getParam("등록?고향=서울");

        assertThat(actionName).isEqualTo("서울");
    }
}
