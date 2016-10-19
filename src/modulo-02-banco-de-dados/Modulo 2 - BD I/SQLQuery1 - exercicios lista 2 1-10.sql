------------ Exercícios SQL Base Crescer16 ----------------------------
--1) listar total de pedido feitos no mes de setembro de 2016 .   
--OK
select  count(IDPedido) as TotalPedidos 
from Pedido
where DataPedido between convert(datetime, '01/09/2016', 103) 
                     and convert(datetime, '30/09/2016', 103);


--2) Quais os produtos que utilizam o materia de id=15836
select p.Nome, pm.IDMaterial, m.FK_ProdutoMaterial_Material 
from Produto p
inner join
group by IDMaterial 
having IDMaterial = 15836




ID = 15836
from Produto
where 

Select A.<coluna>, D.<coluna> 
From <tabelaPrincipal> A 
Inner Join <tabelaSecundaria> D on A.<IDTabelaD> = D.<IDTabelaD>
 Where <condicao> 
 Group by <coluna>
  Having <condicao> Order by <coluna>

  /*
  EXEMPLO
  select a.cod_bensp,a.numero,b.tipo,c.categoria,a.descricao,a.endereco,a.marca,a.num_serie,a.ano,a.placa,
a.km,a.data_compra,a.valor,a.modelo from bens_patrimoniais a
inner join tipo_bens b on a.tipo_bens = b.cod_bensT
inner join categoria_bens c on a.cat_bens = c.cod_bens;

  */