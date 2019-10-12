package reconsitution;

import lombok.Data;

import java.util.List;

/**
 * @program: main
 * @description: invoices 发票
 * @author: william
 * @create: 2019-08-09 08:02
 **/
@Data
public class Invoices {
    private String customer;
    private List<Performance> Performances;
}
