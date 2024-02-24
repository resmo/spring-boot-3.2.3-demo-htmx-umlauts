package net.renemoser.repro;

import io.github.wimdeblauwe.htmx.spring.boot.mvc.HtmxResponse;
import io.github.wimdeblauwe.htmx.spring.boot.mvc.HxRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class DemoController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/umlauts")
    public String umlauts() {
        return "umlauts :: demo";
    }

    @HxRequest
    @GetMapping("/umlauts2")
    public HtmxResponse umlauts2(Model model) {
        return HtmxResponse.builder()
                .view("umlauts :: demo")
                .build();
    }
}
