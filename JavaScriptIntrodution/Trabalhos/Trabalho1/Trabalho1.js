// ===== Primeiro exercicio: Medidas ===== //
console.log('\n==============================');
console.log('EXERCICIO 1\n');
const valor = 20
console.log('O valor', valor, 'metros em:')
console.log('decimetros ', valor*10)
console.log('centimetros', valor*100)
console.log('milimetros ', valor*1000)
console.log('==============================');
//=========================================//

// Segundo exercicio: Sucessor/Antecessor //
console.log('\n==============================');
console.log('EXERCICIO 2\n');
const aleatorio = Math.random()*100
const redondo = Math.round(aleatorio)
console.log( typeof redondo)
console.log('O numero aleatorio obtido foi:', aleatorio.toFixed(4), '\narredondando temos:', redondo)
console.log('Seu antecessor e ', redondo-1)
console.log('Seu sucessor e   ', redondo+1)
console.log('==============================');
//=========================================//

// ===== Terceiro exercicio: Área ====== //
console.log('\n==============================');
console.log('EXERCICIO 3\n');
const lado = 6
console.log('A area do quadrado de lado', lado,'cm')
console.log('e de:', lado*lado,'cm');
console.log('==============================');
//=========================================//

// === Terceiro exercicio: Temperatura === //
console.log('\n==============================');
console.log('EXERCICIO 4\n');
const celsius = 30
console.log('A temperatura de', celsius+'° Celsius')
console.log('em Fahrenheit e de:', (celsius*1.8)+32+'° Fahrenheits');
console.log('==============================');
//=========================================//