package Main;

public class Main {

public static void main(String[] args) {
        
   
    Empresa Foto = new Empresa("Fotografia", null);
    

    Funcionario luiz = new Funcionario("Luiz Ferreira", null, 1.500, Foto);
    

    Funcionario igor = new Funcionario("Igor Silva", null,  1.200, Foto);


Funcionario layla = new Funcionario("Layla Vieira", null,  1.700, Foto);
 

System.out.println(luiz.getNome());
  
 System.out.println(luiz.getSalario());
   
 System.out.println(luiz.getEmpresa().getNome());
    
    System.out.println("*** \n");
     
    System.out.println(igor.getNome());
   
 System.out.println(igor.getSalario());
  
  System.out.println(igor.getEmpresa().getNome() + "\n");

System.out.println("*** \n");

    System.out.println(layla.getNome());
    System.out.println(layla.getSalario());
    System.out.println(layla.getEmpresa().getNome() + "\n") ;  
    
  
  Foto.adicionafuncionario(luiz);
    Foto.adicionafuncionario(igor);

Foto.adicionafuncionario(layla);


    for(Funcionario Foto.getFuncionarios()){
   
     System.out.println(f.getNome());
    }
}
    
}