package lucas.lemos.oficina.de.carro;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class llp_VeiculoPecaService {

    @Autowired
    private llp_VeiculoPecaRepository llp_repository;

    public List<llp_VeiculoPeca> getAllVeiculoPeca() {
        return llp_repository.findAll();
    }

    public llp_VeiculoPeca getVeiculoPecaById(int id) {
        return llp_repository.findById(id).orElse(null);
    }

    public void saveVeiculoPeca(llp_VeiculoPeca veiculoPeca) {
        llp_repository.save(veiculoPeca);
    }

    public void deleteVeiculoPeca(int id) {
        llp_repository.deleteById(id);
    }
}