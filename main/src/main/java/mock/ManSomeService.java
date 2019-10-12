package mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-09 17:56
 **/
@Service
public class ManSomeService {

    @Autowired
    Message message;

    public void printMessage() {
        System.out.println(message.getMessage2());
    }
}
