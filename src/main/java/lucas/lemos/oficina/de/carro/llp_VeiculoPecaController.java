package lucas.lemos.oficina.de.carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/llp_veiculo_peca")
public class llp_VeiculoPecaController {

    @Autowired
    private llp_VeiculoPecaService llp_service;

    @GetMapping
    public String listVeiculoPecas(Model model) {
        model.addAttribute("llp_veiculoPecas", llp_service.getAllVeiculoPeca());
        return "llp_veiculo_peca_list";
    }

    @GetMapping("/create")
    public String createVeiculoPecaForm(Model model) {
        model.addAttribute("llp_veiculoPeca", new llp_VeiculoPeca());
        return "llp_veiculo_peca_form";
    }

    @PostMapping("/save")
    public String saveVeiculoPeca(@ModelAttribute llp_VeiculoPeca veiculoPeca) {
        llp_service.saveVeiculoPeca(veiculoPeca);
        return "redirect:/llp_veiculo_peca";
    }

    @GetMapping("/edit/{id}")
    public String editVeiculoPecaForm(@PathVariable int id, Model model) {
        model.addAttribute("llp_veiculoPeca", llp_service.getVeiculoPecaById(id));
        return "llp_veiculo_peca_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteVeiculoPeca(@PathVariable int id) {
        llp_service.deleteVeiculoPeca(id);
        return "redirect:/llp_veiculo_peca";
    }
}