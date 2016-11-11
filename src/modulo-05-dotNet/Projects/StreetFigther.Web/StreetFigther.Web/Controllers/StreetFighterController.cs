using StreetFighter.Web.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFighter.Web.Controllers
{
    public class StreetFighterController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult FichaTecnica()
        {
            var blanka = new FichaTecnicaModel()
            {
                Nome = "Blanka",
                PrimeiraAparicao = "Street Fighter II The World Warrior (1991)",
                Nascimento = new DateTime("12/02/1966"),
                Altura = 192,
                Peso = 96,
                Medidas = "B198, C120, Q172",
                TipoSanguineo = "B",
                HabilidadesEspeciais = "Caçar, Eletricidade",
                Gosta = "Frutas tropicais, Pirarucu, Sua mãe",
                Desgosta = "Army ants (espécie de formiga)",
                EstiloDeLuta = "Luta Selvagem autodidata (Army Ants) / Capoeira",
                Origem = "Brasil (lugar de nascença é provável como sendo Tailândia)",
                FalaDaVitoria = "Ver você em ação é uma piada!",
                SFF2Nickname = "A selvagem criança da natureza",
                SFA3Nickname = "A animal pessoa amazônica",
                SF4Nickname = "Guerreiro da selva",
                SFA3Stage = "Ramificação do Rio Madeira - pantano, Brasil (ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?)",
                SF2Stage = "Bacia do rio Amazonas (Brasil)",
                GolpesEspeciaisFamosos = "Electric Thunder, Rolling Attack"
            };
            return View(blanka);
        }

        public ActionResult Sobre()
        {
            var sobre = new SobreModel()
            {
                NomeCompleto = "Anna Luísa de Oliveira da Silva",
                DataNascimento = DateTime.(1997,03,17),
                Altura = 153,
                Filiacao = "Luís Fernando e Adelaide da Silva",
                PaisDeOrigem = "Brasil",
                CidadeNatal = "Sapiranga / RS",
                AreaDeFormacao = "Tecnologia da Informação",
                Universidade = "Unisinos",
                Habilidades = "Comunicativa, criativa, amigável",
                Gosta = "Comida caseira de minha mãe",
                Desgosta = "Pão de queijo e marshmallow",
                BebidaPredileta = "Chimarrão",
                Frase = "'Live each day with a thankful heart'",
                FalaDeVitoria = "'Turn down for what?' B)  hahaha",
                Nickname = "'Anninha'",
                Mentor = "Jesus Cristo",
                Hobbies = "Escutar música, ler",
                BandasFavoritas = "Casting Crowns, Third Day, Jeremy Camp, Planetshakers, MercyMe, Newsboys...",
                ObjetivoDestaPage = "Pôr em prática o aprendizado que estou recebendo no Módulo 5, atrávez do treinamento realizado pelos proficionais da CWI Software."
            };
            return View(sobre);
        }

    }//class
}//namespace