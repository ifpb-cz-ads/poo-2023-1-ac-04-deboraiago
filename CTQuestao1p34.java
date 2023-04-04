import java.util.Scanner;

public class CTQuestao1p34 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int Idade;
        System.out.println("qual a sua idade ?");
        Idade = Scan.nextInt();
        if (Idade < 16) {
            System.out.println("menor que 16 anos nao pode votar;");
        }
         else if (Idade >= 16 && Idade <= 17){
                System.out.println("O seu voto é facultativo.");
         }
          else if (Idade >= 18 && Idade <= 65){
                    System.out.println("O seu voto é obrigatorio.");
          }
          else 

           System.out.println("Voce já compriu sua obrigação com o Brasil, Seu voto é facultativo");
        } 
            }
    

