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
    
   @Test
   public void dwarfNasceVivo(){
       Dwarf dwarf = new Dwarf();       
       assertEquals(dwarf.getStatus(),Status.VIVO);
   }
    
   @Test
   public void statusDwarfMortoPerdeVida20NaoDeveVidas(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       assertEquals(Status.MORTO,dwarf.getStatus());
       assertEquals(0,dwarf.getVida());
    }
   
   @Test
   public void statusDwarfVivoPerdeVida1(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perdeVida();
       
       assertEquals(Status.VIVO, dwarf.getStatus());
   }
    
   @Test
   public void statusDwarfVivoPerdeVida7(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       
       assertEquals(Status.VIVO, dwarf.getStatus());
   } 
    
   @Test
   public void statusDwarfVivoPerdeVida11(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       dwarf.perdeVida();
       
       assertEquals(Status.MORTO,dwarf.getStatus());
       assertEquals(0,dwarf.getVida());
   } 
    
   
}



