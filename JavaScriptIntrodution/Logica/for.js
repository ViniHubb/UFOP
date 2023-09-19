let num = 0

console.log('Numero',num)
num++
console.log('Numero',num)
num++
console.log('Numero',num)
num++
console.log('Numero',num)

for (let i=0; i<4; i++){
    console.log('I = ',i)
}

for (let i=4; i>=0; i--){
    console.log('I = ',i)
}

num = 99

for(let i=1; i<=num; i+=2){
    console.log(i)
}

for(let i=1; i<=10; i++){
    console.log(num,'x',i,'=', num*i)
}