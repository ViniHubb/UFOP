let vet = []

for(let i=0; i<30; i++){        //Cria um vetor com 30 strings aleatorias
    let letra = 0
    let nome = ""
    for(let j=0; j<6; j++){
        letra = String.fromCharCode((Math.floor(Math.random()*25)+97).toString())       //Gera um numero entre 97 ee 122, depois o converte para uma letra do alfabeto
        nome += letra       //Concatena a letra gerada anteriormente na strig nome
    }
    vet[i] = nome
}

function filtraNomes(array = [], letra = ""){       //Filtra o vetor original e adiciona em "filtrado" os nomes que conteem a letra indicada 
    
    let filtrado = []
    for(let i=0; i<array.length; i++){
        if(array[i].includes(letra)){
            filtrado.push(array[i])
        }
    }
    return filtrado
}

const filtrado = filtraNomes(vet, "a")
console.log("Vetor original:\n", vet)
console.log("\nVetor filtrado:\n",filtrado)