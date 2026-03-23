programa {
  funcao inicio() {
    /*Programa que lê um número e mostra se é PAR ou IMPAR*/
    real numero 
    escreva("Informe um número ")
    leia(numero)

    se(numero % 2 == 0){
      escreva("Este numero é par ou impar: ")
      escreva(numero , " é PAR!")
    }
  senao{
    escreva("Este número é par ou impar: ")
    escreva(numero , " é IMPAR!")
  }
  }
}
