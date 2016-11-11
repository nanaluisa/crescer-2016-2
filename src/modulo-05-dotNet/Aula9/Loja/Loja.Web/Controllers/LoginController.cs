using Loja.Dominio;
using Loja.Infraestrutura;
using Loja.Repositorio;
using Loja.Web.Servicos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Loja.Web.Controllers
{
    public class LoginController : Controller
    {
        // GET: Login
        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Entrar(string email, string senha)
        {
            UsuarioServico usuarioServico = ServicoDeDependencias.MontarUsuarioServico();

            Usuario usuario = usuarioServico.BuscarPorAutenticacao(email, senha);
            /*
            if (ModelState.IsValid)
            {
                ViewBag.Mensagem = "Cadastro concluído com sucesso.";
                return View("ListaDeProdutos", model);
            }
            else
            {
                ModelState.AddModelError("", "Ocorreu algum erro! Verifique suas respostas!");
                return View("Cadastro");
            }*/
            return null;
         }
    }
}