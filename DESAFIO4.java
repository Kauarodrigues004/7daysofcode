const numEsconhido = parseInt(Math.random()*10);
let chute = '';
let acerto = false;
for (var c = 0; c < 3; c++) {
chute = prompt('Adivinhe o número de 0 á 10: você tem 3 tentativas.');
if (chute == numEsconhido) {
console.log('Acertou');
acerto = true;
break;
}
alert("Número errado!");
}
if (!acerto) {
alert('Errou! o número sorteado era '+numEsconhido);
}