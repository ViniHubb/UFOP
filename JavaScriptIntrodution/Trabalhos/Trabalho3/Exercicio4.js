let vetor = []
let flag=i=0
while(i<50){
    let num = Math.floor(Math.random()*100)
    if(!vetor.includes(num)){
        vetor.push(num)
        i++
        flag--
    }
    flag++
}

const impar = vetor.filter(valor =>{
    if(valor%2 != 0){
        return true
    }
})

const soma = vetor.reduce((valor, total) => total += valor,0)

console.log("Vetor:\n", vetor)
console.log("\n"+ flag, "vezes não foi possível inserir números no vetor\n");
console.log("Todos os números ímpares presente:\n", impar);
console.log("\nSoma do vetor de numeros impares = ", soma);