import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoFactoryTest {

    @Test
    void deveRetornarExcecaoParaArquivoInexistente() {
        try {
            IArquivo arquivo = ArquivoFactory.obterArquivo("mp3");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Arquivo inexistente", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaArquivoInvalido() {
        try {
            IArquivo arquivo = ArquivoFactory.obterArquivo("Odt");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Arquivo inválido", e.getMessage());
        }
    }
}
