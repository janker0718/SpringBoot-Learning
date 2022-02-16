package top.janker.springboot.exp01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author janker
 * @date 2022/2/16
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */

@Data
@AllArgsConstructor
public class Greeting {
    private long id;
    private  String content;
}
