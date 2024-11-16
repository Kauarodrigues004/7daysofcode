const devArea = prompt("Qual área você deseja seguir ? [Front-End/Back-End]")
let language = ""

if (devArea === "Front-End") {
language = prompt("Você deseja aprender React ou Vue ?")
} else if (devArea ==="Back-End") {
language = prompt("Você deseja aprender C# ou Java ?")
} else{
alert("Você não inseriu uma área válida!")
}

const specializingSwapFullstack = prompt("Digite [1] para continuar se especializando, e [2] para seguir se desenvolvendo como FullStack")

if (specializingSwapFullstack == 1){
alert(Continue se especializando em ${language}, para dominar a área de ${devArea})
} else if (specializingSwapFullstack == 2){
alert(Chegou a hora de se especializar em outras linguagens além de ${language}, para se tornar FullStack)
} else {
alert(Você não inseriu uma opção válida!)
}

let msg = prompt("Tem mais alguma tecnologia que você gostaria de aprender ? Digite [ok] em caso de positivo.")

while (msg === "ok"){
let newTechnologie = prompt("Qual a nova Tecnologia deseja aprender ?")
alert(${newTechnologie} realmente e uma boa tecnologia muito legal!)
let msg = prompt("Ainda tem mais alguma Tecnologia que deseja aprender ? Digite [ok] em caso de positivo.")
}