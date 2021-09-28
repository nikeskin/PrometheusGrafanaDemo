package de.nikeskin.prometheusgrafanademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class MockController {

    @GetMapping
    public List<String> getMock() {
        List<String> returnList = new ArrayList<>();
        returnList.add("Hey");
        returnList.add("Ho");
        returnList.add("Hi");
        return returnList;
    }

}
