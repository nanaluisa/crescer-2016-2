import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DwarfTest
{
    @Test
    public void dwarfNasceCom110Vidas(){
        Dwarf gimli = new Dwarf();
        assertEquals(110, gimli.getVida());
    }
    
    @Test
    public void dwarfPerdeVidaUmaVez(){
        Dwarf gimli = new Dwarf();
        gimli.perdeVida();
        assertEquals(100, gimli.getVida());
    }
    
    @Test
    public void dwarfPerdeVidaDuasVezes(){
        Dwarf gimli = new Dwarf();
        gimli.perdeVida();
        gimli.perdeVida();
        assertEquals(90, gimli.getVida());
    }
    
    @Test
    public void dwarfPerdeVida20Vezes(){
        Dwarf gimli = new Dwarf();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.perdeVida();
        assertEquals(-90, gimli.getVida());
    }
}
