--Exercícios 1
--1
select NomeEmpregado,
	   DataAdmissao,
	   DateDiff(Month, DataAdmissao, convert(datatime,'31/06/2000', 103)) meses_trabalho
from Empregado
where dataAdmissao between (convert(datatime, '01/05/1980',103)) and (convert(datatime, '05/01/1982', 103)) 

--2

--somente verificando quantos há por cargo.
--select Cargo,  count(1) Pessoas_por_Cargo 
--from Empregado
--group by cargo
--having  count(1) >= 1;

-- verifaca o maior
select top 1 -- somente o primeiro, se houverem outros com o mesmo numero empate [ select top 1 with ties ]
		Cargo,
		count(1) as total_Empregado
from Empregado
group by cargo
order by total_Empregado desc;

--3)
select UF, count(1) Cidades_por_UF
from Cidade
group by UF;
-- having count(1) >= 1; (Não é necessário)

--4)
select  Nome, UF, count(1) Cidades_Duplicadas 
from Cidade
group by Nome, UF
having count(1) > 1; 


--5)
select isnull(MAX (IDAssociado),0) + 1 as Próximo_ID
from Associado;

select MAX (IDEmpregado) + 1 as Próximo_ID
from Empregado;

--6)
select NomeEmpregado, Salario,
	   Case when salario < 1164.00 then 0 
			when salario <= 2326.00 then 0.15
		else 0.275 
			end Perc_IR
from Empregado

------------ Continuação ---------------------
--7
-- No lugar de IDDEpto tem que vir o nome do depto
select e.nomeEmpregado as Nome_Empregado,
		   g.nomeEmpregado as Nome_Gerente,
		   e.IDDepartamento as Departamento_Empregado,
		   g.IDDepartamento as Departamento_Gerente
		    
	from Empregado e INNER JOIN Empregado g 
		ON e.IDGerente = g.IDEmpregado 



  select e.nomeEmpregado as Nome_Empregado,
		   g.nomeEmpregado as Nome_Gerente
	from Empregado e LEFT JOIN Empregado g 
		ON e.IDGerente = g.IDEmpregado 






	select e.nomeEmpregado as Nome_Empregado,
		   g.nomeEmpregado as Nome_Gerente,
	from Empregado e 
	INNER JOIN Empregado g 
		ON e.IDGerente = g.IDEmpregado 

		select * from Empregado

	select e.NomeDepartamento as Departamento_Empregado,
	from Empregado e LEFT JOIN Departamento d 
		ON e.IDDepartamento = d.IDDepartamento
	
	select e.NomeDepartamento as Departamento_Empregado,
		   g.NomeDepartamento as Departamento_Gerente
    from Empregado e LEFT JOIN Empregado g 
		ON e.IDGerente = g.IDEmpregado
		 

		-- Acessar o NOME do depto, em vez do IDDepartamento


		
--8
	select * into CopiaEmpregado  -- ok tabela copiada
		from Empregado

	update Empregado
	set  salario += salario * 0.145 
	from Empregado e INNER JOIN Departamento d 
	where IDDepartamento = (select IDDepartamento  --logica correta, lugar não.
			from Departamento 
				where Localizacao = 'SAO PAULO' )

				



	select * from Departamento


	/*
	from Empregado e INNER JOIN Empregado g 
		ON e.IDGerente = g.IDEmpregado 

*/
	select * from Departamento




	UPDATE nome_tabela
SET CAMPO = "novo_valor"
WHERE CONDIÇÃO





