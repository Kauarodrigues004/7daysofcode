function somar(valorx,valory){
    return valorx + valory;
}

function subtrair(valorx,valory){
    return valorx - valory;
}

function multiplicar(valorx,valory){
    return valorx * valory;
}

function dividir(valorx,valory){
    return valorx / valory;
}

let x="";
let y="";

let calc = true;

alert(`Bem vindo!`)

while(calc == true){
    operacao = prompt(`Qual operação deseja efetuar 'soma', 'subtração', 'multiplicação', 'divisão' ou 'sair'?`)
    while(operacao != 'soma' && operacao != 'subtração' && operacao != 'multiplicação' && operacao != 'divisão' && operacao != 'sair'){
        alert(`Operação não reconhecida!`)
        operacao = prompt(`Qual operação deseja efetuar 'soma', 'subtração', 'multiplicação', 'divisão' ou 'sair'?`)
    } 

    if (operacao != 'sair'){
        do{
            x = prompt(`Informe o primeiro valor?`).replace(',', '.');
            valorx = parseFloat(x);
            if(isNaN(valorx)) {
                alert(`Valor informado não é um número!`);
            }
        }while(isNaN(valorx));

        do{
            y = prompt(`Informe o segundo valor?`).replace(',', '.');
            valory = parseFloat(y);
            if(isNaN(valory)) {
                alert(`Valor informado não é um número!`);
            }
        }while(isNaN(valory));

        switch (operacao){
            case 'soma':
                resultado = somar(valorx,valory);
                alert(`O resultado da operação ${valorx}+${valory} é:\n${resultado}`);
                break;
            case 'subtração':
                resultado = subtrair(valorx,valory);
                alert(`O resultado da operação ${valorx}-${valory} é:\n${resultado}`);
                break;
            case 'multiplicação':
                resultado = multiplicar(valorx,valory);
                alert(`O resultado da operação ${valorx}*${valory} é:\n${resultado}`);
                break;
            case 'divisão':
                resultado = dividir(valorx,valory);
                alert(`O resultado da operação ${valorx}/${valory} é:\n${resultado}`);
                break;
        }
    }

    if (operacao == 'sair'){
        calc = false;
    }
}