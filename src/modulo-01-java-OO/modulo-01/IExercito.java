import java.util.ArrayList;
public interface IExercito{
    Elfo[] getBatalhao();
    void alistar(Elfo elfo);
    Elfo buscar(String nome);
    ArrayList<Elfo> buscar(Status status);
}
