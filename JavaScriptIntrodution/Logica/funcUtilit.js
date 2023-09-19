function aleatorio (){
    return Math.floor(Math.random() * 100)
}

function preenche (max) {
    let array = []
    
    for(let i=0; i<max; i++){
        array.push(aleatorio())
    }
    return array
}

let array = preenche(100) 
console.log(array);

function filtraPares(array) {
    let pares = []

    for(let i in array) {
        if(array[i]%2 == 0){
            pares.push(array[i])
        }
    }
    return pares
}

const pares = filtraPares(array)
console.log(pares);

function elevar(pares) {
    let elevado = []

    for(let i in pares) {
        elevado.push(Math.pow(pares[i], 2))
    }
    return elevado
}

const elevado = elevar(pares)
console.log(elevado)

function soma(elevado) {
    let somada = 0
    for(let i in elevado) {
        somada += elevado[i]
    }
    return somada
}

let somada = soma(elevado)
console.log(somada)