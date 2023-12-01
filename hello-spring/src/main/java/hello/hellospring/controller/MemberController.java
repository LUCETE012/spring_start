package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 얘는 어쩔 수 없음
public class MemberController {

    private final MemberService memberService;

    //생성자 주입
    @Autowired // memberService를 스프링 컨테이너에 있는거랑 연결시켜줌. 의존관계 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
