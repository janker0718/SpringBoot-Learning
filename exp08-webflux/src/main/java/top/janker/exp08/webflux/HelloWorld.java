package top.janker.exp08.webflux;

import lombok.Data;

/**
 * @author janker
 * @date 2022/6/8
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Data
public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }
}
