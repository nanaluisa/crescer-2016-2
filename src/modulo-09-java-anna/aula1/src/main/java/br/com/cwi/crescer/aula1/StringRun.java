package br.com.cwi.crescer.aula1;
//import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @author anna.silva
 */
public class StringRun {
    public static void main(String[] args) {
        
        
        
        //System.out.println(new SimpleDateFormat("dd/MM/yyyy").new Date());
        
    SimpleDateFormat formatarData = new SimpleDateFormat("dd-MM-yyyy");
    Date dataAtual = new Date();
    String data = formatarData.format(dataAtual);
    System.out.println("Data Atual: " + data);    
        
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    Date dataAtualEHora = new Date();
    String dataHora = simpleDateFormat.format(dataAtualEHora);
    System.out.println("Data e Hora Atual: " + dataHora);
        
    
        
        
//        String inputTimeStamp = "2012/07/19 09:49:00 - GMT -08:00";
//        java.text.SimpleDateFormat dateformate= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        effDate = dateformate.parse(inputTimeStamp);
        
               
       // System.out.println("Data e Hora atual: " +c.getTime().simpleDateFormat);
        
         
//        estadosDoBrasil();
//        
//        String frase;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite uma frase:  " + scanner.nextLine());
          
    }
    
    //Terminar
    //Solicitar que o usuário informe um frase, e retorna a quantidade de vogais.
//    public void quantidadeDeVogais(String frase){
//        int cont =0;
//        frase.replace("e", "a");
//        frase.replace("i", "a");
//        frase.replace("o", "a");
//        frase.replace("u", "a");
//        return 0;
//    }

//    public void retornaPalavraInvertida(){
//    }
//    static void estadosDoBrasil(){
//        new StringBuilder(estados + ",").append(estados);
//        Estados[] estados = Estados.values();
//        
//     for(int i =0; i < estados.length; i++){
//         
//         
//         
//     }
        
        
//    Exibir na console a data atual do sistema.
//    Informe a data de nascimento e devolva o dia da semana.
    
    
    
    public static void semanaDataNascimento(String data){
         //Informe a data de nascimento e devolva o dia da semana.   
        //System.out.println("Digite sua data de Nascimento: " + data);
        
        //SimpleDateFormat.parse(data);
        
        
        
    }
    
		
	






}
    

    
    
    
    
    
    
    
//        if ("A".compareTo(new String("A"))==0) {
//            System.out.println("0");
//        } else {
//            System.out.println("1");
//        }
  

