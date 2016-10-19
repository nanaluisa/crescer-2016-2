------------ Exercícios SQL Base Crescer16 ----------------------------
--1) listar total de pedido feitos no mes de setembro de 2016 .   
select  count(IDPedido) as TotalPedidos 
from Pedido
where DataPedido between convert(datetime, '01/09/2016', 103) 
                     and convert(datetime, '30/09/2016', 103)+.99999;
/*-- outra forma:

declare @DataInicial datetime
		@DataFinal   datetime
set		@DataInicial = convert(datetime, '01/09/2016', 103) 
set		@DataFinal	 = convert(datetime, '30/09/2016', 103)+.99999; -- CUIDAR O CAMPO HORA!!

select  count(1) as TotalPedidos 
from Pedido
where DataPedido between @DataInicial and @DataFinal

*/

--2) Quais os produtos que utilizam o material de id=15836
--select * from ProdutoMaterial

select IDProduto, Nome as NomeProduto 
from Produto p
where  exists (select 1
               from  ProdutoMaterial pm
			   where  pm.IDProduto = p.IDProduto
			   and    pm.IDMaterial = 15836);
/*--outra forma 
select IDProdutoMaterial, IDProduto
from ProdutoMaterial pm
where pm.IDMaterial = 15836

-- create index IX_ProdutoMaterial_Material on ProdutoMaterial (IDMaterial);
*/

--3) Liste todos os clientes que tenham o LTDA no nome ou razao social. 

select IDCliente, Nome, RazaoSocial
from Cliente
where  Nome		   like '%LTDA%'
	or RazaoSocial like '%LTDA%';

/* 4) Crie (insira) um novo registro na tabela de Produto, com as seguintes informações:
Nome: Galocha Maragato
Preço de custo: 35.67
Preço de venda: 77.95
Situação: A*/

INSERT INTO Produto (Nome, PrecoCusto, PrecoVenda, Situacao ) 
    VALUES ('Galocha Maragato', '35.67', '77.95', 'A');

/* 5) Identifique e liste os produtos que não tiveram nenhum pedido, considere os relacionamentos no modelo de
dados, pois não há relacionamento direto entre Produto e Pedido (será preciso relacionar PedidoItem).
Obs.: o produto criado anteriormente deverá ser listado (apenas este)*/
select IDProduto, Nome
from Produto p
where not exists(Select 1 
				from PedidoItem item
				where p.IDProduto = item.IDProduto)  


/*--- com o NOT IN
select IDProduto, Nome
from Produto p
where IDProduto not in(Select IDProduto 
					  from PedidoItem item
					  );  
*/


--6)Identifique qual o estado (coluna UF da tabela Cidade) possuí o maior número de clientes (tabela Cliente), 
--liste também qual o Estado possuí o menor número de clientes.