package projeto2;

public class ads {
   
 public int n1 = 6;
   public int n2  = 8;
   public String turno = "manha";
   public int nota;

  public void soma() {
    System.out.println(n1  +  n2);
}

 
 
  public void resultado () {
nota = 9;
if (nota >= 7) {
System.out.println("aluno aprovado");
} else {
System.out.println("aluno em recuperação");
}
 
 
 
 }
 
 
   public static void main(String[] args) {
  ads teste;
  teste = new ads();
  teste.soma();
  teste.resultado();

 }
} 