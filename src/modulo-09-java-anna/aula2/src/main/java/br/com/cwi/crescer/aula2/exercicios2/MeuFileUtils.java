package br.com.cwi.crescer.aula2.exercicios2;

import java.io.File;
import java.io.IOException;

/**
 * @author ANNA LUISA
 */

/* Classe MeuFileUtils que tem as definições abaixo:
 * Receba um instrução de entrar como mk, rm, ls, mv (
 * mk ${nome} // Vai criar o arquivo / diretório.
 * rm ${nome} // Vai excluir o arquivo, caso for um diretório deve exibir uma mensagem que o arquivo é invalido.
 * ls ${nome} // Vai mostra o caminho absoluto, se for um diretório listar o nome dos arquivos internos.
 * mv ${nome} ${nome_novo} // Vai mover o arquivo, caso for um diretório deve exibir uma mensagem que o arquivo é invalido.
    
 */
public class MeuFileUtils {

    //comando mk
    public static void criarArquivo(String name) {

//        final File file = new File(".");
//        if (file.isDirectory()) {
//                //... 
//        }
//        if (file.isFile()) {
//            //... 
//        }

        try {
            final boolean b = new File(name).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //comando rm
    public static void excluirArquivo(String name) {

        final boolean b = new File(name).delete();

    }

    //comando ls
    public static String caminhoArquivo(String name) {

        final String path = new File(name).getAbsolutePath();
        return path;
    }

    //comando mv
    public static void moverArquivo(String name) {

    }

}
