class Produto {
  constructor(codigo = 0, nome = "", preco = 0, quantidadeEmEstoque = 0) {
    this._codigo = codigo
    this._nome = nome
    this._preco = Math.round(preco)
    this._quantidadeEmEstoque = quantidadeEmEstoque
  }

  comprarProduto(quantidade) {
    if (quantidade <= this._quantidadeEmEstoque) {
      console.log("*Compra realizada com sucesso*")
      this._quantidadeEmEstoque -= quantidade
      return this._preco * quantidade
    } else {
      console.log("*INVVALIDO* \n A quantidade desejada de", this._nome, "está indisponivel no momento, possuimos apenas", this._quantidadeEmEstoque, this._nome, "em estoque")
      return 0
    }
  }

  exibirInformacoes() {
    console.log(`
      Nome: ${this._nome}
      Código: ${this._codigo}
      Preço: R$ ${this._preco.toFixed(2)}
      Estoque: ${this._quantidadeEmEstoque}
    `)
  }
}

console.log("=============={ Loja }==============\n")

const banana = new Produto(1, "Banana", 2, 80)
const tv = new Produto(2, "TV", 2100, 10)
const garrafa = new Produto(3, "Garrafa", 12, 20)
const arroz = new Produto(4, "Arroz", 23, 30)

let valor = 0

// Banana
valor = banana.comprarProduto(12)
console.log("O valor da compra foi de R$", valor.toFixed(2))
banana.exibirInformacoes()

// TV
valor = tv.comprarProduto(12)
console.log("O valor da compra foi de R$", valor.toFixed(2))
tv.exibirInformacoes()

// Garrafa
valor = garrafa.comprarProduto(12)
console.log("O valor da compra foi de R$", valor.toFixed(2))
garrafa.exibirInformacoes()

// Arroz
valor = arroz.comprarProduto(12)
console.log("O valor da compra foi de R$", valor.toFixed(2))
arroz.exibirInformacoes()

console.log("=====================================\n")