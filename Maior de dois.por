programa {
  funcao inicio() {
    /* Leia os dois inteiros e mostre o maior (ou "Iguais").*/
    inteiro n1, n2
    escreva("Informe dois números: ")
    leia(n1)
    leia(n2)
    
    se(n1 > n2){
      escreva(n1 , " > " , n2)
    }
    senao se(n1 < n2){
      escreva(n2 , " > " , n1)
    }
    senao{
      escreva(n1 , " = ", n2)
    }
  }
}
