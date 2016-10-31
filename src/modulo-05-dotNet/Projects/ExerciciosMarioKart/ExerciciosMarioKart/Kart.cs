using ExerciciosMarioKart.Equipamentos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExerciciosMarioKart
{
    public class Kart
    {
        public Kart(Corredor Corredor)
        {
            this.Corredor = Corredor;
            this.Equipamentos = new List<IEquipamentos>();
        }



        protected List<IEquipamentos> Equipamentos { get; set; }
        public int Velocidade { get; }
        Corredor Corredor;

    }


   /* Kart

Corredor(obrigatório)
Equipamentos(lista de equipamentos)
Velocidade(somente leitura)
A velocidade de um kart é a seguinte soma:
3 + a soma dos bônus de todos os equipamentos + bônus de habilidade do Corredor(Noob: 3, Mediano: 5, Profissional: 6 + quantidade de equipamentos no kart)
*/


}
