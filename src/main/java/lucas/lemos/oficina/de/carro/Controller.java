package lucas.lemos.oficina.de.carro;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @GetMapping
    public String home(Model model) {
        return "home";
    }
}
