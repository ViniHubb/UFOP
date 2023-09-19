let flag = 0
let value = -1
let resu = '->'
let bip = true
let cont = 0

let media = 0

for(let i=0; i<100; i++){
    flag = 0
    value = -1
    resu = '->'
    cont = 0
    while(flag<10){
        bip = true
        while(bip){
            value = (Math.floor(Math.random()*10))
            if (!resu.includes(value.toString())){
                resu = resu.concat(value.toString())
                bip = false
            }
            cont++
        }
        flag++
    }
    //console.log(resu)
    //console.log('Foram',cont,'loops')
    media +=cont
}

console.log('A media de loops foi de:',media/100)

let num = 5

let fatorial = 1

do{
    fatorial *= num
    num--
}while(num>=1)

console.log('O fatorial e:',fatorial)