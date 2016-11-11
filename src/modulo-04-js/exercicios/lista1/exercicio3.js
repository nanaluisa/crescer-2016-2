// 3. Funções por parâmetro!?
//
// Crie uma função chamada find que recebe um array e uma função por parâmetro.
//A função (passada por parâmetro) deverá informar um critério de busca de elementos dentro do array e a função
// find utilizará este critério para retornar todos elementos do array que encontram-se dentro dele. NÃO SURTEM! Exemplos:
// var maiorIgualADois = function(elemento) {
//   return elemento >= 2;
// };
// console.log(find([ 1, 2, 3 ], maiorIgualADois));
// // [ 2, 3 ]
//
// console.log(find([ 'a', 5, null, false, 'false' ], function(elem) {
//   return typeof elem === 'string';
// }));
// // [ 'a', 'false' ]
//
// console.log(find([ { nome: 'a' }, { nome: 'b' }  ], function(elem) {
//   return typeof elem.nome === 'c';
// }));
// // []
// Bônus
//
// Bonus
//
// O que acontecerá se você informar um valor que não seja uma função no segundo parâmetro?
// Exemplo:
// var maiorIgualADois = 'maior igual ou a dois';
// console.log(find([ 1, 2, 3 ], maiorIgualADois));
// Altere a implementação para apenas executar o segundo parâmetro caso ele seja uma função.



//simular chamanda:
find([1,3,2], function(elem){
    return elem > 1;
});

//exercicio corrigido:
function find(array, fnFiltro) {
  let resultado = [];

  if(typeof fnFiltro ==='function'){
      for (let i = 0; i < array.length; i++) {
          let encontrou = fnFiltro (array[i]);
          if(encontrou){
            resultado.push(array[i]);
          }
      }
      return resultado;
  }
}
