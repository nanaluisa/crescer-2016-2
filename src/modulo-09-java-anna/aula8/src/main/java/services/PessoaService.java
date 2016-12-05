package services;

import br.com.cwi.crescer.aula8.Pessoa;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

/**
 *
 * @author anna.silva
 */
@Service
public class PessoaService {
      
    public List<Pessoa> list() {
        Pessoa p = new Pessoa();
        p.setNome("Carlos H. Nonnemacher");
        p.setNascimento(new Date());
        return Stream.of(p).collect(Collectors.toList());
    }
    
}
