package hello.hellospring;

import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Autowired


    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());  //멤버 서비스빈과 멤버리퍼지터리 빈 연결해줘야함
        //멤버 서비스를 호출해서 스프링 빈에 등록해줌
    }
    @Bean
    public MemberRepository memberRepository(){
        return new JdbcMemberRepository(dataSource);

        }

}
