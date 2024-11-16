let frutas = []
let laticinios = []
let congelados = []
let doces = []


let validacao = true

while (validacao == true) {
    let pergunta = prompt('Você deseja adicionar uma comida na sua lista de compras? (S) ou (N)').toUpperCase()
    
    if (pergunta == 'S') {
        let comida = prompt('Qual comida deseja inserir?')

        let categoria = prompt(`Em qual categoria essa comida se encaixa?\n 
                               1 para frutas,\n 
                               2 para laticinios,\n 
                               3 para congelados e\n 
                               4 para doces.`)

        if (categoria == 1) {
            frutas.push(comida)
        } else if (categoria == 2) {
            laticinios.push(comida)
        } else if (categoria == 3) {
            congelados.push(comida)
        } else if (categoria == 4) {
            doces.push(comida)
        } else {
            alert('Categoria inválida!')
        }

    } else if (pergunta == 'N') {
        validacao = false
    }
}

if (validacao === false && frutas.length === 0 && laticinios.length === 0 && congelados.length === 0 && doces.length === 0) {
    alert('OK! Sua lista não foi construída!')
} else {
    alert(`A sua lista de compras:\n 
           Frutas: ${frutas}\n
           Laticínios: ${laticinios}\n
           Congelados: ${congelados}\n
           Doces: ${doces}`)
}