package lucas.lemos.oficina.de.carro;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "veiculo_peca")
public class llp_VeiculoPeca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrelatorio")
    private int llp_idrelatorio;

    @Column(name = "idpeca")
    private int llp_idpeca;

    @Column(name = "idveiculo")
    private int llp_idveiculo;

    @Column(name = "quantidade")
    private String llp_quantidade;

    // Getters e Setters
    public int getLlp_idrelatorio() {
        return llp_idrelatorio;
    }

    public void setLlp_idrelatorio(int llp_idrelatorio) {
        this.llp_idrelatorio = llp_idrelatorio;
    }

    public int getLlp_idpeca() {
        return llp_idpeca;
    }

    public void setLlp_idpeca(int llp_idpeca) {
        this.llp_idpeca = llp_idpeca;
    }

    public int getLlp_idveiculo() {
        return llp_idveiculo;
    }

    public void setLlp_idveiculo(int llp_idveiculo) {
        this.llp_idveiculo = llp_idveiculo;
    }

    public String getLlp_quantidade() {
        return llp_quantidade;
    }

    public void setLlp_quantidade(String llp_quantidade) {
        this.llp_quantidade = llp_quantidade;
    }
}