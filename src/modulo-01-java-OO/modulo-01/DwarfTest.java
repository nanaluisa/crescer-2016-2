import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest
{
    @Test
    public void dwarfNasceCom110Vida() {
        DataTerceiraEra data = new DataTerceiraEra(12,03,5000);
        Dwarf gimli = new Dwarf("Gimli",data);
        assertEquals(110, gimli.getVida());
    }

    @Test
    public void dwarfPerdeVidaUmaVez() {
        DataTerceiraEra data = new DataTerceiraEra(12,03,5000);
        Dwarf gimli = new Dwarf("Gimli",data);
        gimli.perdeVida();
        assertEquals(100, gimli.getVida());
    }

    @Test
    public void dwarfPerdeVidaDuasVezes() {
        DataTerceiraEra data = new DataTerceiraEra(12,03,5000);
        Dwarf gimli = new Dwarf("Gimli",data);
        gimli.perdeVida();
        gimli.perdeVida();
        assertEquals(90, gimli.getVida());
    }
    /*
    @Test
    public void dwarfPerdeVidaVinteVezes() {
        DataTerceiraEra data = new DataTerceiraEra(12,03,5000);
        Dwarf gimli = new Dwarf("Gimli",data);
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(-90, gimli.getVida());
    }
    */
   
   @Test
    public void numeroDaSorteDwarfAnoBissextoNomeSeixas() {
        DataTerceiraEra data = new DataTerceiraEra(20,12,2016);
        Dwarf seixas = new Dwarf("Seixas",data);
        
        seixas.getNumeroDaSorte();
        
        assertEquals(110, seixas.getVida());
        
    }
}



