let frutas = [];
let laticinios = [];
let carnes = [];
let guloseimas = [];
let resposta = "sim";
let comida = "";
let categoria = 0;
let remocao ="";

while (resposta == "sim") {
if(frutas.length == 0 && laticinios.length == 0 && carnes.length == 0 && guloseimas.length == 0) {
resposta = prompt (Você deseja adicionar um alimento a sua Lista de Compras? Responda sim ou não);
} else {
resposta = prompt ("Você deseja adicionar um alimento a sua Lista de Compras? Responda sim ou não \n Ou deseja remover um item? Responda 'remover'");
}
if(resposta == "sim") {
comida = prompt (" Qual comida você deseja inserir? Escreva abaixo:");
categoria = prompt ("Em qual categoria este alimento se encaixa? 1-Frutas 2-Laticineos 3-Carnes 4- Guloseimas");
if(categoria == 1) {
frutas.push(comida);
} else if( categoria == 2) {
laticinios.push(comida);
} else if( categoria == 3) {
carnes.push(comida);
} else if( categoria == 4) {
guloseimas.push(comida);
} else{
alert("você digitou uma opção inválida, tente novamente.");
categoria = prompt ("Em qual categoria este alimento se encaixa? 1-Frutas 2-Laticineos 3-Carnes 4- Guloseimas");
}
} else if (resposta == "não") {
alert(Lista de Compras:\n Frutas: ${frutas} \n Laticínios: ${laticinios} \n Carnes: ${carnes} \n Guloseimas: ${guloseimas});
break;
} else if (resposta == "remover") {
remocao = prompt (Lista de Compras:\n Frutas: ${frutas} \n Laticínios: ${laticinios} \n Carnes: ${carnes} \n Guloseimas: ${guloseimas} \n Escreva o nome do item que deseja remover:);
if(frutas.includes(remocao)) {
frutas.splice(remocao);
alert(item ${remocao} removido.);
} else if (laticinios.includes(remocao)) {
laticinios.splice(remocao);
alert(item ${remocao} removido.);
} else if(carnes.includes(remocao)) {
carnes.splice(remocao);
alert(item ${remocao} removido.);
} else if(guloseimas.includes(remocao)) {
guloseimas.splice(remocao);
alert(item ${remocao} removido.);
} else{
alert("Não foi possível encontrar este item dentro da lista.");
}
alert(Lista de Compras:\n Frutas: ${frutas} \n Laticínios: ${laticinios} \n Carnes: ${carnes} \n Guloseimas: ${guloseimas});
resposta = prompt("Deseja remover ou adicionar mais algum item? Responda sim, ou não.");
} else {
alert("você digitou uma opção inválida, tente novamente.");
resposta = prompt ("Você deseja adicionar um alimento a sua Lista de Compras? Responda sim ou não \n Ou deseja remover um item? Responda 'remover'");
}
}