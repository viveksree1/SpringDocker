package springboot.A_basic_Spring_boot_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping("/")
public String home() {
return "Spring boot is working!";
}
}
