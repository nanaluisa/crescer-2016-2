public class CestoDeLembas{
        /*Exercício 2   Lembas (não contém glúten)
       Todos gostam de Lembas. Hobbits gostam de Lembas, elfos gostam de Lembas, até os balrogs gostam de Lembas. 
        
        Crie uma classe CestoDeLembas que receba o número de lembas e possibilite aos seus objetos retornarem true 
        quando a quantidade de pães pode ser dividida entre dois personagens de uma forma que cada um fique com uma 
        quantidade par de lembas, desde que 1 <= n <= 100 e retorne false caso contrário. 
        Ex:
        CestoDeLembas doisSemGluten = new CestoDeLembas(2);
        doisSemGluten.podeDividirEmPares(); // deve retornar false, pois 2 = 1 + 1
        CestoDeLembras seisSemGluten = new CestoDeLembas(6);
        seisSemGluten.podeDividirEmPares(); // true, pois 6 = 2 + 4
      */
      private int quantLembas;
      private int p1, p2; 
      
      public CestoDeLembas(int quantLembas){
          this.quantLembas = quantLembas; 
      }
      
      public int getP1(){
          return p1;
      }
      
      public int getP2(){
          return p2;
      }
                 
      public boolean podeDividirEmPares(){
          int div = 0;
          //verificando se está dentro do limite e se a quant. é par!
          if(quantLembas >= 1 && quantLembas <= 100 && quantLembas%2 == 0){
              div = quantLembas /2;
              if(div % 2 != 0){  //aqui é o caso de serem 6,10,14 pães! 
                  p1 = div -1;
                  p2 = div +1;
                  if(p1%2 == 0  && p2%2 == 0 && p1!=0 && p2!=0){ //aqui é o caso de serem 2 lembas dar false!
                      return true;                    
                  }
                  return false;
              }else{
                  //aqui é o caso de serem 4,8,12 pães!
                  p1 = div;
                  p2 = div;
                  return true;
              }
          }
          return false;
          
      }
      

}