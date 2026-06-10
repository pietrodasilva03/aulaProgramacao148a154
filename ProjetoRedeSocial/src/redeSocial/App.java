package redeSocial;

public class App {
	public static void main(String[] args) {
       
		mesagemPrivada mensagem1 = new mesagemPrivada();
		
		Postagem post1 = new Postagem();

        Usuario usuario1 = new Usuario();
        
        quantidadeMembros mostrar1 = new quantidadeMembros();
        
        

      usuario1.nome = "Ana";
      usuario1.idade = 17;
      usuario1.cidade = "Valença";
        
      post1.texto = "Estudando Java!!";
      post1.curtidas = 15;
      post1.autor = "Ana";
      
      mensagem1.texto = "Oi,tudo bem?";
      mensagem1.nome = "Carlos";
      
      mostrar1.NomedoGrupo = "Amigos do Java";
      mostrar1.quantidadeMembros = 28;
      
        
 

        usuario1.mostrarPerfil();
        post1.mostrarPostagem();
        mensagem1.MostrarMensagemPrivada();
        mostrar1.mostrarGrupo();
    
    
	  
	
}
}