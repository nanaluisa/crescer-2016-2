/*Classe MeuCalendarioUtil que tem as definições:
 * Possui um metodo que recebe a data de nascimento e retorna o dia da semana que a pessoa nasceu. (Segunda, Terça ...)
 * Possui um metodo que recebe uma data e informe o tempo decorrido até a data atual. 30 ano(s), 3 messe(s) e 12 dia(s)
 * Metodo main, que informe os recursos disponíveis ao usuário. (Menu)
 */
package br.com.cwi.crescer.aula1.exercicios1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_WEEK;
import java.util.Date;


/**
 *@author ANNA LUISA
 */
public class MeuCalendarioUtil {
    
    public static void main(String[] args) {
        System.out.println("Meu Calendário Util");
        System.out.println("Então, era isso que tinha de exibir....");
    }
    
    public void diaDaSemanaDoNascimento(String data) throws ParseException{
       if(data != null){
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
           Date dataNascimento = simpleDateFormat.parse(data);
           Calendar calendar = Calendar.getInstance();
           calendar.setTime(dataNascimento);
           switch (calendar.get(DAY_OF_WEEK)) {
                     case 1:
                         System.out.println("Domingo"); 
                     case 2:
                         System.out.println("Segunda");
                    case 3:
                         System.out.println("Terça");
                     case 4:
                         System.out.println("Quarta");
                     case 5:
                         System.out.println("Quinta");
                     case 6:
                         System.out.println("Sexta");
                     case 7:
                         System.out.println("Sábado");
                     default:
                         System.out.println("Não identificado, favor rever a data fornecida!");
           }
       }else{ 
           System.out.println("Nenhuma data informada!");
       }          
    }
    //Exemplos e Correção em aula.
    private static final String ANOS_NESSES_DIAS = "Ano(s) %s, messes %s, dia(s) %s";
    public String tempoDecorrido(final Date date) {
        if (date == null) {
            return null;
        }
        final Calendar calendar = Calendar.getInstance();
        long diff = new Date().getTime() - date.getTime();
        calendar.setTime(new Date(diff));
   
                
        return String.format(ANOS_NESSES_DIAS, calendar.get(Calendar.YEAR) - 1970, calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        
        
    }
    public String tempoDecorrido(final LocalDate localDate) {
        final Period between = Period.between(localDate, LocalDate.now());
        return String.format(ANOS_NESSES_DIAS, between.getYears(), between.getMonths(), between.getDays());
    }
    
    
    
    
    
    
    
}
    

