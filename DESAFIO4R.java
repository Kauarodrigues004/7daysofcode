`let computador = Math.floor(Math.random() * (10 - 0 + 1) + 0)
let chances = 3;

alert(Vamos jogar um jogo! Tente adivinhar qual número de 0 a 10 o computador está pensando, você tem ${chances} chances!)

for(let i = 0; i < 3; i++){

let resposta = prompt("Qual o número?");

if(resposta == computador){
i = 4;
alert("Parabéns!")
}
if(resposta !== computador && i < 2){
chances = chances - 1;
alert(Você errou! Tente novamente, você tem mais ${chances} tentativas!)
}
if(i == 2){
alert(Você perdeu! O número que o computador havia pensado era ${computador}!)
}
}
`