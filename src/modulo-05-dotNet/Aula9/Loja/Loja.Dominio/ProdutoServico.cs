using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public class ProdutoServico
    {
        private IProdutoRepositorio produtoRepositorio;

        public ProdutoServico(IProdutoRepositorio produtoRepositorio)
        {
            this.produtoRepositorio = produtoRepositorio;
        }

        public void CadastrarProduto(Produto produto)
        {
            if (produto.Id == 0)
            {
                produtoRepositorio.CadastrarProduto(produto);
            }
            else
            {
                produtoRepositorio.EditarProduto(produto);
            }
        }


        /*
        - Home com listagem de produtos e link de edição
	                                 + exclusão é bônus
        - Cadastrar novo produto.
        */






    }
}
