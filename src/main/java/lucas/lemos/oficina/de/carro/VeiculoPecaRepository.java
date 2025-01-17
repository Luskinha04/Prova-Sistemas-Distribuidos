package lucas.lemos.oficina.de.carro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoPecaRepository extends JpaRepository<llp_VeiculoPeca, Long> {

}
