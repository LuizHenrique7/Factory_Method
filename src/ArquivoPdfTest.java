import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoPdfTest {

    @Test
    void deveLerArquivoPdf() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("Pdf");
        assertEquals("Lendo arquivo pdf", arquivo.ler());
    }

    @Test
    void deveEscreverrArquivoPdf() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("Pdf");
        assertEquals("Escrevendo arquivo pdf",  arquivo.escrever());
    }

}