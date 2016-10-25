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
