// 01. Heróis com classe
// Crie uma classe Herois que recebe no seu construtor um array com as informações dos personagens.
//  Exemplo (sem todas propriedades dos personagens, para exemplo completo olhar o arquivo baixado acima):
// let herois = new Herois([{ name: 'Deadpool' }, { name: 'Iron Man' }]);
// class Herois {
//   constructor(array) {
//       this.ArrayPersonagens = new Array();
//
//   }

  class Herois {
    constructor(array) {
         this.personagens = new Array();
         for (let prop in array) {
             this.personagens.push(array[prop]);
         }
     }
//no console: //  let herois = new Herois(marvel);

/* Exercício 2: Fora da guerra civíl
Escreva um método foraDaGuerraCivil() de instância da classe
Herois que retorna um array com
todos aqueles personagens que NÃO participaram da guerra civíl.
--> Para saber quando um personagem participou da guerra civíl,
basta procurar no seu array events
por algum item que tenha 'Civil War' dentro da string.
*/


  foraDaGuerraCivil() { //2
        this.personagensDaPaz = new Array();
        for (let prop in this.personagens) {
            let heroi = this.personagens[prop];
            let eventos = heroi.events.items;
            let heroiDaPaz = true;
            for (let key in eventos) {
                let itemEvento = eventos[key];
                if (itemEvento.name === "Civil War") {
                    heroiDaPaz = false;
                }
            }
            if (heroiDaPaz) {
                this.personagensDaPaz.push(this.personagens[prop]);
            }
        }
        return this.personagensDaPaz;
    }


  /*  03. Mais publicado

    Escreva um método maisPublicado() de instância da classe Herois que retorna
     o objeto personagem (não é preciso criar classe) que mais possui histórias
     em quadrinhos publicadas.
--> Para saber a quantidade de histórias em quadrinhos, utilize a propriedade
     available de comics. Desconsidere a diferença entre os items dentro de
     comics e o valor de available, pois tivemos que reduzir a quantidade de
     comics trazidos na coleção, para ficar mais leve o array.
  */
   maisPublicado(){
    return this.personagens.sort((h1,h2)=>
      h2.comics.available  - h1.comics.available)[0];
   }


/* 04. Média de páginas
Escreva uma função mediaPaginas() de instância da classe Herois que retorna a
média de páginas de todos quadrinhos dos personagens. Utilize a propriedade
pageCount da comic.+
*///posso usar for ou o reduce.

    mediaPaginas(){
    //   let totalPaginas = this.personagens.map(personagem =>
    //     personagens.comic.items.reduce((acum, comic) => acum + comic.pageCount,0)
    //   )
    //   .reduce((acum, paginas) => acum + paginas);
    //   console.log(totalPaginas);
    //
    //   return totalPaginas / this.personagens.length;
    // }
  //rever, está dando problema de undefined.
    let totalPaginas =
    this.personagens.map(personagem =>
      personagens.comic.items.reduce((acum, comic) => acum + comic.pageCount,0)
    )
    .reduce((acum, paginas) => acum + paginas);
    console.log(totalPaginas);

    return totalPaginas / this.personagens.length;
  }



/*05. Longevidade
Escreva um método seriesPorLongevidade de instância da classe Herois que retorna
todas as séries dos personagens ordenadas por tempo de atividade descendente,
ou seja, as séries que ficaram / estão há mais tempo sendo produzidas vêm primeiro.
Para saber a longevidade de uma série, basta utilizar os campos startYear e endYear da série.*/
seriesPorLongevidade(){
  let todasSeries = []
    //this.personagens.map(heroi => this.personagens.series.items)
    //this.personagens.map(heroi => this.personagens.series.items)

}





/*
06. Comic mais cara
Escreva um método comicMaisCara de instância da classe Herois que retorna o objeto comic mais caro entre todos personagens.
Para descobrir o preço total de um comic, some todo seu array prices.
*/

comicMaisCara() {
   let todasComics = []
   this.personagens.forEach(heroi => {
     todasComics = todasComics.concat(heroi.comics.items);
   });

   let totalizarPrecos = comic => comic.prices.reduce(
     (acc, objetoPreco) => acc + objetoPreco.price
   , 0);

   return todasComics.sort(
     (comic1, comic2) => totalizarPrecos(comic2) - totalizarPrecos(comic1)
   )[0]
 }







}//fim da classe.
