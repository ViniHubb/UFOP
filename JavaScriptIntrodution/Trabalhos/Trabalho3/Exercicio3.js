let vetor = []

for(let i=0; i<7; i++) {
    vetor.push(Math.floor(Math.random()*30))
}
console.log(vetor)

const soma = vetor.reduce((total, valor) => total += valor ,0)
const media = soma/vetor.length

const acima = vetor.filter( valor => {
    if (valor > media){
        return true
    }
}).reduce(total => total += 1, 0)

console.log("A temperatura media da semana foi de: ", media.toFixed(2))
console.log("Tivemos", acima, "temperaturas acima da media");