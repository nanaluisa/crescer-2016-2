import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DataTerceiraEraTest
{
    @Test
    public void instanciandoDataAno2016(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(29,02,2016);
        //Act
        data.ehBissexto();
        //Assert
        assertEquals(true,data.ehBissexto());
    }
    
    @Test
    public void instanciandoDataAno2000(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(29,02,2000);
        //Act
        data.ehBissexto();
        //Assert
        assertEquals(true,data.ehBissexto());
    }
    
    @Test
    public void instanciandoDataAno3019(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(29,02,3019);
        //Act
        data.ehBissexto();
        //Assert
        assertEquals(false,data.ehBissexto());
    }
}
