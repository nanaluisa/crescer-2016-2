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
    
    //Merge:
    @Test
    public void adicionarItemNoInventario() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.adicionarItem(espadaZ);
        assertTrue(inventario.getItens().contains(espadaZ));
    }

    @Test
    public void inventarioSemAdicionarItem() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        assertFalse(inventario.getItens().contains(espadaZ));
    }

    @Test
    public void adicionarDoisItensNoInventario() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item botasDeFerro = new Item("Iron Boots", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(botasDeFerro);
        assertTrue(inventario.getItens().contains(espadaZ));
        assertTrue(inventario.getItens().contains(botasDeFerro));
    }

    @Test
    public void adicionarCincoItensNoInventario() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item botasDeFerro = new Item("Iron Boots", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        inventario.adicionarItem(botasDeFerro);
        assertTrue(inventario.getItens().contains(espadaZ));
        assertTrue(inventario.getItens().contains(botasDeFerro));
        assertEquals(5, inventario.getItens().size());
    }

    @Test
    public void adicionarItemNoInventarioEDepoisRemovelo() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.adicionarItem(espadaZ);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItens().contains(espadaZ));
    }

    @Test
    public void adicionarDoisItensNoInventarioERemoverApenasUm() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        Item bastaoMagico = new Item("Bastão Mágico", 1);
        inventario.adicionarItem(espadaZ);
        inventario.adicionarItem(bastaoMagico);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItens().contains(espadaZ));
        assertTrue(inventario.getItens().contains(bastaoMagico));
    }

    @Test
    public void removerItemSemAdicionaloAntes() {
        Inventario inventario = new Inventario();
        Item espadaZ = new Item("Espada Z", 1);
        inventario.removerItem(espadaZ);
        assertFalse(inventario.getItens().contains(espadaZ));
    }

    @Test
    public void getDescricoesItensComVariosItens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Adaga", 14));
        inventario.adicionarItem(new Item("Escudo", 2));
        inventario.adicionarItem(new Item("Bracelete", 56));
        assertEquals("Adaga,Escudo,Bracelete", inventario.getDescricoesItens());
    }

    @Test
    public void getDescricoesItensComApenasUmItem() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Bracelete", 56));
        assertEquals("Bracelete", inventario.getDescricoesItens());
    }

    @Test
    public void getDescricoesItensSemItens() {
        Inventario inventario = new Inventario();
        assertEquals("", inventario.getDescricoesItens());
    }

    @Test
    public void aumentar1000UnidadesDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(1000);
        assertEquals(1002, inventario.getItens().get(0).getQuantidade());
        assertEquals(1045, inventario.getItens().get(1).getQuantidade());
        assertEquals(1003, inventario.getItens().get(2).getQuantidade());
    }
    
    @Test
    public void aumentar1UnidadeDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(1);
        assertEquals(3, inventario.getItens().get(0).getQuantidade());
        assertEquals(46, inventario.getItens().get(1).getQuantidade());
        assertEquals(4, inventario.getItens().get(2).getQuantidade());
    }
    
    @Test
    public void aumentar0UnidadeDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(0);
        assertEquals(2, inventario.getItens().get(0).getQuantidade());
        assertEquals(45, inventario.getItens().get(1).getQuantidade());
        assertEquals(3, inventario.getItens().get(2).getQuantidade());
    }
    
    @Test
    public void aumentarUnidadeSemItens() {
        Inventario inventario = new Inventario();
        inventario.aumentarUnidadesDosItens(1000);
        assertEquals(0, inventario.getItens().size());
    }

    @Test
    public void ordenarArrayDoInventarioPorQuantidades(){
        criarInventarioCom3Itens();
    }
    
    private Inventario criarInventarioCom3Itens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada de aço", 2));
        inventario.adicionarItem(new Item("Poção polissuco", 45));
        inventario.adicionarItem(new Item("Lucky egg", 3));
        return inventario;
    }
}

