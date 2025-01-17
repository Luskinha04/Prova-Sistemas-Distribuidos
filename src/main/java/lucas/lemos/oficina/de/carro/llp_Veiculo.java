package lucas.lemos.oficina.de.carro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Veiculo")
public class llp_Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    @Column(name = "idveiculo")
    private int llp_idveiculo;

    @Column(name = "nome") // Nome da coluna no banco de dados
    private String llp_nome;

    @Column(name = "modelo") // Nome da coluna no banco de dados
    private String llp_modelo;

    @Column(name = "marca") // Nome da coluna no banco de dados
    private String llp_marca;

    @Column(name = "ano") // Nome da coluna no banco de dados
    private int llp_ano;


    // Getters e Setters
    public int getLlp_idveiculo() {
        return llp_idveiculo;
    }

    public void setLlp_idveiculo(int llp_idveiculo) {
        this.llp_idveiculo = llp_idveiculo;
    }

    public String getLlp_nome() {
        return llp_nome;
    }

    public void setLlp_nome(String llp_nome) {
        this.llp_nome = llp_nome;
    }

    public String getLlp_modelo() {
        return llp_modelo;
    }

    public void setLlp_modelo(String llp_modelo) {
        this.llp_modelo = llp_modelo;
    }

    public String getLlp_marca() {
        return llp_marca;
    }

    public void setLlp_marca(String llp_marca) {
        this.llp_marca = llp_marca;
    }

    public int getLlp_ano() {
        return llp_ano;
    }

    public void setLlp_ano(int llp_ano) {
        this.llp_ano = llp_ano;
    }
}
