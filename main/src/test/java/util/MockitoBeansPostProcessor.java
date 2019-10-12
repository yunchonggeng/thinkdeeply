package util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Map;

/**
 * @program: main
 * @description: 测试
 * @author: william
 * @create: 2019-09-09 17:46
 **/
public class MockitoBeansPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Map<Class<?>, MockitoBeansTestExecutionListener.MockBeanWrapper> allMockBeans = MockitoBeansTestExecutionListener.resolvedAllMockBeans();
        for (Map.Entry<Class<?>, MockitoBeansTestExecutionListener.MockBeanWrapper> mockBeanWrapperEntry : allMockBeans.entrySet()) {
            configurableListableBeanFactory.registerResolvableDependency(mockBeanWrapperEntry.getKey(), mockBeanWrapperEntry.getValue().getMockObject());
        }
    }
}
