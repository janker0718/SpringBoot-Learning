package top.janker.exp03.swagger.v2.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import top.janker.exp03.swagger.v2.constant.ResponseStatusEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @date: 2022/4/8 5:46 下午
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * @return swagger config
     */
    @Bean
    public Docket openApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("User API")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(getGlobalRequestParameters())
                .globalResponseMessage(RequestMethod.GET, getGlobalResponse());
    }

    /**
     * @return global response code->description
     */
    private List<ResponseMessage> getGlobalResponse() {
        return ResponseStatusEnum.HTTP_STATUS_ALL.stream().map(
                        a -> new ResponseMessageBuilder().message(a.getDescription())
                                .code(Integer.parseInt(a.getResponseCode())).build())
                .collect(Collectors.toList());
    }

    /**
     * @return global request parameters
     */
    private List<Parameter> getGlobalRequestParameters() {
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(new ParameterBuilder()
                .name("AppKey")
                .description("App Key")
                .defaultValue("app-value")
                .modelRef(new ModelRef("String"))
                .required(false)
                .build());
        return parameters;
    }

    /**
     * @return api info
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger API")
                .description("test swagger api")
                .contact(new Contact("janker", "https://www.share-java.com", "690864766@qq.com"))
                .termsOfServiceUrl("http://xxxx.share-java.com/")
                .version("1.0")
                .build();
    }
}
