import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoDocTest {

    @Test
    void deveLerArquivoDoc() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("Doc");
        assertEquals("Lendo arquivo doc", arquivo.ler());
    }

    @Test
    void deveEscreverrArquivoDoc() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("Doc");
        assertEquals("Escrevendo arquivo doc",  arquivo.escrever());
    }

}