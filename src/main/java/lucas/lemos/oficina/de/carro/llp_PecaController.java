package lucas.lemos.oficina.de.carro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pecas")
public class llp_PecaController {
    @Autowired
    private llp_PecaRepository llp_pecaRepository;
  

    @GetMapping("rest")
    public ResponseEntity<List<llp_Peca>> llp_listarPecas_rest() {
        List<llp_Peca> pecas = llp_pecaRepository.findAll();
        return ResponseEntity.ok(pecas); // Retorna a lista dentro de ResponseEntity
    }


    @GetMapping
    public String listarPecas(Model model) {
        List<llp_Peca> pecas = llp_pecaRepository.findAll();
        model.addAttribute("pecas", pecas);
        return "llp_listaPecas";
    }

    @GetMapping("/novo")
    public String exibirFormularioNovaPeca(Model model) {
        model.addAttribute("peca", new llp_Peca());
        return "llp_formPeca";
    }

    @PostMapping
    public String salvarPeca(@ModelAttribute llp_Peca peca) {
        llp_pecaRepository.save(peca);
        return "redirect:/pecas";
    }

    @GetMapping("/editar/{id}")
    public String exibirFormularioEditarPeca(@PathVariable int id, Model model) {
        llp_Peca peca = llp_pecaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Peca inválida: " + id));
        model.addAttribute("peca", peca);
        return "llp_formPeca";
    }

    @PostMapping("/editar/{id}")
    public String atualizarPeca(@PathVariable int id, @ModelAttribute llp_Peca peca) {
        peca.setLlp_idpeca(id);
        llp_pecaRepository.save(peca);
        return "redirect:/pecas";
    }

    @GetMapping("/deletar/{id}")
    public String deletarPeca(@PathVariable int id) {
        llp_Peca peca = llp_pecaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Peca inválida: " + id));
        llp_pecaRepository.delete(peca);
        return "redirect:/pecas";
    }
}
