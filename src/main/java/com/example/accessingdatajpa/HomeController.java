package com.example.accessingdatajpa;


import com.example.accessingdatajpa.product.vo.ProductDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String greeting() {
        return "Hello, Welcome To visit";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String greeting1() {
        return "getMethod, default Good to see you";
    }

    //변수명 변경해야할 경우
    @GetMapping("var/{userNm}")
    // 변수명 변경하기 위해서 사용
    String greetingVar(@PathVariable("userNm") String userName) {
        return "getMethod, var Good to see you! userName: $userName";
    }

    //    Url 쿼리
    @GetMapping("query")
    String queryGreeting(@RequestParam String name, @RequestParam String email) {
        return "getMethod,query Good to see you! userName: \"$name\" :: email : \"$email\"";
    }

    //    Map 형식으로 받음
    @GetMapping("map")
    String mapGreeting(@RequestParam Map<String, Object> param) {


        return "getMethod, Map Good to see you! userName: \"$sb\"";
    }

    // DTO 사용
    @GetMapping("dto")
    String dtoGreeting(@RequestParam ProductDTO product) {
        return "getMethod, UserDTO Good to see you! userName: \"${user.name}\" :: email : \"${user.email}\"";
    }

    @PostMapping("/post")
    String greetingUser(@RequestBody String name) {
        return "postMethod, Good to see you, name: ${name}";
    }

    @PostMapping("/post/map")
    String postUser(@RequestBody Map<String, Object> data) {

//        val sb = StringBuilder()
//
//        for (entry in data.entries) {
//            sb.append("${entry.key} = ${entry.value}, ")
//        }
        return "Done:Map:: ${sb.toString()}";
    }

    // DTO 멤버 필드 변수 필수값인데 안들어오면 에러 발생함.
    // bad request
    @PostMapping("/post/dto")
    String postDto(@RequestBody ProductDTO product) {
        return "Done:DTO:: ${user.toString()}";
    }


}
