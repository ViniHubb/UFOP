let vet = []
for(let i=0; i<50; i++){
    vet[i] = Math.floor(((Math.random()-0.5)*20))       //Preenche o vetor com valores etre -10 a 9
}

function filtraPositivos(array) {       //Filtra os valores positivos
    let positiv = []

    for(let i in array) {
        if(array[i] >= 0){
            positiv.push(array[i])
        }
    }
    return positiv
}

console.log(vet);
console.log(filtraPositivos(vet))