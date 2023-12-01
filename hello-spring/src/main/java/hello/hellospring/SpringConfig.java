package hello.hellospring;

import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean // 스프링 빈에 등록
    public MemberService memberService() {
        return new MemberService(memberRepository()); // Autowired 처럼 이어줌
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
