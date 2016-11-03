using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class CadastroModel
    {
        [DisplayName("URL da Imagem")]
        public string Imagem { get; set; }

        [Required]
        public string Nome { get; set; }

        [DisplayName("Data de Nascimento")]
        [Required]
        public DateTime DataNascimento { get; set; }

        [Required]
        public int Altura { get; set; }

        [Required]
        public decimal Peso { get; set; }

        [Required]
        public int Origem { get; set; }

        [DisplayName("Golpes Especiais")]
        [Required]
        public string GolpesEspeciais { get; set; }

        [DisplayName("Personagem Oculto?")]
        public bool Oculto { get; set; }

    }
}