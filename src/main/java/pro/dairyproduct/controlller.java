package pro.dairyproduct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlller {

    @RequestMapping("/rightcontact")
    public String registerform(@ModelAttribute("frm") Forms frm) {
        return "rightcontact";
    }

    @RequestMapping("/success")
    public String registersucc(@ModelAttribute("frm") Forms frm) {
        return "success";
    }
}
