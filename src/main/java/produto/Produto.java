package produto;

import java.util.Date;

public class Produto {

    private String codigoDeBarras;
    private String nome;
    private Integer quantidade;
    private Double preco;
    private Date dataValidade;
    private Date dataProducao;
    private String lote;
    private String marca;
    private String nomeFornecedor;
    private Double dimensoesLargura;
    private Double dimensoesAltura;
    private Double dimensoesComprimento;
    private String tipo;

    public Produto (){
        this.codigoDeBarras = "";
        this.nome = "";
    }


    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public Double getDimensoesLargura() {
        return dimensoesLargura;
    }

    public void setDimensoesLargura(Double dimensoesLargura) {
        this.dimensoesLargura = dimensoesLargura;
    }

    public Double getDimensoesAltura() {
        return dimensoesAltura;
    }

    public void setDimensoesAltura(Double dimensoesAltura) {
        this.dimensoesAltura = dimensoesAltura;
    }

    public Double getDimensoesComprimento() {
        return dimensoesComprimento;
    }

    public void setDimensoesComprimento(Double dimensoesComprimento) {
        this.dimensoesComprimento = dimensoesComprimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
