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
        gimli.perderVida();
        assertEquals(100, gimli.getVida());
    }

    @Test
    public void dwarfPerdeVidaDuasVezes() {
        DataTerceiraEra data = new DataTerceiraEra(12,03,5000);
        Dwarf gimli = new Dwarf("Gimli",data);
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(90, gimli.getVida());
    }
    
    @Test
    public void dwarfPerdeVidaVinteVezesNaoDeveVidas() {
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
        assertEquals(0, gimli.getVida());
    }
    
   
   @Test
    public void numeroDaSorteDwarfAnoBissextoNomeSeixas() {
        DataTerceiraEra data = new DataTerceiraEra(20,12,2016);
        Dwarf seixas = new Dwarf("Seixas",data);
        
        seixas.getNumeroDaSorte();
        
        assertEquals(110, seixas.getVida());
        
    }
    
    @Test 
    public void dwarfPerderVidaComNumeroSorteNegativo() { 
        // Arrange 
        Dwarf dwarf = new Dwarf("Gimli", new DataTerceiraEra(1,1,2000)); 
        dwarf.perderVida(); 
        dwarf.perderVida(); 
        // Act 
        dwarf.perderVida(); 
        // Assert 
        assertEquals(2, dwarf.getExperiencia()); 
        assertEquals(90, dwarf.getVida(), .0);    
    } 
 
    @Test 
    public void dwarfPerderVidaComAnoNaoBissextoMeirelesNaoPerde() { 
        Dwarf meireles = new Dwarf("Meireles", new DataTerceiraEra(2, 3, 2015)); 
        meireles.perderVida(); 
        assertEquals(0, meireles.getExperiencia()); 
        assertEquals(110, meireles.getVida(), .0); 
    } 
 
    @Test 
    public void dwarfPerderVidaNormal(){ 
        Dwarf dwarf = new Dwarf("André Nunin", new DataTerceiraEra(2, 3, 2015)); 
        dwarf.perderVida(); 
        assertEquals(100, dwarf.getVida(), .0); 
        assertEquals(0, dwarf.getExperiencia()); 
    }
    
    
    
   @Test
   public void dwarfNasceVivo(){
       Dwarf dwarf = new Dwarf();       
       assertEquals(dwarf.getStatus(),Status.VIVO);
   }
    
   @Test
   public void statusDwarfMortoPerdeVida20NaoDeveVidas(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       assertEquals(Status.MORTO,dwarf.getStatus());
       assertEquals(0,dwarf.getVida());
    }
   
   @Test
   public void statusDwarfVivoPerdeVida1(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perderVida();
       
       assertEquals(Status.VIVO, dwarf.getStatus());
   }
    
   @Test
   public void statusDwarfVivoPerdeVida7(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       
       assertEquals(Status.VIVO, dwarf.getStatus());
   } 
    
   @Test
   public void statusDwarfVivoPerdeVida11(){
       Dwarf dwarf = new Dwarf();
       
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       dwarf.perderVida();
       
       assertEquals(Status.MORTO,dwarf.getStatus());
       assertEquals(0,dwarf.getVida());
   } 
    
   
}



