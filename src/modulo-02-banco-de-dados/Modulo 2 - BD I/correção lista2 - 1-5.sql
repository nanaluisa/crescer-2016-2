-- correção
--7
--8
select * into CopiaEmpregado  
		from Empregado
begin transaction
	update Empregado
	set  salario = salario * 1.145-- ou  salario = salario + (salario * 1.145)
	from Empregado e INNER JOIN Departamento d 
	where exists (select 1
				  from Departamento 
				  where Departamento. IDDepartamento = Empregado.IDDepartamento 
				  and Departamento.Localizacao = 'SAO PAULO' )

--9

--10)
Select 
	IDDepartamento, NomeDepartamento
From   Departamento dep
	inner join   Empregado emp on   emp.IDDepartamento = dep.IDDepartamento
where emp.Salario  = (select max(Salario)
			         from   empregado
					 where  IDDepartamento is not null)
			   );
--ou ordenar  
-----------------------------