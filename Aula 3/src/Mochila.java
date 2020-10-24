
public class Mochila {
	private String cor;
	private int anoFabricacao;
	
	public Mochila() {
		
	}
	
	public Mochila(String c) {
		cor = c;
	}
	
	public Mochila(String c, int anoF) {
		cor = c;
		anoFabricacao = anoF;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		cor = c;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoF) {
		anoFabricacao = anoF;
	}
	
}
