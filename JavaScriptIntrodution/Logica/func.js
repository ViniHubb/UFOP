function soma (numero1 = 0, numero2 = 0){
    
    if(typeof(numero1) === "number" && typeof(numero2) === "number"){
    
        let numero = numero1 + numero2
        return numero
    
    }else{
        return 'Entrada invalida!'
    }
    

}

function escreve (resultado = 0){

    console.log("O resultado e:", resultado)

}

function random(){
    // return (Math.random() * 100).toFixed(0)    // Retonar uma string
    return Math.floor(Math.random() * 100)        // Retorna um number

}

let resultado = soma(2,3)
escreve(resultado)

let randomic = random()
escreve(randomic)

console.log(typeof(soma()))
console.log(typeof(random()))

// function multiplica (valor){

//     return valor * 10

// }

// resultado = multiplica(10)
// escreve(resultado)

const multiplica = (valor, numero) => {

    if(valor < 0 || numero < 0){
        return 'ERRO no sistema!'
    }else{
        return valor * numero
    }

}

resultado = multiplica(10, 20)
escreve(resultado)

