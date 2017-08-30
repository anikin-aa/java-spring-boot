package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

   @RequestMapping(method = RequestMethod.GET)
   public String index(ModelMap model) {
      return "index";
   }

   @RequestMapping(method = RequestMethod.POST)
   public String postMethod(ModelMap modelMap) {
      return index(modelMap);
   }
}