------------ Exerc�cios SQL Base Crescer16 ----------------------------
--1) listar total de pedido feitos no mes de setembro de 2016 .   
--OK
select  count(IDPedido) as TotalPedidos 
from Pedido
where DataPedido between convert(datetime, '01/09/2016', 103) 
                     and convert(datetime, '30/09/2016', 103)+.99999;


declare @DataInicial datetime
		@DataFinal   datetime
set		@DataInicial = convert(datetime, '01/09/2016', 103) 
set		@DataFinal	 = convert(datetime, '30/09/2016', 103)+.99999; -- CUIDAR O CAMPO HORA!!
/*-- outra forma:
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
--outra forma 
select IDProdutoMaterial, IDProduto
from ProdutoMaterial pm
where pm.IDMaterial = 15836

-- create index IX_ProdutoMaterial_Material on ProdutoMaterial (IDMaterial);



--3) Liste todos os clientes que tenham o LTDA no nome ou razao social. 

select IDCliente, Nome, RazaoSocial
from Cliente
where  Nome		   like '%LTDA%'
	or RazaoSocial like '%LTDA%';

/* 4) Crie (insira) um novo registro na tabela de Produto, com as seguintes informa��es:
Nome: Galocha Maragato
Pre�o de custo: 35.67
Pre�o de venda: 77.95
Situa��o: A*/

INSERT INTO Produto (Nome, PrecoCusto, PrecoVenda, Situacao ) 
    VALUES ('Galocha Maragato', '35.67', '77.95', 'A');

-- 5)
select IDProduto, Nome
from Produto p
where not exists(Select 1 
				from PedidoItem item
				where p.IDProduto = item.IDProduto)  


--- com o not in
select IDProduto, Nome
from Produto p
where IDProduto not in(Select IDProduto 
					  from PedidoItem item
					  );  



--6)
