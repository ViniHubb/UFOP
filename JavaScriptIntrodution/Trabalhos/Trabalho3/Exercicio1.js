let vetor = []

for(let i=0; i<10; i++) {
    vetor.push(Math.floor(Math.random()*10))
}
console.log(vetor)

const menor = vetor.reduce((a,b) => Math.min(a,b))
console.log("O menor valor no vetor e:", menor);

const maior = vetor.reduce((a,b) => Math.max(a,b))
console.log("O maior valor no vetor e:", maior);
