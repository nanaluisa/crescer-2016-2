import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoVerdeTest{
    @Test
    public void ElfoVerdeNasceCom100DeVida(){
        //Arrange
        ElfoVerde green = new ElfoVerde("Green");
        //Act
        green.getVida();
        //Assert
        assertEquals(100,green.getVida(), 0.);
    }
    
    @Test
    public void ElfoVerdeAtira3FlechasETem6DeExperiencia(){
        //Arrange
        ElfoVerde green = new ElfoVerde("Green");
        Dwarf dwarf = new Dwarf();
        //Act
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        
        //Assert
        assertEquals(6,green.getExperiencia());
        
    }
    
    @Test
    public void ElfoVerdeAtira9FlechasETem18DeExperienciaDwarfVivo(){
        //Arrange
        ElfoVerde green = new ElfoVerde("Green");
        Dwarf dwarf = new Dwarf();
        
        //Act
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        
        
        //Assert
        assertEquals(18,green.getExperiencia());
        assertEquals(Status.VIVO,dwarf.getStatus());
    }
    
    @Test
    public void ElfoVerdeAtira11FlechasETem22DeExperienciaDwarfMorto(){
        //Arrange
        ElfoVerde green = new ElfoVerde("Green");
        Dwarf dwarf = new Dwarf();
        
        //Act
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        green.atirarFlecha(dwarf);
        
        
        //Assert
        assertEquals(22,green.getExperiencia());
        assertEquals(Status.MORTO,dwarf.getStatus());
        
    }
    
    @Test 
    public void elfoVerdeAdicionaEspadaValiriana() { 
        ElfoVerde sortudo = new ElfoVerde("Sortudo"); 
        Item espada = new Item("Espada de aço valiriano", 1); 
        sortudo.adicionarItem(espada); 
        assertEquals(2, sortudo.getInventario().getItens().size()); 
        assertEquals(espada, sortudo.getInventario().getItens().get(2)); 
    } 
 
    @Test/* 
    public void elfoVerdeAdicionaItemComDescricaoInvalida() { 
        ElfoVerde sortudo = new ElfoVerde("Mugless"); 
        sortudo.adicionarItem(new Item("Caneca", 1)); 
        assertEquals(2, sortudo.getInventario().getItens().size()); 
    }*/ 
    //Testando a nova forma de add item no array de itens validos
    public void elfoVerdeAdicionaItemComDescricaoInvalida() { 
        ElfoVerde sortudo = new ElfoVerde("Mugless"); 
        sortudo.adicionarItem(new Item("Caneca", 1)); 
        Item caneca = new Item("Caneca", 1); 
        sortudo.adicionarItem(caneca); 
        boolean adicionou = sortudo.getInventario().getItens().contains(caneca); 
        assertEquals(2, sortudo.getInventario().getItens().size()); 
        assertFalse(adicionou); 
    } 
    
    @Test 
    public void elfoVerdeAdicionaArcoEFlechaVidroENulo() { 
        ElfoVerde sortudo = new ElfoVerde("Celeborn"); 
        Item arcoEFlecha = new Item("Arco e Flecha de Vidro", 1); 
        sortudo.adicionarItem(arcoEFlecha); 
        sortudo.adicionarItem(null); 
        assertEquals(1, sortudo.getInventario().getItens().size()); 
        assertEquals(arcoEFlecha, sortudo.getInventario().getItens().get(0)); 
    } 
 
    @Test 
    public void elfoVerdeAdicionaArcoEFlechaVidroEDescricaoNula() { 
        ElfoVerde sortudo = new ElfoVerde("Celeborn"); 
        Item arcoEFlecha = new Item("Arco e Flecha de Vidro", 1); 
        Item descricaoNula = new Item(null, 1); 
        sortudo.adicionarItem(arcoEFlecha); 
        sortudo.adicionarItem(descricaoNula); 
        assertEquals(2, sortudo.getInventario().getItens().size()); 
        assertEquals(arcoEFlecha, sortudo.getInventario().getItens().get(2)); 
    }  
    
}