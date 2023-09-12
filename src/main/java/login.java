import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@SessionAttributes("name")
@Controller
public  class login {

    @RequestMapping(value = "./login.jsp",method = RequestMethod.GET)
    public String gotologinPage(){
      return  "login";

    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String gotowelcomePage(@RequestParam String name,@RequestParam String password ,ModelMap map){
        map.put("name",name);
        map.put("password",password);

        //Authentication for a user

        return  "login";

    }
}