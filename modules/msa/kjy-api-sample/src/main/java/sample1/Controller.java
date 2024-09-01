package sample1;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sample")
@Tag(name = "sample Controller", description = "간단한 TestController")
public class Controller {

    @GetMapping("/api")
    public String sampleController (){
        return "health check";
    }
}
