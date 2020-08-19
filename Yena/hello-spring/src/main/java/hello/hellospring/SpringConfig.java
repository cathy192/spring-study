package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());  //멤버 서비스빈과 멤버리퍼지터리 빈 연결해줘야함
        //멤버 서비스를 호출해서 스프링 빈에 등록해줌
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();

        }

}
