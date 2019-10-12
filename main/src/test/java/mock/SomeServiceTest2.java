package mock;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import util.MockitoBeansPostProcessor;
import util.MockitoBeansTestExecutionListener;

import static org.mockito.Mockito.doReturn;

@TestExecutionListeners({MockitoBeansTestExecutionListener.class})
@ContextConfiguration(classes = {SomeServiceTest2.class})
@ComponentScan(basePackageClasses = {SomeServiceTest2.class})
public class SomeServiceTest2 extends AbstractJUnit4SpringContextTests {
    @Autowired
    private SomeService someService;

    @Autowired
    private ManSomeService manSomeService;

    @Mock
    Message message;
    @Mock
    VerMessageSupplier verMessageSupplier;
    @org.junit.Test
    public void test() {

        doReturn("this is mock message2.")
                .when(verMessageSupplier)
                .getMessage();
        someService.printMessage(); //输出this is mock message.

        doReturn("this is mock message2.")
                .when(message)
                .getMessage2();
        manSomeService.printMessage(); //输出this is mock message.
    }
    @Bean
    public BeanFactoryPostProcessor mockBeansPostProcessor(){
        return new MockitoBeansPostProcessor();
    }
}
