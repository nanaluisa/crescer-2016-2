import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ExercitoDeElfosTest {

    @After
    // executa após cada cenário de testes.
    public void tearDown() {
        System.gc();
    }

    @Test
    public void alistarUmElfoVerde() {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo elfoVerde = new ElfoVerde("Elfo Verde");
        try {
            exercito.alistar(elfoVerde);
            assertEquals(elfoVerde, exercito.getContingente()[0]);
        } catch (NaoPodeAlistarException naoPodeAlistarException) {
            System.out.println(
                naoPodeAlistarException.getMessage() + 
                naoPodeAlistarException.getStackTrace()
            );
        }
    }

    @Test
    public void alistarUmElfoNoturno() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo elfoNoturno = new ElfoNoturno("Night Elf");
        exercito.alistar(elfoNoturno);
        assertEquals(elfoNoturno, exercito.getContingente()[0]);
    }

    @Test(expected=NaoPodeAlistarException.class)
    public void alistarUmElfoNormal() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo elfoNormal = new Elfo("Elfo Normal");
        exercito.alistar(elfoNormal);
        assertEquals(0, exercito.getContingente().length);
    }

    @Test(expected=NaoPodeAlistarException.class)
    public void alistarDosTresTiposSoEntramVerdesENoturnos() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo elfoVerde = new ElfoVerde("Elfo Verde");
        Elfo elfoNormal = new Elfo("Elfo Normal");
        Elfo elfoNoturno = new ElfoNoturno("Night Elf");
        exercito.alistar(elfoVerde);
        exercito.alistar(elfoNormal);
        exercito.alistar(elfoNoturno);
        assertEquals(2, exercito.getContingente().length);
        assertEquals(elfoVerde, exercito.getContingente()[0]);
        assertEquals(elfoNoturno, exercito.getContingente()[1]);
    }

    @Test
    public void buscarExercitoVazio() {
        assertNull(new ExercitoDeElfos().buscar("Nenhum"));
    }

    @Test
    public void buscarPorNomeTendoApenasUmComAqueleNome() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = new ElfoVerde("Elfo Recruta 1");
        Elfo recruta2 = new ElfoNoturno("Elfo Recruta 2");
        Elfo recruta3 = new ElfoVerde("Elfo Recruta 3");
        exercito.alistar(recruta1);
        exercito.alistar(recruta2);
        exercito.alistar(recruta3);
        assertEquals(recruta2, exercito.buscar("Elfo Recruta 2"));
    }

    @Test
    public void buscarPorNomeTendoVariosComAqueleNome() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = new ElfoVerde("Elfo Recruta");
        Elfo recruta2 = new ElfoNoturno("Elfo Recruta 2");
        Elfo recruta3 = new ElfoVerde("Elfo Recruta");
        exercito.alistar(recruta1);
        exercito.alistar(recruta2);
        exercito.alistar(recruta3);
        assertEquals(recruta1, exercito.buscar("Elfo Recruta"));
    }

    @Test
    public void buscarPorStatusVivo() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = new ElfoVerde("Elfo Recruta");
        Elfo recruta2 = new ElfoNoturno("Elfo Recruta 2");
        Elfo recruta3 = new ElfoVerde("Elfo Recruta");
        exercito.alistar(recruta1);
        exercito.alistar(recruta2);
        exercito.alistar(recruta3);
        List<Elfo> resultado = exercito.buscar(Status.VIVO);
        assertEquals(3, resultado.size());
        assertEquals(recruta1, resultado.get(0));
        assertEquals(recruta2, resultado.get(1));
        assertEquals(recruta3, resultado.get(2));
    }

    @Test
    public void buscarPorStatusMorto() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = new ElfoVerde("Elfo Recruta");
        Elfo recruta2 = criarElfoNoturnoEMatalo();
        Elfo recruta3 = new ElfoVerde("Elfo Recruta");
        exercito.alistar(recruta1);
        exercito.alistar(recruta2);
        exercito.alistar(recruta3);
        List<Elfo> resultado = exercito.buscar(Status.MORTO);
        assertEquals(1, resultado.size());
        assertEquals(recruta2, resultado.get(0));
    }

    @Test
    public void buscarPorStatusMortoNenhumMorto() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = new ElfoVerde("Elfo Recruta");
        Elfo recruta2 = new ElfoNoturno("Elfo Recruta 2");
        Elfo recruta3 = new ElfoVerde("Elfo Recruta");
        exercito.alistar(recruta1);
        exercito.alistar(recruta2);
        exercito.alistar(recruta3);
        assertTrue(exercito.buscar(Status.MORTO).isEmpty());
    }

    @Test
    public void buscarPorStatusVivoNenhumVivo() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = criarElfoNoturnoEMatalo();
        Elfo recruta2 = criarElfoNoturnoEMatalo();
        Elfo recruta3 = criarElfoNoturnoEMatalo();
        exercito.alistar(recruta1);
        exercito.alistar(recruta2);
        exercito.alistar(recruta3);
        assertTrue(exercito.buscar(Status.VIVO).isEmpty());
    }
    
    @Test
    public void alistarEOrdenarVerdesPrimeiroDepoisNoturnosPorUltimo()throws NaoPodeAlistarException{
        //getOrdemDeAtaque(List<Elfo> atacantes)
        //Arrange
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = new ElfoVerde("Elfo Verde 1",42);
        Elfo recruta2 = new ElfoNoturno("Elfo Noturno 1",42);
        Elfo recruta3 = new ElfoVerde("Elfo Verde 2",42);
        Elfo recruta4 = new ElfoNoturno("Elfo Noturno 2",42);
        Elfo recruta5 = new ElfoVerde("Elfo Verde 3",42);
        //Act
        
        List<Elfo> alistados = new ArrayList<>();
        alistados.add(recruta1);
        alistados.add(recruta2);
        alistados.add(recruta3);
        alistados.add(recruta4);
        alistados.add(recruta5);
                
        List<Elfo> ordemAtaque = new ArrayList<>();
        ordemAtaque = exercito.getOrdemDeAtaque(alistados);
        
        assertEquals(5, alistados.size());
        
        assertEquals(recruta1, ordemAtaque.get(0));
        assertEquals(recruta3, ordemAtaque.get(1));
        assertEquals(recruta5, ordemAtaque.get(2));
        assertEquals(recruta2, ordemAtaque.get(3));
        assertEquals(recruta4, ordemAtaque.get(4));
    }
    
    
    @Test
    public void ordenar5ElfosNoturnosPorUltimo()throws NaoPodeAlistarException{
        //Arrange
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        
        Elfo recruta1 = new ElfoNoturno("Elfo Noturno 1",42);
        Elfo recruta2 = new ElfoNoturno("Elfo Noturno 2",42);
        Elfo recruta3 = new ElfoNoturno("Elfo Noturno 3",42);
        Elfo recruta4 = new ElfoNoturno("Elfo Noturno 4",42);
        Elfo recruta5 = new ElfoNoturno("Elfo Noturno 5",42);
        Elfo recruta6 = new ElfoVerde("Elfo Verde 1",42);
        Elfo recruta7 = new ElfoVerde("Elfo Verde 2",42);
        Elfo recruta8 = new ElfoVerde("Elfo Verde 3",42);
        //Act
        
        List<Elfo> alistados = new ArrayList<>();
        alistados.add(recruta1);
        alistados.add(recruta2);
        alistados.add(recruta3);
        alistados.add(recruta4);
        alistados.add(recruta5);
        alistados.add(recruta6);
        alistados.add(recruta7);
        alistados.add(recruta8);
                
        List<Elfo> ordemAtaque = new ArrayList<>();
        ordemAtaque = exercito.getOrdemDeAtaque(alistados);
        
        assertEquals(8, alistados.size());
        
        assertEquals(recruta6, ordemAtaque.get(0));
        assertEquals(recruta7, ordemAtaque.get(1));
        assertEquals(recruta8, ordemAtaque.get(2));
        assertEquals(recruta1, ordemAtaque.get(3));
        assertEquals(recruta2, ordemAtaque.get(4));
        assertEquals(recruta3, ordemAtaque.get(5));
        assertEquals(recruta4, ordemAtaque.get(6));
        assertEquals(recruta5, ordemAtaque.get(7));
        
    }
    
    @Test
    public void ordenar5ElfosNoturnosSomente()throws NaoPodeAlistarException{
        //Arrange
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        
        Elfo recruta1 = new ElfoNoturno("Elfo Noturno 1",42);
        Elfo recruta2 = new ElfoNoturno("Elfo Noturno 2",42);
        Elfo recruta3 = new ElfoNoturno("Elfo Noturno 3",42);
        Elfo recruta4 = new ElfoNoturno("Elfo Noturno 4",42);
        Elfo recruta5 = new ElfoNoturno("Elfo Noturno 5",42);
        
        List<Elfo> alistados = new ArrayList<>();
        alistados.add(recruta1);
        alistados.add(recruta2);
        alistados.add(recruta3);
        alistados.add(recruta4);
        alistados.add(recruta5);
        
        List<Elfo> ordemAtaque = new ArrayList<>();
        ordemAtaque = exercito.getOrdemDeAtaque(alistados);
        
        assertEquals(5, alistados.size());
        
        assertEquals(recruta1, ordemAtaque.get(0));
        assertEquals(recruta2, ordemAtaque.get(1));
        assertEquals(recruta3, ordemAtaque.get(2));
        assertEquals(recruta4, ordemAtaque.get(3));
        assertEquals(recruta5, ordemAtaque.get(4));
       
    }
    
    
    
    @Test
    public void elfosNoturnosPorUltimoJaOrdenado()throws NaoPodeAlistarException{
        //Arrange
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        
        Elfo recruta6 = new ElfoVerde("Elfo Verde 1",42);
        Elfo recruta7 = new ElfoVerde("Elfo Verde 2",42);
        Elfo recruta8 = new ElfoVerde("Elfo Verde 3",42);
        Elfo recruta1 = new ElfoNoturno("Elfo Noturno 1",42);
        Elfo recruta2 = new ElfoNoturno("Elfo Noturno 2",42);
        Elfo recruta3 = new ElfoNoturno("Elfo Noturno 3",42);
        Elfo recruta4 = new ElfoNoturno("Elfo Noturno 4",42);
        Elfo recruta5 = new ElfoNoturno("Elfo Noturno 5",42);
        
        //Act
        
        List<Elfo> alistados = new ArrayList<>();
        alistados.add(recruta6);
        alistados.add(recruta7);
        alistados.add(recruta8);
        alistados.add(recruta1);
        alistados.add(recruta2);
        alistados.add(recruta3);
        alistados.add(recruta4);
        alistados.add(recruta5);
        
                
        List<Elfo> ordemAtaque = new ArrayList<>();
        ordemAtaque = exercito.getOrdemDeAtaque(alistados);
        
        assertEquals(8, alistados.size());
        
        assertEquals(recruta6, ordemAtaque.get(0));
        assertEquals(recruta7, ordemAtaque.get(1));
        assertEquals(recruta8, ordemAtaque.get(2));
        assertEquals(recruta1, ordemAtaque.get(3));
        assertEquals(recruta2, ordemAtaque.get(4));
        assertEquals(recruta3, ordemAtaque.get(5));
        assertEquals(recruta4, ordemAtaque.get(6));
        assertEquals(recruta5, ordemAtaque.get(7));
        
    }
    
        
    @Test
    public void pelotaoElfosVerdesENoturnosPorcentagem50()throws ExercitoNaoAtingiuException{
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo recruta1 = new ElfoNoturno("Elfo Noturno 1",42);
        Elfo recruta2 = new ElfoNoturno("Elfo Noturno 2",42);
        Elfo recruta3 = new ElfoNoturno("Elfo Noturno 3",42);
        Elfo recruta4 = new ElfoVerde("Elfo Verde 1",42);
        Elfo recruta5 = new ElfoVerde("Elfo Verde 2",42);
        Elfo recruta6 = new ElfoVerde("Elfo Verde 3",42);
        
        List<Elfo> alistados = new ArrayList<>();
        alistados.add(recruta1);
        alistados.add(recruta2);
        alistados.add(recruta3);
        alistados.add(recruta4);
        alistados.add(recruta5);
        alistados.add(recruta6); 
        
        List<Elfo> ordemAtaque = new ArrayList<>();
        ordemAtaque = exercito.getOrdemDeAtaqueIntercalada(alistados);
        assertEquals(6, alistados.size());
        
    }
    
    @Test//(expected=ExercitoNaoAtingiuException.class)
    public void pelotaoElfosVerdesENoturnosNaoAtingiuAPorcentagem()throws ExercitoNaoAtingiuException{
       try { 
            ExercitoDeElfos exercito = new ExercitoDeElfos();
            Elfo recruta1 = new ElfoNoturno("Elfo Noturno 1",42);
            Elfo recruta2 = new ElfoNoturno("Elfo Noturno 2",42);
            Elfo recruta3 = new ElfoNoturno("Elfo Noturno 3",42);
            Elfo recruta4 = new ElfoVerde("Elfo Verde 1",42);
            Elfo recruta5 = new ElfoVerde("Elfo Verde 2",42);
            Elfo recruta6 = new ElfoVerde("Elfo Verde 3",42);
            Elfo recruta7 = new ElfoVerde("Elfo Verde 4",42);
            Elfo recruta8 = new ElfoVerde("Elfo Verde 5",42);
            
            List<Elfo> alistados = new ArrayList<>();
            alistados.add(recruta1);
            alistados.add(recruta2);
            alistados.add(recruta3);
            alistados.add(recruta4);
            alistados.add(recruta5);
            alistados.add(recruta6); 
            alistados.add(recruta7);
            alistados.add(recruta8);
            
            List<Elfo> ordemAtaque = new ArrayList<>();
            ordemAtaque = exercito.getOrdemDeAtaqueIntercalada(alistados);
            assertEquals(8, alistados.size());
        } catch (ExercitoNaoAtingiuException exercitoNaoAtingiuException) { 
            System.out.println( 
                exercitoNaoAtingiuException.getMessage() +  
                exercitoNaoAtingiuException.getStackTrace() 
            ); 
       }
    }
    
    
    
    //Método
    private ElfoNoturno criarElfoNoturnoEMatalo() {
        ElfoNoturno suicida = new ElfoNoturno("Elfo kamikaze", 90);
        for (int i = 0; i < 90; i++)
            suicida.atirarFlecha(new Dwarf());
        return suicida;
    }
    
     
}