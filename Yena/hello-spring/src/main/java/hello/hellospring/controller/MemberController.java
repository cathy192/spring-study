package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


//기능 없어도 스프링 컨테이너에 멤버 컨트롤러 객체를
//스프링이 만들어둠
@Controller
public class MemberController {

    private final MemberService memberService ;

    @Autowired
    //스프링이 멤버 서비스를 연결해줌
    public MemberController(MemberService memberService) {
        //생성자
       this.memberService = memberService;
    }
}
