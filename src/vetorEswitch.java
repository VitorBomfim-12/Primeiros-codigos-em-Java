// colocar proteção contra usuário invalido


import java.util.Scanner;
 public class vetorEswitch{
 static final int senhaAdm = 3658;
 static int usuarioSenha=0;
 static int tentativaGeral=0;
 static int usuario=0;
 static final int MAX_TENTATIVAGERAL=3;
 static final int SENHA_MINIMA=1000;
 
 static int[] senhas= new int[100];
 static String[] nomes = new String[100];
		 
 static	Scanner scan = new Scanner (System.in);
 
	public static void main(String[] args) {
	
	    boolean continuar =true;
		int  opcao = 0;
		
		 while(tentativaGeral < MAX_TENTATIVAGERAL && continuar) {
			 
			 opcao = mostrarMenu();
		     switch(opcao) {
		     
		     case 1: 
		    	 if(!criarSenha()) {
		    		 tentativaGeral++;
		    		 
		    	 }
		    	 
		    	 break;
		     case 2:
		    	 
		    	 if(!acessarPerfil()) {
		    		 tentativaGeral++;
		    		 
		    	 }
		    	 break;
		     case 3:
		    	 
		    	 if(!cadastros()) {
		    		 tentativaGeral++;
		    		 
		    	 }
		    	 break;

		     case 4:
		    	 if(!deletarUsuario()) {
		    		 tentativaGeral++;
		    		 
		    	 }
		    	 break;
		     case 5:
		    	 continuar = false;
		    	 break;
		    	 
		    	
		     default:
		    	 System.out.println("Opção inválida");
		    	 break;
		    	 
		     }
		 }
		 scan.close();
		System.out.println("Encerrando programa.");
		
	}
		 
	public static int mostrarMenu(){
		
		System.out.println("===Sistema de senhas===\n escolha a opção desejada: \n 1-Criar Senha \n 2-Acessar usuário \n 3-Mostrar usuarios cadastrados \n 4-Deletar usuário \n 5-Fechar programa  ");
		return scan.nextInt();
		
		
	}
	
	public static boolean criarSenha() {
		int tentativa=0;
		int entrada=0;
	    String nomeEscolhido = null;
	
			
		System.out.println("Insira a senha de administrador:");
		while (tentativa<=4) {
		 entrada = scan.nextInt();
	
			while (true) {
				if(entrada == senhaAdm) {
				System.out.println("Selecione o usuário desejado, de 0-99");
				 usuario=scan.nextInt();
            if (usuario>senhas.length||usuario<=0 || senhas[usuario]>=1000) {
            	System.out.println("Número de usuário inválido ou já cadastrado, delete o usuário ou escolha outro número");
            	continue;
            
            }
				
				while (true) {
				    scan.nextLine();
					System.out.println("Digite o nome desejado para o usuário - " + usuario);
			        nomeEscolhido =scan.nextLine();
					
					System.out.println("Digite a senha desejada *A SENHA DEVE TER NO MÍNIMO 4 DÍGITOS");
					 entrada = scan.nextInt();
						if(entrada == 0 || entrada < SENHA_MINIMA) {
							System.out.println("Senha invalida");
							
						}else {
							System.out.println("Senha definida com sucesso!");
							senhas[usuario] = entrada;
						    nomes[usuario]= nomeEscolhido;
							break;
						
							
							
						}
						
				}
				return true;
				
				
				}else{
				 System.out.println("Senha incorreta, digite novamente");
			    tentativa++;
				}
				break;
			}	
			
				
			
		}
		
		
		System.out.println("Retornando ao menu.");
		return false;
	
		}
		
		
		
	
	
	public static boolean acessarPerfil() {
		int tentativa=0;
		int entrada =0;
		
		System.out.println("Digite o número do usuário");
		usuario=scan.nextInt();	

        while (tentativa <=4) {
		System.out.println("Digite a senha do usuário");
		 entrada = scan.nextInt();

			if (entrada == 0 || usuario>senhas.length || usuario<0) {
				System.out.println("Senha inválida ou numero de usuário inválido");
			    continue;
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
		System.out.println("Retornando ao menu.");
		return false;
		
			
		}
	public static boolean cadastros() {
		int tentativa=0;
		int entrada=0;
		System.out.println("Insira a senha de administrador");
		while (tentativa <=4) {
			entrada = scan.nextInt();
			if(entrada==senhaAdm) {
				for (int i =0; i<senhas.length;i++) {
					if (senhas[i]<=1000) {
						
					}else { 
						System.out.println(nomes[i] +" usuário "+ i +" cadastrado");
					}
					
					
				}
				
				return true;
			}else{
				System.out.println("Senha incorreta, digite novamente");
				tentativa++;
			}
		}
		
	
		return false;
		
		
		
	}	
	public static boolean deletarUsuario() {
		int entrada=0;
		int usuarioDeletado=0;
		int tentativa=0;
		
		
		while(tentativa<=2) {

		System.out.println("Digite a senha de administrador");
		entrada=scan.nextInt();
				
					while(true) {
					if (entrada==senhaAdm) {
						System.out.println("Insira o usuário a ser deletado");
						usuarioDeletado = scan.nextInt();
						
						
						
						System.out.println("Deseja deletar os dados do usuário "+ nomes[usuarioDeletado]+"? - Digite os seguintes números para prosseguir \n 1-Deletar dados do usuário \n 2-Retornar ação \n 3-Retornar ao menu. ");
						entrada=scan.nextInt();
						if (entrada==1) {
							
							senhas[usuarioDeletado]=0;
							nomes[usuarioDeletado]=null;
					   
						return true;	
						}else if (entrada==2) {
							
			            System.out.println("Retornando");
							continue;
						}else if(entrada==3) {
						System.out.println("Retornando ao menu");
							
							
						break;
						}
										}else {
											System.out.println("Senha inválida, digite novamente");
											tentativa++;
											break;
										}
			
			}
			
		
		}
		return false;
	
			
					}
					
	
		
	}