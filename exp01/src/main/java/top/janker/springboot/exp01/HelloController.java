package top.janker.springboot.exp01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janker
 * @date 2023/1/23 17:28
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }
}
