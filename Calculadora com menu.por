programa {
  funcao inicio() {
    inteiro valor
    real n1, n2
    /* Calculadora com menu*/
    escreva("1-Somar, 2-Subtrair, 3-Multiplicar, 4-Dividir: ")
    leia(valor)
    escreva("Digite dois números: ")
    leia(n1)
    leia(n2)

    se(valor==1) escreva("Resultado: " , n1 + n2)
    senao se(valor==2) escreva("Resultado: ", n1 - n2)
    senao se(valor==3) escreva("Resultado: ", n1 * n2)
    senao se(valor==4){
      se(n2 != 0) escreva("Resultado: ", n1 / n2)
      senao escreva("Erro: Divisão por zero")
    }
    senao escreva("Resultado Invalido")


    
  }
}
