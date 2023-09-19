class Produto {
  constructor(codigo = 0, nome = "", preco = 0, quantidadeEmEstoque = 0) {
    this._codigo = codigo
    this._nome = nome
    this._preco = Math.round(preco)
    this._quantidadeEmEstoque = quantidadeEmEstoque
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

const array = []
let prod

for (let i = 0; i < 20; i++) {      // Cria um array de 20 produtos aleatorios, random = [1,100]
  let random = Math.floor(Math.random() * 100 + 1)
  prod = "Produto" + (random)
  array[i] = new Produto(random, prod, (random) * 2, (random) * 3)
}

function MaiorPreco(array = []) {       // Verifica o produto de maior preço
  let max = new Produto()
  for (let i = 0; i < array.length; i++) {
    if (array[i]._preco > max._preco) {
      max = array[i]
    }
  }
  return max
}

function EstoqueTotal(array = []) {     // Soma o estoque de todos os produtos
  let estoqueTotal = 0
  for (let i = 0; i < array.length; i++) {
    estoqueTotal += array[i]._quantidadeEmEstoque
  }
  return estoqueTotal
}

console.log("=============={ Loja }==============\n")

//console.log(array)  // Caso queira ver o array

const maior = MaiorPreco(array)
console.log("O produto mais caro da loja:")
maior.exibirInformacoes()

const estoqueTotal = EstoqueTotal(array)
console.log("A loja possui um estoque total de", estoqueTotal, "produtos");

console.log("\n=====================================\n")