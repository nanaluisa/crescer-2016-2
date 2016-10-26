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

// for (let prop in arrayDeHerois){
//     let heroi = arrayDeHerois[prop];
//     let comics = heroi.comics.items;
// }
 foraDaGuerraCivil() {
    this.personagensDaPaz = new Array();
    for (var prop in this.personagens) {
      if (object.hasOwnProperty(prop)) {

      }
    }
    let ind = 0;
    //iterando personagens:
    for (let i = 0; i < this.personagens.length; i++) {
        for (let j = 0; j < this.personagens[i].events.items.length; j++) {
            if(this.personagens[i].events.items[j].name !== 'Civil War'){
                personagensDaPaz.push(this.personagens[i]);

// personagensDaPaz.push(this.personagens[i]);
            }
        }
    }

      return personagensDaPaz;

  }
}






// for (let prop in personagens){
//   let ehDaPaz = (personagens[prop])
//   personagensDaPaz[let i++] = personagens [];
// }
//  return personagensDaPaz;
// }
//

//exemplos:
// function ehObjeto(obj) {
//    return typeof obj === 'object';
// }
//
// function iguais(obj1, obj2) {
//   if (ehObjeto(obj1) && ehObjeto(obj2)) {
//      // se tiverem quantidades de campos diferentes, já retorna falso
//      if (Object.keys(obj1).length !== Object.keys(obj2).length) {
//        return false;
//     }
//      // comparando recursivamente propriedades;
//      for (let prop in obj1) {
//        let saoIguais = iguais(obj1[prop], obj2[prop]);
//        if (!saoIguais) return false;
//      }
//      return true;
//    }
//
//  return obj1 === obj2;
//
// }
