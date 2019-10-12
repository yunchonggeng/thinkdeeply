package reconsitution;

import lombok.Data;

import java.util.Map;

/**
 * @program: main
 * @description: 放映种类
 * @author: william
 * @create: 2019-08-09 08:57
 **/
@Data
public class Plays {
    private Map<String,PlayType> play;
}
