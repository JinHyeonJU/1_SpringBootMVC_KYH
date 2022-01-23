package hello.springmvc.basic.requestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingControllerFinal {

    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * ★ 많이 사용함.
     * 경로 변수 : 경로에 있는 값
     */
    @GetMapping("/mappingFinal/{userId}")
    public String mappingPath(@PathVariable("userId") String data) {
        log.info("mappingPath userId = {}", data);
        return "ok";
    }
}
