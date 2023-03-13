package produto;

import java.util.Date;

public class ProdutoBuilder {

    private Produto produto;

    public ProdutoBuilder(){ produto = new Produto(); }

    public Produto build(){

        if (produto.getCodigoDeBarras() == ""){
            throw new IllegalArgumentException("Código de Barras inválido");
        }

        if (produto.getNome() == ""){
            throw new IllegalArgumentException("Nome inválido");
        }

        return produto;

    }

    public ProdutoBuilder setCodigoDeBarras(String codigoDeBarras){
        produto.setCodigoDeBarras(codigoDeBarras);
        return this;
    }

    public ProdutoBuilder setNome(String nome){
        produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder setQuantidade(Integer quantidade){
        produto.setQuantidade(quantidade);
        return this;
    }

    public ProdutoBuilder setPreco(Double preco){
        produto.setPreco(preco);
        return this;
    }

    public ProdutoBuilder setDataValidade(Date dataValidade){
        produto.setDataValidade(dataValidade);
        return this;
    }

    public ProdutoBuilder setDataProducao(Date dataProducao){
        produto.setDataProducao(dataProducao);
        return this;
    }

    public ProdutoBuilder setLote(String lote){
        produto.setLote(lote);
        return this;
    }

    public ProdutoBuilder setMarca(String marca){
        produto.setMarca(marca);
        return this;
    }

    public ProdutoBuilder setNomeFornecedor(String nomeFornecedor){
        produto.setNomeFornecedor(nomeFornecedor);
        return this;
    }

    public ProdutoBuilder setDimensoesLargura(Double dimensoesLargura){
        produto.setDimensoesLargura(dimensoesLargura);
        return this;
    }

    public ProdutoBuilder setDimensoesAltura(Double dimensoesAltura){
        produto.setDimensoesAltura(dimensoesAltura);
        return this;
    }

    public ProdutoBuilder setDimensoesComprimento(Double dimensoesComprimento){
        produto.setDimensoesComprimento(dimensoesComprimento);
        return this;
    }

    public ProdutoBuilder setTipo(String tipo){
        produto.setTipo(tipo);
        return this;
    }
}
