public class ArquivoFactory {
    public static IArquivo obterArquivo(String arquivo){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("Arquivo" + arquivo);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Arquivo inexistente");
        } if (!(objeto instanceof IArquivo)){
            throw new IllegalArgumentException("Arquivo inválido");
        }
        return (IArquivo) objeto;
    }
}