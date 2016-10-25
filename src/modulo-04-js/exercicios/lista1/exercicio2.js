// 2. Diglett dig, trio trio trio
// Escreva uma função diglettDig() que, utilizando console.log, imprime todos os números de 1 até 100, com duas exceções:
// quando o número for divisível por 3, imprima 'Diglett dig' invés do número, e
// quando o número for divisível por 5 (e não por 3), imprima 'trio trio trio' invés do número.
// Após ter essa lógica funcionando, altere a função para imprimir 'Diglett dig, trio trio trio' para números que são
// divisíveis tanto por 3 quanto por 5 (e que continue imprimindo 'Diglett dig' ou 'trio trio trio' para os números divisíveis
// apenas por 3 ou 5).

function diglettDig(){
  for (var i = 1; i <= 100; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
        console.log('Diglett dig, trio trio trio');
    }
    else if (i % 3 === 0) {
        console.log('Diglett dig');
    }
    else if (i % 5 === 0 && i % 3 !== 0) {
          console.log('trio trio trio');
      }
    else {
      console.log(i);
    }
  }
}

// Refactory correção:   TERMINAR A CORREÇÃO
function diglettDig(){
  for (var i = 1; i <= 100; i++) {
    let divisivelpor3 = i % 3 === 0;
    let divisivelpor5 = i % 5 === 0;
    let texto = 'olá';

    if (i % 3 === 0 && i % 5 === 0) {
        console.log('Diglett dig, trio trio trio');
    }
    else if (i % 3 === 0) {
        console.log('Diglett dig');
    }
    else if (i % 5 === 0 && i % 3 !== 0) {
          console.log('trio trio trio');
      }
    else {
      console.log(i);
    }
  }
}
