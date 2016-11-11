using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExerciciosMarioKart
{
    public class Corredor
    {
        public Corredor(string nome, NivelHabilidade nivelHabilidade)
        {
            this.Nome = nome;
            this.NivelHabilidade = nivelHabilidade;
        }

        
        public string Nome { get; private set; }

        public NivelHabilidade NivelHabilidade { get; private set}
        //Nível de habilidade(Noob, Mediano, Profissional)
    }
}
