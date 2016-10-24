
//
// function exibirNaTela(elfo){
//
//     function maiusculo(texto){
//     return texto.toUpperase();
//     }
//


// function gerarPiramide(niveis){
//   var word =.join('R$');
//   for(var i=0; i<word.length; i++){
//     return console.log(word[i]);
//   }
// }

function gerarPiramide(niveis) {
    for (var i = 0; i < niveis; i++) {
      return Array(niveis).join('RS');
}
console.log(gerarPiramide(niveis));



//
// for(var word = ''; word.length < 10; word += 'a'){}
// If you need to repeat multiple chars, multiply your conditional:
//
// for(var word = ''; word.length < 10 * 3; word += 'foo'){}
// ote: You do not have to overshoot by 1 as with word = Array(11).join('a')

//
// var word = Array(niveis).join('R$');
// function gerarPiramide(niveis){
//   for(var i=0; i<niveis; i++){
//        for (var i = 1; i < niveis; i++) {
//             word[i];
//
//        }
//     // return console.log(word);
//   }
//   return console.log(word);
// }
