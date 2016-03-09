package android.server.controller;

import android.server.entity.Base;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/base")
public class BaseController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public Base indexAction(){
        return createMockBase();
    }

    private Base createMockBase() {
        Base base = new Base();
        base.setId(1);
        base.setBaseDate(new Date());
        base.setTitle("Hello");
        return base;
    }
}
