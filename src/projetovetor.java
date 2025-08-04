 import java.util.Scanner;
 public class projetovetor {
 static final int senhaAdm = 3658;
 static int usuarioSenha=0;
 static int tentativaGeral=0;
 static int usuario=0;
 static final int MAX_TENTATIVAGERAL=3;
 
 static int[] senhas= new int[10];
		 
 static	Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
	
	
		int  opcao = 0;
		
		 while(tentativaGeral <= MAX_TENTATIVAGERAL ) {
			 
			 opcao = mostrarMenu();
			if( opcao== 1) {
				if(criarSenha() == false) {
					tentativaGeral++;	
				}
			 
		 }else {
			 if(opcao==2) {
			 if (acessarPerfil() == false){
				 tentativaGeral++;
				
			
					
			 }else{ 
				 if (opcao==3) {
				
				System.out.println("Encerrando programa!");
			
				break;
			
			           }else {
			        	   if(opcao==4) {
			           }
			        	   System.out.println("Impossível retornar");
			        	   
			        	   
			           } 
			 
		       }
			 
				
				
			  }
		                    }   
			 break;
		 }
		
	}
		 
	public static int mostrarMenu(){
		
		System.out.println("===Sistema de senhas===\n escolha a opção desejada: \n 1-Criar Senha \n 2-Acessar usuário \n 3-Fechar programa \n 4-Retornar.");
		return scan.nextInt();
		
		
	}
	
	public static boolean criarSenha() {
		int tentativa=0;
		
		while (tentativa<=4) {
		System.out.println("Insira a senha de administrador:");
		int entrada = scan.nextInt();
		if(entrada==4) {
			break;
			
		}else {
			if(entrada == senhaAdm) {
				System.out.println("selecione o usuário desejado, de 0-9");
				 usuario=scan.nextInt();
				
				System.out.println("Digite a senha desejada *A SENHA DEVE TER NO MÍNIMO 4 DÍGITOS");
			    entrada = scan.nextInt();
				if(entrada == 0 || entrada == 4) {
					System.out.println("Senha invalida");
					
				}else {
					System.out.println("Senha definida com sucesso!");
					senhas[usuario] = entrada;
				
					
					return true;
					
					
				}
				
				
				}else{
				 System.out.println("Senha incorreta, digite novamente");
			    tentativa++;
				}
				
			
		}
		
		
		
	
		}
		System.out.println("Retornando ao menu.");
		return false;
		
		
	}
	
	public static boolean acessarPerfil() {
		int tentativa=0;
		while (tentativa <=4) {
		System.out.println("Digite o número do usuário");
		usuario=scan.nextInt();			
		System.out.println("Digite a senha do usuário");
		int entrada = scan.nextInt();
		
		if (entrada==4) {
			
			break;
		}else{
			if (entrada == 0) {
				
				System.out.println("Senha inválida");
			
			}else {
				if (entrada == senhas[usuario]) {
					System.out.println("Usuário acessado com sucesso!");
					entrada=0;
					tentativa=0;
					return true;
					}else {
						System.out.println("Senha incorreta! digite novamente");
						tentativa++;
						
						
					}
				}
		
		}
		
			
		}
		
		System.out.println("Retornando ao menu.");
		return false;
	}


	
}
	

	


