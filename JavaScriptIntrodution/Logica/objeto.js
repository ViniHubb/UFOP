class Conta {
  constructor(banco, numeroConta, saldo) {
    this._banco = banco
    this._nuemeroConta = numeroConta
    this._saldo = saldo
  }

  printConta() {
    console.log(`
      Banco: ${this._banco}
      Numero: ${this._nuemeroConta}
      Saldo: R$ ${this._saldo}
    `)
  }
}

class Pessoa extends Conta {
  constructor(nome = "", idade = 0, banco, numeroConta, saldo) {
    super(banco, numeroConta, saldo)
    this._nome = nome
    this._idade = idade
  }

  printPessoa() {
    console.log(`
      Nome: ${this._nome}
      Idade: ${this._idade}
    `);
  }
}



const pessoa1 = new Pessoa("Nice", 10, "Santander", "346728-88", 23000)

pessoa1.printPessoa()
pessoa1.printConta()