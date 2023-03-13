package produto;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class ProdutoBuilderTest {

    @Test
    void deveRetornarExcecaoParaProdutoSemCodigoDeBarras(){
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setNome("Chocolate")
                    .setMarca("Lacta")
                    .build();
            fail();
        } catch (IllegalArgumentException exception){
            assertEquals("Código de Barras inválido", exception.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProdutoSemNome(){
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setCodigoDeBarras("23A8J")
                    .setMarca("Lacta")
                    .build();
            fail();
        } catch (IllegalArgumentException exception){
            assertEquals("Nome inválido", exception.getMessage());
        }
    }

    @Test
    void deveRetornarProdutoValido(){
        ProdutoBuilder produtoBuilder = new ProdutoBuilder();
        Produto produto = produtoBuilder
                .setCodigoDeBarras("23A8J")
                .setNome("Chocolate")
                .setQuantidade(51)
                .setPreco(9.50)
                .setLote("29L1P30")
                .setMarca("Lacta")
                .setNomeFornecedor("Marco Antônio de Araújo")
                .setDimensoesLargura(0.5)
                .setDimensoesAltura(10.5)
                .setDimensoesComprimento(5.5)
                .setTipo("Alimento/Doce")
                .build();
    }
}
