let opt = 1

let num1 = 2
let num2 = 3

switch (opt){
    case 0:
        console.log(`${num1} + ${num2} =`,num1 + num2)
        break
    case 1:
        console.log(`${num1} - ${num2} =`,num1 - num2)
        break
    case 2:
        console.log(`${num1} * ${num2} =`,num1 * num2)
        break
    case 3:
        console.log(`${num1} / ${num2} =`,num1 / num2)
        break
    default:
        console.log("ERRO")
        break
}

opt = 2

if(opt === 0)
    console.log(`${num1} + ${num2} =`,num1 + num2)
else if(opt === 1)
    console.log(`${num1} - ${num2} =`,num1 - num2)
else if(opt === 2)
    console.log(`${num1} * ${num2} =`,num1 * num2)
else if(opt === 3)
    console.log(`${num1} / ${num2} =`,num1 / num2)
else
    console.log("ERRO")