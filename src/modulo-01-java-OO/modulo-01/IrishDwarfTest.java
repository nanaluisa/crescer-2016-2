import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class IrishDwarfTest{
    @Test 
    public void aumentar6000UnidadesNoItem() { 
        IrishDwarf irishDwarf = new IrishDwarf("Irish Muito Sortudo", new DataTerceiraEra(1, 1, 2016)); 
        irishDwarf.perderVida(); 
        irishDwarf.perderVida(); 
        irishDwarf.perderVida(); 
        irishDwarf.perderVida();
        irishDwarf.adicionarItem(new Item("Chapeú", 3)); 
        irishDwarf.tentarSorte(); 
        ArrayList<Item> itens = irishDwarf.getInventario().getItens(); 
        assertEquals(6003, itens.get(0).getQuantidade()); 
    } 
    
    @Test 
    public void aumentar15005UnidadesNoItem() { 
        IrishDwarf irishDwarf = new IrishDwarf("Irish Muito Sortudo", new DataTerceiraEra(1, 1, 2016)); 
        irishDwarf.perderVida(); 
        irishDwarf.perderVida(); 
        irishDwarf.perderVida(); 
        irishDwarf.perderVida();
        irishDwarf.adicionarItem(new Item("Poção Mágica", 5)); 
        irishDwarf.tentarSorte(); 
        ArrayList<Item> itens = irishDwarf.getInventario().getItens(); 
        assertEquals(120005, itens.get(0).getQuantidade()); 
    } 
}
