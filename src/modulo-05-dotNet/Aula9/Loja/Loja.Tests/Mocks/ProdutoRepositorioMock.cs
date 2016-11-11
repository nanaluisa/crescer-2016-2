using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Tests.Mocks
{
    class ProdutoRepositorioMock : IProdutoRepositorio
    {
        //variável e construtor:
        private IList<Produto> produtos;

        public ProdutoRepositorioMock()
        {
            this.produtos = new List<Produto>();
            this.produtos.Add(new Produto()
            {
                Id = 1,
                Nome = "Monitor",
                Valor = 255
            });
        }
        public void CadastrarProduto(Produto produto)
        {
            throw new NotImplementedException();
        }

        public void EditarProduto(Produto produto)
        {
            throw new NotImplementedException();
        }
    }
}
