function validaCPF(cpf = ""){
    if(cpf.length === 11){      //Verifica se tem 11 digitos
        let num=0
        for(let i=0; i<11; i++){        //Verifica se os digitos sao todos iguais com um flag "num"
            if(cpf[i] != num && num < 10){
                num++
                i=0
            }
        }
        if(num === 10){     //Se "num" === a 10 significa que nao sao todos os digitos iguais
            return true
        }
    }
    return false        //Se não entrou em algum if anterior o cpf não é valido
}

let cpf = 77297811761       //11 digitos e nao sao todos iguais
cpf = cpf.toString()
validaCPF(cpf) === true 
? console.log("CPF valido")
: console.log("CPF invalido")


cpf = 123456789         //menos de 11 digitos e nao sao todos iguais
cpf = cpf.toString()
validaCPF(cpf) === true 
? console.log("CPF valido")
: console.log("CPF invalido")

cpf = 88888888888       //11 digitos e sao todos iguais
cpf = cpf.toString()
validaCPF(cpf) === true 
? console.log("CPF valido")
: console.log("CPF invalido")