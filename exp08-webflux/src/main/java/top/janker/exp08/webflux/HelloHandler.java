package top.janker.exp08.webflux;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author janker
 * @date 2022/6/8
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Component
public class HelloHandler {
    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(new HelloWorld("Hello, Spring!")));
    }
}
