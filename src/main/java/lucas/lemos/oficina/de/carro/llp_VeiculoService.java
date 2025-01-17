package lucas.lemos.oficina.de.carro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class llp_VeiculoService {

    @Autowired
    private llp_VeiculoRepository llp_veiculoRepository;

    public List<llp_Veiculo> llp_listarTodos() {
        return llp_veiculoRepository.findAll();
    }

    public llp_Veiculo llp_buscarPorId(int id) {
        return llp_veiculoRepository.findById(id).orElse(null);
    }

    public void llp_salvar(llp_Veiculo veiculo) {
        llp_veiculoRepository.save(veiculo);
    }

    public void llp_excluir(int id) {
        llp_veiculoRepository.deleteById(id);
    }
}
