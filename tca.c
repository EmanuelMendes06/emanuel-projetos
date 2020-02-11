#include <stdio.h>
#include <stdio_ext.h>
#include <stdlib.h>
#include <string.h>
#include "gea.h"
#include "biblioteca.h"
#include "ctype.h"
#define CLU 76


typedef struct{
	char *nome;
	char *login;
	char *senha;
	int tipo;

} Usuario;

typedef struct{
	char nome[255];
	char estadio[255];
	char cidade[255];
	char estado[255];

} Clube;

#include "menuadm.h"
#include "cadastro.h"
#include "menuuser.h"

int main(){

	char *senha, *nome, *login;
	int tipo, sair = 1;
	
	Usuario user;

	while(sair!=0) {
		if(verificacao()==1){
			   COR_VERDE
			printf("login: ");
			login = scanfx();
			   COR_VERDE
			printf("senha: ");
			senha = scanfs();
			
			if(verificacaosenha(login, senha, &user)==1){
						COR_AGUA
				printf("\nBEM VINDO ADMIN!!\n");
					__fpurge(stdin);
						getchar();

				menuAdmin();
					int verificacao();
						int verificacaosenha();

			}
			else if(verificacaosenha(login, senha, &user)==2){
					COR_AGUA
				printf("\nBEM VINDO USUÁRIO!!\n");
					__fpurge(stdin);
						getchar();

			menuUser();
			}
			else{
				printf("Login/senha invalidos\n");
					__fpurge(stdin);
						getchar();
			}
		}

		else{
			system("clear");
						 COR_BRANCO
			printf("\t\t\t   CADASTRAR O ADMIN\n");
						 COR_VERMELHO
			printf("\t\t\t⚽---------------------⚽\n\t\t\t|-");
						 COR_VERDE
			printf(" DIGITE O SEU NOME:  ");
						 COR_VERMELHO
			printf("| \n\t\t\t|-");
						 COR_VERDE
			printf(" DIGITE O SEU LOGIN: ");
						 COR_VERMELHO
			printf("| \n\t\t\t|-");
						 COR_VERDE
			printf(" DIGITE SUA SENHA:   ");
						 COR_VERMELHO
			printf("| \n");
						 COR_VERMELHO
			printf("\t\t\t⚽---------------------⚽\n");
			printf("\t\t\t> ");


				COR_BRANCO
			nome = scanfx();
				COR_VERMELHO
			printf("\t\t\t> ");
				COR_BRANCO
			login = scanfx();
				COR_VERMELHO
			printf("\t\t\t> ");
				COR_BRANCO
			senha = scanfs();

			cadastrarUsuario("1",nome, login, senha);
		}
	}

	return 0;
}