package me.whiteship.demospringsecurityform.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 *
 * @RunWith 는 이제 더이상 사용되지 않는다.
 * 스프링부트는 JUnit 5를 사용하기 때문에 더이상 JUnit 4에서 제공하던 @RunWith를 쓸 필요가 없어졌다.
 * @ExtendWith를 사용해야 하지만, 이미 스프링 부트가 제공하는 모든 테스트용 어노테이션
 * @SpringBootTest에 메타 어노테이션으로 적용되어 있기 때문에 @ExtendWith(SpringExtension.class)를 생략할 수 있다.
 */

@SpringBootTest
@AutoConfigureMockMvc
public class AccountControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void index_annonymout() throws Exception {
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk());

    }
}

