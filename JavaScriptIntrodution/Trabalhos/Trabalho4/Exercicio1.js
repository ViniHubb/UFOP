console.log("\t\tCambio")
console.log("1.00 USD = 5.35 BRL")
console.log("1.00 EUR = 6.38 BRL")
console.log("1.00 ARS = 0.056 BRL\n")

function cambio(valor, moeda){
    if(moeda === "USD"){
        return valor*5.35
    }
    else if(moeda === "EUR"){
        return valor*6.38
    }
    else if(moeda === "ARS"){
        return valor*0.056
    }
    else{
        return -1
    }
}

let valor = 100.00
let moeda = "USD"
let resultado = cambio(valor, moeda)
console.log(valor, moeda, "equivale a", resultado.toFixed(2), "BRL")

valor = 100.00
moeda = "EUR"
resultado = cambio(valor, moeda)
console.log(valor, moeda, "equivale a", resultado.toFixed(2), "BRL")

valor = 100.00
moeda = "ARS"
resultado = cambio(valor, moeda)
console.log(valor, moeda, "equivale a", resultado.toFixed(2), "BRL")