const data = new Date()

let dia = data.getDate()
let mes = data.getMonth()+1
let ano = data.getFullYear()
let semana = data.getDay()

console.log(`Data: ${dia}/${mes}/${ano}`)

let hora = data.getHours()
let minut = data.getMinutes()
console.log(`Hora:   ${hora}:${minut}`)

switch (semana){
    case 0:
        console.log("Hoje e domingo")
        break
    case 1:
        console.log("Hoje e segunda")
        break
    case 2:
        console.log("Hoje e terça")
        break
    case 3:
        console.log("Hoje e quarta")
        break
    case 4:
        console.log("Hoje e quinta")
        break
    case 5:
        console.log("Hoje e sexta")
        break
    case 6:
        console.log("Hoje e sabado")
        break
    default:
        console.log("Vixi, deu ruim")
}