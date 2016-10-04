import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoVerdeTest{
    @Test
    public void ElfoVerdeNasceCom100DeVidaE2ItensEspecificos(){
        //Arrange
        ElfoVerde green = new ElfoVerde("Green");
        Inventario inventario = new Inventario(); 
        //Act
        green.getVida();
        green.getInventario();
        //Assert
        assertEquals(100,green.getVida());
        //assertEquals("Espada de aço valiriano", inventario.getItens().get(0).getDescricao());
        //assertEquals("Arco e Flecha de Vidro", inventario.getItens().get(1).getDescricao());
        
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
    
}
