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

for (let i = 0; i < 50; i++) {      // Cria um array de 50 produtos aleatorios, random = [1,100]
  let random = Math.floor(Math.random() * 100 + 1)
  prod = "Produto" + (random)
  array[i] = new Produto(random, prod, (random) * 2, (random) * 3)
}

function Pesquisa(array = [], nome = "", preco = 0) {       // Pesquisa um produto na loja
  let i = 0
  for (i = 0; i < array.length; i++) {
    if (array[i]._nome === nome) {
      if (array[i]._preco === preco) {
        console.log("O produto |" + nome + "| foi encontrado:");
        array[i].exibirInformacoes()
      }
      else {
        console.log("O produto |" + nome + "| foi encontrado, porém com o \nvalor de R$", array[i]._preco.toFixed(2), "\n")
      }
      i += 100
    }
  }
  if (i <= 100) {
    console.log("*O produto |" + nome + "| não esta registrado na loja*\n")
  }
}

console.log("=============={ Loja }==============\n")

//Pesq..(array,   "nome", preco)
Pesquisa(array, "Produto1", 2)    // Produto possivelmente registrado
Pesquisa(array, "Produto2", 3)    // Preço errado
Pesquisa(array, "Produto3", 6)    // Produto possivelmente registrado
Pesquisa(array, "Produto4", 7)    // Preço errado
Pesquisa(array, "Produto5", 10)   // Produto possivelmente registrado
Pesquisa(array, "Produto6", 11)   // Preço errado
Pesquisa(array, "Produto7", 14)   // Produto possivelmente registrado
Pesquisa(array, "Produto8", 15)   // Preço errado
Pesquisa(array, "Produto9", 18)   // Produto possivelmente registrado
Pesquisa(array, "Produto10", 20)  // Produto possivelmente registrado

// Como o array tem números aleatorios não é possível prever o seu conteudo,
// portanto fiz uma bateria de testes, como vista acima, com possiveis produdos.
//
// Recomendo que, para uma melhor visualização de resultados, execute o codigo
// mais de uma vez.

console.log("=====================================\n")