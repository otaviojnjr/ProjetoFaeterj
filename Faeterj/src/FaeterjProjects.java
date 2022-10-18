/*	
    Nome: Avaliação Pratica

	Instituição:FACULDADE DE EDUCAÇÃO TECNOLÓGIA DO ESTADO DO RIO DE JANEIRO
				FAETERJ - BARRA MANSA 
	Alunos: Otávio, Thiago, Matheus, Luan 
	Data: 26/09/22 
	Descrição: Classe Executavel
*/		
public class FaeterjProjects {

	public static void main(String[] args) {
		
		Projects informProjects = new Projects(1, "Avaliação Pratica", "Otavio, Thiago, Matheus, Luan");
		System.out.println("IDENTIFICADOR: "+ informProjects.getid());
		System.out.println("TITULO: " + informProjects.gettitle());
		System.out.println("PROPIETARIOS: " + informProjects.getowner());

	}

}
