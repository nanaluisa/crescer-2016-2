import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class BatalhaoEspecialTest{
    @Test
    public void alistar3ElfosVerdesE2Noturnos(){
        BatalhaoEspecial recruta = new BatalhaoEspecial();
        
        recruta.alistar(new ElfoVerde("Legolas"));
        recruta.alistar(new ElfoVerde("Anna"));
        recruta.alistar(new ElfoVerde("Luísa"));
        recruta.alistar(new ElfoNoturno("Nigth"));
        recruta.alistar(new ElfoNoturno("Nigth2"));
        
        assertEquals(5,recruta.getBatalhao().size());
    
    }
    
    @Test
    public void buscarElfoPorNome(){
        BatalhaoEspecial recruta = new BatalhaoEspecial();
        
        recruta.alistar(new ElfoVerde("Legolas"));
        recruta.alistar(new ElfoVerde("Anna"));
        recruta.alistar(new ElfoVerde("Luísa"));
        recruta.alistar(new ElfoNoturno("Nigth"));
        recruta.alistar(new ElfoNoturno("Nigth2"));
        
        boolean resultado =  recruta.buscar("Anna");
        
        assertEquals("Anna", resultado.getNome());
    
    }
    
    
}
