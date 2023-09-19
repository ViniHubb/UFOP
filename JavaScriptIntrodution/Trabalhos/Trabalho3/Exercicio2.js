let vetor = []

for(let i=0; i<10; i++) {
    vetor.push(Math.floor(Math.random()*10))
}
console.log(vetor)

const soma = vetor.reduce((total,valor) => total += valor ,0)
const media = soma/vetor.length
console.log("A media dos valores no vetor é de:", media.toFixed(2));
