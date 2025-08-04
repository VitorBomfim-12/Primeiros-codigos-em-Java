

//Colocar funções (codigo muito aninhado)
//mudar nomes das variáveis para nomes mais descritivos

import java.util.Scanner;
public class senha {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
	
		int senhadm = 3658, usuariopassword=0 ,close=0, tentativa1 = 0,tentativa2=0, menu=1, opcao = 0,passattempt=0 ;
		
        while (menu==1) {
        	while(close<2) {
        		
        		
		System.out.println("Bem vindo ao sistema experimental de senhas! \n 1-Criar senha \n 2-Acessar perfil \n 3-Fechar programa ou retornar.");
		 opcao = scan.nextInt();
		 
		 if(opcao == 1 || opcao ==2 || opcao == 3) {
	  
	     
	     while (opcao == 1 ) {
				
				if(tentativa1 >= 4) {
					System.out.println("Numero de tentativas excedido, reiniciando o programa!\n");
					opcao = 0;
					tentativa1 = 0;
					close++;
				
					
				                  }else {
					System.out.println("Digite a senha de admininstrador:");
					passattempt  = scan.nextInt();
					
					if(passattempt == 3) {
						System.out.println("Retornando\n");
						menu=1;
						opcao=0;
						
					}else {
						if( passattempt != 3658 ) {
							System.out.println("Senha incorreta!");
								tentativa1++;
								
						                  }else {
						                	  
						                  System.out.println("Digite a senha para o perfil 1:");
						                  usuariopassword = scan.nextInt();
						                  if (usuariopassword==0) {
						                	  System.out.println("senha inválida");
						                	  
						                	  
						                  }else {
						                  System.out.println("Senha definida com sucesso! retornando ao menu!\n");
						                  opcao =0;
						        
						                  tentativa1 = 0;
						                       }
						                        }
					}
					
					                     }
		                    }

	     while (opcao==2) {
	    	 
	    	 if(tentativa2 <=4) {
	    		 
	    	 System.out.println("Digite a senha para o usuário:");
	    	 passattempt  = scan.nextInt();
	    	 
	    	 if(passattempt == 3) {
	    		 System.out.println("Retornando\n");
					menu=1;
					opcao=0;
	    		 
	    	 }else{
	    		 
	    		 if(passattempt == 0 ) {
		    		 
		    		 System.out.println("Senha inválida");
		    		 
		    	 }else {
		    	 
		    	 
		    	 
		    	 if(passattempt == usuariopassword) {
		    		 
		    		 System.out.println("Usuário acessado!\n");
		    		 tentativa2=0;
		    		 opcao=0;
		    		 
		    		 
		    	 }else {
		    		 
		    		 System.out.println("Senha incorreta!");
		    		 tentativa2++;
		    		 
		    	      }
		    	      }
	    	      }
	    	 
	    		 
	    	       }else {
	    	 System.out.println("Número maximo de tentativas alcançado, reiniciando programa\n");
    		 tentativa2=0;
    		 opcao=0;
    		 menu=1;
	                     }
	                   }
	     if(opcao == 3) {
	  
	    	 menu=0;
	    	 opcao=0;
	    	 close=3;
	    	 
	    	 
	                    }
                            }else{
			                           System.out.println("opção inválida, digite novamente!\n");
			                           
			 
		                                      }
                         }
        
        	System.out.println("Programa encerrado");
        	menu=0;
        	opcao=0;
        	scan.close();
		
		                                    }
		                                    	
		                                    }
	}



