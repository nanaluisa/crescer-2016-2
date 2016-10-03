import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

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
        Dwarf dwarf = new Dwarf("Legolas", new DataTerceiraEra(2, 3, 2015)); 
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
    
   //Testes em aula
   
   @Test
   public void adicionarUmItemInventarioDwarf(){
       Dwarf dwarf = new Dwarf();
       dwarf.adicionarItem(new Item("Poção Mágica",5));
       
       assertEquals("Poção Mágica",dwarf.getInventario().getItens().get(0).getDescricao()); 
   }
   
     @Test 
    public void adicionarItemNoInventario() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.adicionarItem(espadaZ); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
 
    @Test 
    public void inventarioSemAdicionarItem() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
 
    @Test 
    public void adicionarDoisItensNoInventario() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item botasDeFerro = new Item("Iron Boots", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(botasDeFerro); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(botasDeFerro)); 
    } 
 
    @Test 
    public void adicionarCincoItensNoInventario() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item botasDeFerro = new Item("Iron Boots", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(botasDeFerro)); 
        assertEquals(5, dwarf.getInventario().getItens().size()); 
    } 
 
    @Test 
    public void adicionarItemNoInventarioEDepoisRemovelo() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.perderItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
 
    @Test 
    public void adicionarDoisItensNoInventarioERemoverApenasUm() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item bastaoMagico = new Item("Bastão Mágico", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(bastaoMagico); 
        dwarf.perderItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(bastaoMagico)); 
    } 
 
    @Test 
    public void removerItemSemAdicionaloAntes() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.perderItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
   
     @Test 
    public void aumentar1000Unidades3Itens() { 
        Dwarf dwarf = new Dwarf("Sortudo", new DataTerceiraEra(1, 1, 2016)); 
        dwarf.perderVida(); 
        dwarf.perderVida(); 
        dwarf.perderVida(); 
        dwarf.adicionarItem(new Item("Espada de aço", 2)); 
        dwarf.adicionarItem(new Item("Poção polissuco", 45)); 
        dwarf.adicionarItem(new Item("Lucky egg", 3)); 
        dwarf.tentarSorte(); 
        ArrayList<Item> itens = dwarf.getInventario().getItens(); 
        assertEquals(1002, itens.get(0).getQuantidade()); 
        assertEquals(1045, itens.get(1).getQuantidade()); 
        assertEquals(1003, itens.get(2).getQuantidade()); 
    } 
}



