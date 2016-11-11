// . Pirâmide iluminatti
//
// Escreva uma função gerarPiramide(niveis) que imprime com console.log uma pirâmide com uma quantidade de níveis informada por parâmetro, utilizando os caracteres R$. Ex:
//   gerarPiramide(9);
//   R$
//   R$R$
//   R$R$R$
//   R$R$R$R$
//   R$R$R$R$R$
//   R$R$R$R$R$R$
//   R$R$R$R$R$R$R$
//   R$R$R$R$R$R$R$R$
//   R$R$R$R$R$R$R$R$R$

function gerarPiramide(niveis) {
    for (var i = 1; i <= niveis; i++) {
        console.log('R$'.repeat(i));
    }
}


//correção (outra forma de fazer)
function gerarPiramide2(niveis) {
    for (var i = 1; i <= niveis; i++) {
        console.log(Array(i+1).join('R$'));
    }
}
