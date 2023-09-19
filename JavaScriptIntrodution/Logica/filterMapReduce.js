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

//////////////////FILTER////////////////////////

// Essa funcao funciona igual a funcao logo abaixo
const pares = array.filter(function (valor){
    if(valor%2 === 0){
        return true
    }else{
        return false
    }
})

// Essa funcao funciona igual a logo acima
const pares2 = array.filter( valor => {
    if(valor%2 === 0){
        return true
    }
})

console.log(pares);
console.log(pares2);

////////////////////////////////////////////////


///////////////////MAP/////////////////////////

// Essa funcao funciona igual a funcao logo abaixo
const quadrado = pares.map(function (valor){

    return Math.pow(valor, 2)

})

// Essa funcao funciona igual a logo acima
const quadrado2 = pares.map( valor => Math.pow(valor, 2))

console.log(quadrado);
console.log(quadrado2);

////////////////////////////////////////////////


//////////////////////REDUCE///////////////////

// Essa funcao funciona igual a funcao logo abaixo
const soma = quadrado.reduce(function (total,valor){

    return total += valor

},0)

// Essa funcao funciona igual a logo acima
const soma2 = quadrado.reduce((total,valor) => total += valor ,0)

console.log(soma);
console.log(soma2);

////////////////////////////////////////////////