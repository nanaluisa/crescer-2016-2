import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
<<<<<<< HEAD
public class DataTerceiraEraTest
{
    @Test
    public void instanciarDataAno2016(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(29,02,2016);
        //Act
        data.ehBissexto();
        //Assert
        //assertEquals(true,data.ehBissexto());
        //Simplificado por:
        assertTrue(data.ehBissexto());
    }
    
    @Test
    public void instanciarDataAno2000(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(29,02,2000);
        //Act
        data.ehBissexto();
        //Assert
        assertTrue(data.ehBissexto());
    }
    
    @Test
    public void instanciarDataAno3019(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(29,02,3019);
        //Act
        data.ehBissexto();
        //Assert
        assertEquals(false,data.ehBissexto());
    }
    
    @Test
    public void criarAno1997NaoEhBissexto(){
        assertFalse(new DataTerceiraEra(21,12,1997).ehBissexto());
    }
    
    @Test
    public void criarAno1996EhBissexto(){
        assertTrue(new DataTerceiraEra(21,12,1996).ehBissexto());
    }
    
    @Test
    public void criarAno5000EhNaoBissexto(){
        assertFalse(new DataTerceiraEra(21,12,5000).ehBissexto());
    }
    
     @Test
    public void criarAno1966NaoEhBissexto(){
        assertFalse(new DataTerceiraEra(21,12,1997).ehBissexto());
    }
    
    //outros exemplos de Testes feitos em aula:
    @Test
    public void criarAno1900NaoEhBissexto(){
        assertFalse(new DataTerceiraEra(21,12,1900).ehBissexto());
    }
    
    @Test 
    public void criarAno3019QueNaoEhBissexto() { 
        // Arrange 
        DataTerceiraEra data = new DataTerceiraEra(1, 10, 3019); 
        // Act 
        boolean obtido = data.ehBissexto(); 
        // Assert 
        assertFalse(obtido); 
    } 
     
    @Test 
    public void criarAno1600QueEhBissexto() { 
        // Arrange 
        DataTerceiraEra data = new DataTerceiraEra(1, 1, 2000); 
        // Act 
        boolean obtido = data.ehBissexto(); 
        // Assert 
        assertTrue(obtido); 
    } 
     
    @Test 
    public void criarAno2012QueEhBissexto() { 
        assertTrue(new DataTerceiraEra(04, 05, 2012).ehBissexto()); 
    } 
     
    @Test 
    public void criarAno2200QueNaoEhBissexto() { 
        assertFalse(new DataTerceiraEra(04, 05, 2200).ehBissexto()); 
    } 
     
    @Test 
    public void criarAno2015QueNaoEhBissexto() { 
        assertFalse(new DataTerceiraEra(04, 05, 2015).ehBissexto()); 
    } 
}
=======

public class DataTerceiraEraTest
{
    @Test
    public void criarAno3019QueNaoEhBissexto() {
        // Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 10, 3019);
        // Act
        boolean obtido = data.ehBissexto();
        // Assert
        assertFalse(obtido);
    }
    
    @Test
    public void criarAno2000QueEhBissexto() {
        // Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 1, 2000);
        // Act
        boolean obtido = data.ehBissexto();
        // Assert
        assertTrue(obtido);
    }
    
    @Test
    public void criarAno1900NaoEhBissexto() {
        assertFalse(new DataTerceiraEra(1,1,1900).ehBissexto());
    }
    
    @Test
    public void criarAno2012QueEhBissexto() {
        assertTrue(new DataTerceiraEra(04, 05, 2012).ehBissexto());
    }
    
    @Test
    public void criarAno2200QueNaoEhBissexto() {
        assertFalse(new DataTerceiraEra(04, 05, 2200).ehBissexto());
    }
    
    @Test
    public void criarAno2015QueNaoEhBissexto() {
        assertFalse(new DataTerceiraEra(04, 05, 2015).ehBissexto());
    }
}
>>>>>>> master
