let salario = 200

console.log("=============================================");
while(salario < 2000){
    if (salario <= 280) {
        console.log("Para um salario de R$"+salario.toFixed(2),"\nOferecemos um reajuste de 20%, sendo R$"+(salario*0.2).toFixed(2),"\nTotalizando um salario de R$"+ (salario*1.2).toFixed(2));
    }
    else if(280 < salario && salario <= 700){
        console.log("Para um salario de R$"+salario.toFixed(2),"\nOferecemos um reajuste de 15%, sendo R$"+(salario*0.15).toFixed(2)+"\nTotalizando um salario de R$"+ (salario*1.15).toFixed(2));
    }
    else if(700 < salario && salario <= 1500){
        console.log("Para um salario de R$"+salario.toFixed(2),"\nOferecemos um reajuste de 10%, sendo R$"+(salario*0.1).toFixed(2)+"\nTotalizando um salario de R$"+ (salario*1.1).toFixed(2));
    }
    else{
        console.log("Para um salario de R$"+salario.toFixed(2),"\nOferecemos um reajuste de 5%, sendo R$"+(salario*0.05).toFixed(2)+"\nTotalizando um salario de R$"+ (salario*1.05).toFixed(2));
    }
    console.log("=============================================");
    salario+=450  // Promocao
}