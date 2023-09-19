let idade = 6

while(idade < 80){
    if(idade < 16){
        console.log(idade,"anos, nao eleitor")
    }
    else if(idade > 18 && idade < 65){
        console.log(idade,"anos, eleitor obrigatorio")
    }
    else{
        console.log(idade,"anos, eleitor facultativo")
    }
    idade+=10
}
// Usei um loop para poder vizualizar todas as possiveis entradas 
// sem ser necessario ficar alterando a variavel idade manualmente.