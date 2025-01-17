package lucas.lemos.oficina.de.carro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping; // Para ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/veiculos")
public class llp_VeiculoController {
    @Autowired
    private llp_VeiculoService llp_veiculoService;

    @GetMapping("rest")
    public ResponseEntity<List<llp_Veiculo>> llp_listarVeiculos_rest() {
        List<llp_Veiculo> veiculos = llp_veiculoService.llp_listarTodos();
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping
    public String llp_listarVeiculos(Model model) {
        model.addAttribute("veiculos", llp_veiculoService.llp_listarTodos());
        return "veiculos/index";
    }

    @GetMapping("/novo")
    public String llp_formularioCadastro(Model model) {
        model.addAttribute("veiculo", new llp_Veiculo());
        return "veiculos/form";
    }

    @PostMapping
    public String llp_salvarVeiculo(@ModelAttribute llp_Veiculo veiculo) {
        llp_veiculoService.llp_salvar(veiculo);
        return "redirect:/veiculos";
    }

    @GetMapping("/editar/{id}")
    public String llp_editarVeiculo(@PathVariable int id, Model model) {
        llp_Veiculo veiculo = llp_veiculoService.llp_buscarPorId(id);
        model.addAttribute("veiculo", veiculo);
        return "veiculos/form";
    }

    @GetMapping("/excluir/{id}")
    public String llp_excluirVeiculo(@PathVariable int id) {
        llp_veiculoService.llp_excluir(id);
        return "redirect:/veiculos";
    }
}
