using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Loja.Web.Models
{
    public  class ProdutoModel
    {





            public ProdutoModel ConverterParaViewModel(this Produto produto)
            {
                return new ProdutoModel()
                {
                    Nome = produto.Nome
                };
            }
        


        


    }
}