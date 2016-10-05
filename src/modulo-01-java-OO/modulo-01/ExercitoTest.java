import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ExercitoTest{
    @Test
    public void alistar3ElfosVerdesE3Noturnos(){
        //Arrange
        Exercito milico = new Exercito();
        
        ElfoVerde green1 = new ElfoVerde("Green 1");
        ElfoVerde green2 = new ElfoVerde("Green 2");
        ElfoVerde green3 = new ElfoVerde("Green 3");
        
        ElfoNoturno nigth1 = new ElfoNoturno("Nigth 1");
        ElfoNoturno nigth2 = new ElfoNoturno("Nigth 2");
        ElfoNoturno nigth3 = new ElfoNoturno("Nigth 3");
        //Act
        milico.addElfosValidos(green1);
        milico.addElfosValidos(green2);
        milico.addElfosValidos(green3);
        milico.addElfosValidos(nigth1);
        milico.addElfosValidos(nigth2);
        milico.addElfosValidos(nigth3);
        
        //Assert
        assertEquals(6, milico.getElfosAlistados().size() );
    }
    
    @Test
    public void alistar3ElfosVerdesE2NoturnosETentarAlistarElfoNormal(){
        //Arrange
        Exercito milico = new Exercito();
        
        ElfoVerde green1 = new ElfoVerde("Green 1");
        ElfoVerde green2 = new ElfoVerde("Green 2");
        ElfoVerde green3 = new ElfoVerde("Green 3");
        
        ElfoNoturno nigth1 = new ElfoNoturno("Nigth 1");
        ElfoNoturno nigth2 = new ElfoNoturno("Nigth 2");
        
        Elfo elfo1 = new Elfo("Elfo normal");
        //Act
        milico.addElfosValidos(green1);
        milico.addElfosValidos(green2);
        milico.addElfosValidos(green3);
        milico.addElfosValidos(nigth1);
        milico.addElfosValidos(nigth2);
        milico.addElfosValidos(elfo1);
        
        
        //Assert
        assertEquals(5, milico.getElfosAlistados().size() );
    }
    
    
    @Test
    public void tentarAlistar6ElfosNormais(){
        //Arrange
        Exercito milico = new Exercito();
               
        Elfo elfo1 = new Elfo("Elfo normal");
        Elfo elfo2 = new Elfo("Elfo normal");
        Elfo elfo3 = new Elfo("Elfo normal");
        Elfo elfo4 = new Elfo("Elfo normal");
        Elfo elfo5 = new Elfo("Elfo normal");
        Elfo elfo6 = new Elfo("Elfo normal");
        //Act
        milico.addElfosValidos(elfo1);
        milico.addElfosValidos(elfo2);
        milico.addElfosValidos(elfo3);
        milico.addElfosValidos(elfo4);
        milico.addElfosValidos(elfo5);
        milico.addElfosValidos(elfo6);
        
        
        //Assert
        assertEquals(0, milico.getElfosAlistados().size() );
    }
}
