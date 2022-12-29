package com.yeonmew.blog.test;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

import org.springframework.web.bind.annotation.*;

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {


    // http://localhost:8080/http/get (select)
    // 인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다.
    @GetMapping("/http/get")
    public String getTest(Member m) {
        return "get 요청:" + m.getId() + "," + m.getUsername() + "," + m.getPassword()+","+m.getEmail();
    }

    // http://localhost:8080/http/post (insert)
    @PostMapping("/http/post")
    public String postTest(String text) {
        return "post 요청:" + text;
    }

    // http://localhost:8080/http/put (update)
    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }

    // http://localhost:8080/http/delete (delete)
    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }
}
