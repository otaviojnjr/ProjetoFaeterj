/*	
    Nome: Avalia��o Pratica

	Institui��o:FACULDADE DE EDUCA��O TECNOL�GIA DO ESTADO DO RIO DE JANEIRO
				FAETERJ - BARRA MANSA 
	Alunos: Ot�vio, Thiago, Matheus, Luan 
	Data: 26/09/22 
	Descri��o: Classe Executavel
*/		
public class FaeterjProjects {

	public static void main(String[] args) {
		
		Projects informProjects = new Projects(1, "Avalia��o Pratica", "Otavio, Thiago, Matheus, Luan");
		System.out.println("IDENTIFICADOR: "+ informProjects.getid());
		System.out.println("TITULO: " + informProjects.gettitle());
		System.out.println("PROPIETARIOS: " + informProjects.getowner());

	}

}
