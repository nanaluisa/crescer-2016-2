console.log('Olá JS!');

var elfo = {nome: 'Legolas', expperiencia:1};
console.log('Nome:',elfo.nome);

elfo.flechas = 42;
console.log(elfo.flechas);
delete elfo.flechas;
elfo.flechas = undefined;

elfo['Nome completo']='Legolas da Silva';
elfo.atirarflecha = function(dwarf){
  dwarf.vida -= 10;
  elfo.experiencia++;
  dwarf.feliz = false;
  return dwarf;
};

var dwarf = elfo.atirarflecha({vida: 110});


console.log(elfo, dwarf);
