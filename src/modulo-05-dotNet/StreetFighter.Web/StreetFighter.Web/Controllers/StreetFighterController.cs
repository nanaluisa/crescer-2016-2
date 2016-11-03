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
            var fichaBlanka = new CadastroModel()
            {
                Imagem = "data:image/jpeg;base64,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",
                Nome = "Blanka",
                DataNascimento = Convert.ToDateTime("12/02/1966"),
                Altura = 192,
                Peso = 96,
                Origem = "Brasil",
                GolpesEspeciais = "Electric Thunder, Rolling Attack"
            };

            return View(fichaBlanka);
        }

        


        public ActionResult Cadastro()
        {
            ListagemOrigem();
            return View();

        }


        public ActionResult Listagem()
        {
            return View();
        }


        public ActionResult Salvar(FichaTecnicaModel model)
        {
            ListagemOrigem();

            if (ModelState.IsValid)
            {
                ViewBag.Mensagem = "Cadastro concluído com sucesso.";
                return View("FichaTecnica", model);
            }
            else
            {
                ModelState.AddModelError("", "Ocorreu algum erro! Verifique suas respostas!");
                return View("CadastroModel");
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
                new SelectListItem() { Value = "MP", Text = "Morro da Pedra" },
                new SelectListItem() { Value = "US", Text = "Estados Unidos" }
                
            };
        }
    }//Controller
}//class StreetFighterController