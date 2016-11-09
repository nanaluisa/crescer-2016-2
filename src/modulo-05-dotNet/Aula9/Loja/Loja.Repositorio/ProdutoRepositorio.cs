using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Repositorio
{
    public class ProdutoRepositorio : IProdutoRepositorio
        {
            public Produto BuscarPorNome(string nome)
            {
                using (var context = new ContextoDeDados())
                {
                    return context.Produto.FirstOrDefault(u => u.Nome.Equals(nome));
                }
            }
        }


}

