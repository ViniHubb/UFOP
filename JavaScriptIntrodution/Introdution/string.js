const nome  = 'Vinicius'
console.log(typeof nome)

console.log('"Vinicius"',nome.length,'letras') //com espaço

console.log('icius?',nome.includes('icius'))
console.log('a?',nome.includes('a'))
console.log('V?',nome.includes('V'))
console.log('v?',nome.includes('v'))

const apelido = 'Niquini'
const completo = nome.concat(' ',apelido,' Bacana')
console.log(completo)

console.log(completo.toLowerCase())
console.log(completo.toUpperCase())

const numero = 25.455732545098
console.log(typeof numero)
console.log(numero)
const redondo = numero.toFixed(2)
console.log(redondo)
