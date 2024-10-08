package loja;

import funcoesiphone.appreprodutoraudio.Deezer;
import funcoesiphone.appreprodutoraudio.ReprodutorAudio;
import funcoesiphone.apptelefonico.FuncoesTelefonicas;
import funcoesiphone.apptelefonico.Whatsapp;
import funcoesiphone.navegadoresinternet.NavegadorInternet;
import funcoesiphone.navegadoresinternet.Safari;

public class Iphone {
	public static void main(String[] args) {
		FuncoesTelefonicas funcoesTelefonicas = new Whatsapp();
		funcoesTelefonicas.ligar();
		
		NavegadorInternet navegadorInternet = new Safari();
		navegadorInternet.addNewPage();
		
		ReprodutorAudio reprodutorAudio = new Deezer();
		reprodutorAudio.selecionarMusica();
	}
	
}
