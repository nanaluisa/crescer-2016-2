Create table Pais
    ( IDPais   int         not null,
      Nome     varchar(50) not null,
      Sigla    varchar(3),
         constraint PK_Pais primary key (IDPais)
    );
     
	 Insert into Pais(IDPais, Nome, Sigla)
	 Values(1, 'Brazil', 'BRA');

	 select * from Pais;