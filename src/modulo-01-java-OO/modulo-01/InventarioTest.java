import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class InventarioTest
{
    @Test
    public void adicionarSeisItensNoArray(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada",3));
        inventario.adicionarItem(new Item("Flechas",5));
        inventario.adicionarItem(new Item("Arco",1));
        inventario.adicionarItem(new Item("Machado",2));
        inventario.adicionarItem(new Item("Escudo",4));
        inventario.adicionarItem(new Item("Poção",10));
        
        assertEquals(6,inventario.getItemAtual());
    }
    
    @Test
    public void adicionarSeisItensERemoverDoisNoArray(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada",3));
        inventario.adicionarItem(new Item("Flechas",5));
        inventario.adicionarItem(new Item("Arco",1));
        inventario.adicionarItem(new Item("Machado",2));
        inventario.adicionarItem(new Item("Escudo",4));
        inventario.adicionarItem(new Item("Poção",10));
        
        inventario.removerItem(new Item("Flechas",5));
        inventario.removerItem(new Item("Arco",1));
        
        assertEquals(4,inventario.getItemAtual());
    }
    
    
    @Test
    public void adicionarUmItemERemoverNoArray(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada",3));
        
        inventario.removerItem(new Item("Espada",3));
        
        assertEquals(0,inventario.getItemAtual());
    }
    /*
    @Test
    public void imprimirDescricoes(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada",3));
        inventario.adicionarItem(new Item("Flechas",5));
        inventario.adicionarItem(new Item("Arco",1));
        inventario.adicionarItem(new Item("Machado",2));
        inventario.adicionarItem(new Item("Escudo",4));
        inventario.adicionarItem(new Item("Poção",10));
        
        // System.out.print(inventario.getDescricoesItens());
        
        
        //assertEquals(4,inventario.getItemAtual());
    
    
    }*/
    
    
}
