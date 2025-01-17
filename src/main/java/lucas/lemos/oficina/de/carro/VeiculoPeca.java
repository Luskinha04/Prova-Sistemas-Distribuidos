package lucas.lemos.oficina.de.carro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "veiculo_peca")
public class VeiculoPeca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long llp_id;

    @Column(name = "idpeca", nullable = false)
    private int llp_idPeca;

    @Column(name = "idveiculo", nullable = false)
    private int llp_idVeiculo;

    @Column(name = "quantidade", nullable = false)
    private String llp_quantidade;

    // Getters e Setters
    public Long getLlp_id() {
        return llp_id;
    }

    public void setLlp_id(Long llp_id) {
        this.llp_id = llp_id;
    }

    public int getLlp_idPeca() {
        return llp_idPeca;
    }

    public void setLlp_idPeca(int llp_idPeca) {
        this.llp_idPeca = llp_idPeca;
    }

    public int getLlp_idVeiculo() {
        return llp_idVeiculo;
    }

    public void setLlp_idVeiculo(int llp_idVeiculo) {
        this.llp_idVeiculo = llp_idVeiculo;
    }

    public String getLlp_quantidade() {
        return llp_quantidade;
    }

    public void setLlp_quantidade(String llp_quantidade) {
        this.llp_quantidade = llp_quantidade;
    }
}