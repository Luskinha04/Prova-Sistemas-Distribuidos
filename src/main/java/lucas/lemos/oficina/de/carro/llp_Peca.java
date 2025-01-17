package lucas.lemos.oficina.de.carro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Peca")
public class llp_Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpeca")
    private int llp_idpeca;

    @Column(name = "nome")
    private String llp_nome;

    @Column(name = "descricao")
    private String llp_descricao;

    @Column(name = "altura")
    private double llp_altura;

    @Column(name = "largura")
    private double llp_largura;

    @Column(name = "profundidade")
    private double llp_profundidade;

    @Column(name = "material_fabricacao")
    private String llp_materialFabricacao;

    @Column(name = "local_veiculo")
    private String llp_localVeiculo;


    public int getLlp_idpeca() {
        return llp_idpeca;
    }

    public void setLlp_idpeca(int llp_idpeca) {
        this.llp_idpeca = llp_idpeca;
    }

    public String getLlp_nome() {
        return llp_nome;
    }

    public void setLlp_nome(String llp_nome) {
        this.llp_nome = llp_nome;
    }

    public String getLlp_descricao() {
        return llp_descricao;
    }

    public void setLlp_descricao(String llp_descricao) {
        this.llp_descricao = llp_descricao;
    }

    public double getLlp_altura() {
        return llp_altura;
    }

    public void setLlp_altura(double llp_altura) {
        this.llp_altura = llp_altura;
    }

    public double getLlp_largura() {
        return llp_largura;
    }

    public void setLlp_largura(double llp_largura) {
        this.llp_largura = llp_largura;
    }

    public double getLlp_profundidade() {
        return llp_profundidade;
    }

    public void setLlp_profundidade(double llp_profundidade) {
        this.llp_profundidade = llp_profundidade;
    }

    public String getLlp_materialFabricacao() {
        return llp_materialFabricacao;
    }

    public void setLlp_materialFabricacao(String llp_materialFabricacao) {
        this.llp_materialFabricacao = llp_materialFabricacao;
    }

    public String getLlp_localVeiculo() {
        return llp_localVeiculo;
    }

    public void setLlp_localVeiculo(String llp_localVeiculo) {
        this.llp_localVeiculo = llp_localVeiculo;
    }
}
