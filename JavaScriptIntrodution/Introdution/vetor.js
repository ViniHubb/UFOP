let vetor = [10, 20, 30, 40, 60]
console.log(typeof vetor)

console.log('vetor =', vetor)
console.log('vetor[0] =', vetor[0])

vetor[5] = 50       // Vetor flexivel
//console.log(vetor)

vetor.push(60)      // Insere no final
//console.log(vetor)

vetor.unshift('a')        // Insere no inicio
console.log(vetor)

console.log('tamanho:',vetor.length)

console.log(vetor.includes(10));
console.log(vetor.includes(2));

let index

index = vetor.indexOf(60)       // Retorna a posição da primeira ocorrencia
console.log('index:', index)

vetor.pop()     // Exclui o ultimo elemento
vetor.shift()     // Exclui o primeiro elemento
console.log(vetor)
console.log('tamanho:',vetor.length)

delete vetor[2]     // Pratica ruim
delete vetor[3]
console.log(vetor)
console.log('tamanho:',vetor.length)        // Fica com espaço ocioso, ate entao sem motivos para usar "delete"

// // // FILTER // // //
console.log('\nAplicacoes');

vetor = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23]
let maiores = []

for(let i=0; i<vetor.length; i++){      // Apenas lógica de programacao
    if (vetor[i] > 10) {
        maiores.push(vetor[i])
    }
}
console.log(maiores);
maiores = []

for(let i in vetor){        // Um for slim
    if(vetor[i]>10){
        maiores.push(vetor[i])
    }
}
console.log(maiores);
maiores = []

console.log('\nFilter');

maiores = vetor.filter(valor => valor > 10)
console.log(maiores);
// // // // // // // // //

// // // MAP // // // 
console.log('\nMais aplicacoes');

for(let i in vetor){        // Multiplica o vetor por dois de maneira normal
    vetor[i] *= 2 
}
console.log(vetor)

for(let i in vetor){        // Atribui 0 as valores que possuem o digito '3'
    if(vetor[i].toString().includes(3)){
        vetor[i] = 0
    }
}
console.log(vetor)

console.log('\nMap');

vetor = vetor.map(valor => valor * 2)       // Limpo, muito util se bem comentado 
console.log(vetor)

vetor = vetor.map(valor =>{
    if(valor.toString().includes(2)){       // Complexoz porem sofisticado
        valor = 0
    }
    return valor
})
console.log(vetor)
// // // // // // // //

// // // REDUCE // // //
console.log('\nReduce');
let total = 0

for(i in vetor){
    total += vetor[i]
}
console.log('Total:', total)

total = 0

total = vetor.reduce((total,valor)=>{
    return total += valor
}, 0)
console.log('Total:', total)
// // // // // // // //