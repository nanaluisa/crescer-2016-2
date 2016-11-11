------------ Exercícios SQL Base Crescer16 ----------------------------
--1) listar total de pedido feitos no mes de setembro de 2016 .   
--OK
select  count(IDPedido) as TotalPedidos 
from Pedido
where DataPedido between convert(datetime, '01/09/2016', 103) 
                     and convert(datetime, '30/09/2016', 103);


--2) Quais os produtos que utilizam o material de id=15836
--select * from ProdutoMaterial

select p.Nome as Produto
	 --, pm.IDMaterial,
	  --m.FK_ProdutoMaterial_Material 
from Produto p
--inner join p.Produto on pm.ProdutoMaterial = p.IDMaterial
inner join pm.ProdutoMaterial on m.Material = pm.IDMaterial
where  exists (select 1
               from   material
			   where  departamento.IDMaterial = Empregado.IDMaterial
			   and    Material.IDMaterial    = '15836');

where  exists (select 1
               from   departamento
			   where  departamento.IDDepartamento = Empregado.IDDepartamento
			   and    Material.IDMaterial    = '15836');


 pm.IDMaterial
group by IDMaterial 
having IDMaterial = 15836

select emp.NomeEmpregado, 
       ger.NomeEmpregado as NomeGerente,
	   de.NomeDepartamento as DepartamentoEmpregado,
	   dg.NomeDepartamento as DepartamentoGerente
From   Empregado emp
  inner join Empregado ger on emp.IDGerente = ger.IDEmpregado
  inner join Departamento de on de.IDDepartamento = emp.IDDepartamento
  inner join Departamento dg on dg.IDDepartamento = ger.IDDepartamento;

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


--3) Liste todos os clientes que tenham o LTDA no nome ou razao social. 

select Nome
from Cliente
where (select RazaoSocial
	   from Cliente
	   where RazaoSocial like '%LTDA%');






/* 4) Crie (insira) um novo registro na tabela de Produto, com as seguintes informações:
Nome: Galocha Maragato
Preço de custo: 35.67
Preço de venda: 77.95
Situação: A*/
INSERT INTO Produto (Nome, PrecoCusto, PrecoVenda, Situacao ) 
    VALUES ('Galocha Maragato', '35.67', '77.95', 'A');