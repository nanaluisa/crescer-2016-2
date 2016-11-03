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


        public ActionResult Cadastro()
        {
            ListagemOrigem();
            return View();

        }

        public ActionResult Salvar(CadastroModel model)
        {
            ListagemOrigem();

            if (ModelState.IsValid)
            {
                ViewBag.Mensagem = "Cadastro concluído com sucesso.";
                return View("Detalhe", model);
            }
            else
            {
                ModelState.AddModelError("", "Ocorreu algum erro! Verifique suas respostas!");
                return View("Cadastro");
            }
        }

        public ActionResult Sobre()
        {
            var sobre = new SobreModel()
            {
                NomeCompleto = "Anna Luísa de Oliveira da Silva.",
                DataNascimento = Convert.ToDateTime("17/03/1997"),
                Altura = 153,
                Filiacao = "Luís Fernando e Adelaide da Silva.",
                PaisDeOrigem = "Brasil.",
                CidadeNatal = "Sapiranga / RS",
                AreaDeFormacao = "Tecnologia da Informação.",
                Universidade = "Unisinos",
                Habilidades = "Comunicativa, criativa, amigável.",
                Gosta = "Comida caseira de minha mãe.",
                Desgosta = "Pão de queijo e marshmallow.",
                BebidaPredileta = "Chimarrão ",
                Frase = "'Live each day with a thankful heart.'",
                FalaDeVitoria = "Turn down for what?",
                Nickname = "Anninha",
                Mentor = "Jesus Cristo",
                Hobbies = "Escutar música, ler.",
                BandasFavoritas = "Casting Crowns, Third Day, Jeremy Camp, Planetshakers, MercyMe, Newsboys...",
                ObjetivoDaPage = "Pôr em prática o aprendizado que estou recebendo no Módulo 5, atráves do treinamento do Projeto Crescer realizado pelos profissionais da CWI Software."
            };

            return View(sobre);
        }


       

        private void ListagemOrigem()
        {
            //ViewBag.ListaPersonagens
            ViewData["Origem"] = new List<SelectListItem>()
            {
                new SelectListItem() { Value = "BR", Text = "Brasil" },
                new SelectListItem() { Value = "AR", Text = "Argentina" },
                new SelectListItem() { Value = "JP", Text = "Japão" },
                new SelectListItem() { Value = "US", Text = "Estados Unidos" }
                
            };
        }
    }
}



    //Controller
//class StreetFighterController