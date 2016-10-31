using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TerraMedia.Equipamentos; //abrindo a ligação entre as classes

namespace Personagens
{
    public abstract class Personagem
    {
        public Personagem(int vidaInicial)
        {
            this.Vida = vidaInicial; 
                //int[] numeros = { 1, 2, 3, 5 };
                // List <int> lista = new List
            this.Equipamentos = new List<IEquipamento>();
                
         }


        protected List<IEquipamento> Equipamentos { get; set; }

        public int Vida { get; private set; }

        private int ataque;
        public int Ataque
        {
            get
            {
                int bonusDoEquipamentos = 0;

                foreach (IEquipamento equipamento in this.Equipamentos)
                {
                    bonusDoEquipamentos += equipamento.BonusDeAtaque;
                }
                return this.ataque + bonusDoEquipamentos;



                {

                }
            }    
                
                
                protected set {
                this.ataque = value;
            }
        }

        public int Defesa { get; protected set; }

        public void AdicionarEquipamento(IEquipamento equipamento)
        {
            this.Equipamentos.Add(equipamento);
        }


        public void Atacar(Personagem personagem)
        {
            personagem.ReceberAtaque(this.Ataque);
        }

        protected virtual void ReceberAtaque(int ataque)
        {
            this.Vida -= ataque;
        }


    }
}
