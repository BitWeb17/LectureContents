package com.example.demo.controller.response;

import com.example.demo.entity.TestMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

public class ResponseTestController {
    private static final Logger log =
            LoggerFactory.getLogger(ResponseTestController.class);

    /* ResponseBody는 json 타입으로 응답을 하겠다는 소리 */
    @ResponseBody
    @GetMapping("/responseTestMember")
    public TestMember getTestMember() {
        log.info("getTestMember()");

        TestMember tm = new TestMember();

        return tm;
    }

    @ResponseBody
    @GetMapping("/responseTestMemberList")
    public List<TestMember> getTestMemberList() {
        log.info("getTestMemberList()");

        List<TestMember> list = new ArrayList<TestMember>();

        TestMember tm1 = new TestMember();
        list.add(tm1);

        TestMember tm2 = new TestMember();
        list.add(tm2);

        return list;
    }

    /* 꺽쇠 내부에 적는 코드는 모두 클래스 타입으로 맞춰주는 것이 좋다. */
    @GetMapping("/responseVoidData")
    public ResponseEntity<Void> getVoidData() {
        log.info("getVoidData()");

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/responseOneData")
    public ResponseEntity<String> getOneData() {
        log.info("getOneData()");

        return new ResponseEntity<String>(
                "Success", HttpStatus.OK);
    }

    @GetMapping("/responseEntityTestMember")
    public ResponseEntity<TestMember> getTestMemberResponseEntity() {
        log.info("getTestMemberResponseEntity()");

        TestMember tm = new TestMember();

        return new ResponseEntity<TestMember>(tm, HttpStatus.OK);
    }

    @GetMapping("/responseTestMemberList")
    public ResponseEntity<List<TestMember>>
    getTestMemberListResponseEntity() {
        log.info("getTestMemberListResponseEntity()");

        List<TestMember> list = new ArrayList<TestMember>();

        TestMember tm1 = new TestMember();
        list.add(tm1);

        TestMember tm2 = new TestMember();
        list.add(tm2);

        return new ResponseEntity<List<TestMember>>(
                list, HttpStatus.OK);
    }
}
