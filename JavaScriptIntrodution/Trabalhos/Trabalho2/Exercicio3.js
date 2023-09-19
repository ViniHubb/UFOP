let peso, altura, IMC

peso = 50       // Em Kilos
altura = 1.70   // Em Metros

while(peso<120){
    IMC = (peso / (altura * altura)).toFixed(1)

    if (IMC < 18.5){
        console.log("IMC =",IMC+", voce esta abaixo do peso");
    }
    else if(18.5 <= IMC && 24.9 >= IMC){
        console.log("IMC =",IMC+", voce esta com o peso ideal");
    }
    else if(25 <= IMC && 29.9 >= IMC){
        console.log("IMC =",IMC+", voce esta com sobrepeso");
    }
    else if(30 <= IMC && 34.9 >= IMC){
        console.log("IMC =",IMC+", voce esta com obesidade grau 1");
    }
    else if(35 <= IMC && 39.9 >= IMC){
        console.log("IMC =",IMC+", voce esta com obesidade grau 2");
    }
    else{
        console.log("IMC =",IMC+", voce esta com obesidade grau 3");
    }
    peso+=11    // Ganhando peso a cada loop
}