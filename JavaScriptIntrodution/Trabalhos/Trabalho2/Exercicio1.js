console.log('\n==============================');
console.log('EXERCICIO 1\n');
let numero = 1

while (numero < 9){
    switch(numero){
        case 1:
            console.log(numero,"- Domingo")
            break
        case 2:
            console.log(numero,"- Segunda")
            break
        case 3:
            console.log(numero,"- Terça")
            break
        case 4:
            console.log(numero,"- Quarta")
            break
        case 5:
            console.log(numero,"- Quinta")
            break
        case 6:
            console.log(numero,"- Sexta")
            break
        case 7:
            console.log(numero,"- Sabado")
            break
        default:
            console.log(numero,"- Numero invalido")
            break
    }
    numero++
}

console.log('==============================');
numero = 1

while (numero < 9){
    let Vnumero = ['Numero Invalido','Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabado']

    if(numero < 1 || numero > 7){            // Se o valor não estiver entre 1 e 7 sera impresso o Vnumero[0] que tem
        console.log(numero,"-",Vnumero[0])   // como conteudo "Numero invalido"
    }
    else{                                    // Caso contrario imprime o valor correspondente a cada dia
        console.log(numero,"-",Vnumero[numero]) 
    }
    numero++
}
console.log('==============================');

// Eu estava com tempo e resolvi testar dois metodos diferentes para fazer esse exercicio.
// Usei um loop para poder vizualizar todas as possiveis entradas.