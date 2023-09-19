export class Produto {
  constructor(codigo=0, nome="", preco=0, quantidadeEmEstoque=0) {
    this._codigo = codigo
    this._nome = nome
    this._preco = Math.round(preco)
    this._quantidadeEmEstoque = quantidadeEmEstoque
  }

  comprarProduto(quantidade) {
    if(quantidade <= this._quantidadeEmEstoque) {
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