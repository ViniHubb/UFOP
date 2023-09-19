const numero = 10 //Global, fora de tudo
let outro = 30


if(numero > 0){
    const numero = 20 //Local, dentro do desvio
    let outro = 40
    console.log('Dentro:', numero, 'e', outro)
}

console.log('Fora:', numero, 'e', outro)

if(outro > 0)
    outro++ //Global possivel modificar dentro ou fora

console.log('++:',outro)