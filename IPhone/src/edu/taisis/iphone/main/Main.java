package edu.taisis.iphone.main;

import edu.taisis.iphone.DispositivoMobile;
import edu.taisis.iphone.internet.Navegacao;
import edu.taisis.iphone.internet.NavegadorInternet;
import edu.taisis.iphone.midia.Reprodutor;
import edu.taisis.iphone.midia.ReprodutorMusical;
import edu.taisis.iphone.telefone.Telefonia;
import edu.taisis.iphone.telefone.TelefoniaMovel;

public class Main {

	public static void main(String[] args) {
	
		DispositivoMobile dp = new DispositivoMobile();
		dp.adicionarNovaAba();
		dp.atender();
		dp.selecionarMusica();
		
		
		Navegacao nv = new NavegadorInternet();
		nv.exibirPagina();
		
		
		TelefoniaMovel tel = new Telefonia();
		tel.iniciarCorrerioVoz();
		
		
		Reprodutor rep = new ReprodutorMusical();
		rep.tocar();

	}

}
