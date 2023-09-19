const nota1 = 60
const nota2 = 90
const media = (nota1 + nota2)/2

if (media < 60){
    console.log('Reprovado, faltaram', 60-media, 'pontos')
}
else if(media >= 60 && media <= 70){
    console.log('Aprovado, POR POUCO,', media-60, 'pontos sobrando')
}
else{
    console.log('Aprovado, parabens,', media-60, 'pontos sobrando ainda, clap clap')
}

const num = 20

if(num % 2 === 0)
    console.log(`O numero ${num} e par`)
else
    console.log(`O numero ${num} e impar`)
