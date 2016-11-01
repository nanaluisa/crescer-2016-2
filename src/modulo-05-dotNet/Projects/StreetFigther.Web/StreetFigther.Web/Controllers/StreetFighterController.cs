using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFigther.Web.Controllers
{
    public class StreetFighterController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        /*
            public class MoviesController : Controller
{
    private MovieDBContext db = new MovieDBContext();

    // GET: /Movies/
    public ActionResult Index()
    {
        return View(db.Movies.ToList());
        
    } 

            ------------- DATE TIME ----------------
                        string dateString = "5/1/2008 8:30:52 AM";
                        DateTime date1 = DateTime.Parse(dateString, 
                        System.Globalization.CultureInfo.InvariantCulture); 




        */

        public ActionResult FichaTecnica()
        {
            var blanka = new FichaTecnicaModel()
            {
                Nome = "Blanka";
                PrimeiraAparicao = "Street Fighter II The World Warrior (1991)";
                Nascimento = new DateTime("12/02/1966");
                Altura = 192;
                Peso = 96;
                Medidas = "B198, C120, Q172";
                TipoSanguineo = "B";
                HabilidadesEspeciais = "Caçar, Eletricidade";
                Gosta = "Frutas tropicais, Pirarucu, Sua mãe";
                Desgosta = "Army ants (espécie de formiga)";
                EstiloDeLuta = "Luta Selvagem autodidata (Army Ants) / Capoeira";
                Origem = "Brasil (lugar de nascença é provável como sendo Tailândia)";
                FalaDaVitoria = "Ver você em ação é uma piada!";
                SFF2Nickname = "A selvagem criança da natureza";
                SFA3Nickname = "A animal pessoa amazônica";
                SF4Nickname = "Guerreiro da selva";
                SFA3Stage = "Ramificação do Rio Madeira - pantano, Brasil (ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?)";
                SF2Stage = "Bacia do rio Amazonas (Brasil)";
                GolpesEspeciaisFamosos = "Electric Thunder, Rolling Attack";
            };
            return View(blanka);
        }
    }


        public ActionResult Sobre()
        {

    var sobreModel = new SobreModel()
    {
        sobreModel.NomeCompleto = "Anna Luísa de Oliveira da Silva";
    sobreModel.DataNascimento = DateTime.("17/03/1997");
    sobreModel.Altura = 153;
    sobreModel.Filiacao = "Luís Fernando e Adelaide da Silva";
    sobreModel.PaisDeOrigem = "Brasil";
    sobreModel.CidadeNatal = "Sapiranga / RS";
    sobreModel.AreaDeFormacao = "Tecnologia da Informação";
    sobreModel.Universidade = "Unisinos";
    sobreModel.Habilidades = "Comunicativa, criativa, amigável";
    sobreModel.Gosta = "Comida caseira de minha mãe";
    sobreModel.Desgosta = "Pão de queijo e marshmallow";
    sobreModel.BebidaPredileta = "Chimarrão";
    sobreModel.Frase = "'Live each day with a thankful heart'";
    sobreModel.FalaDeVitoria = "'Turn down for what?' B)  hahaha";
    sobreModel.Nickname = "'Anninha'";
    sobreModel.Mentor = "Jesus Cristo";
    sobreModel.Hobbies = "Escutar música, ler";
    sobreModel.BandasFavoritas = "Casting Crowns, Third Day, Jeremy Camp, Planetshakers, MercyMe, Newsboys...";
    sobreModel.ObjetivoDestaPage = "Pôr em prática o aprendizado que estou recebendo no Módulo 5, atrávez do treinamento realizado pelos proficionais da CWI Software.";
};
            return View(sobre);
        }
}