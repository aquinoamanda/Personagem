public class Lily {
	private String tipoDeNecrotico;
	private String tipoSanguineo;
	private String corDoOlho;
	private String agilidade;
	private int forca;
	private int vida;
	
	public Lily (String tipoDeNecrotico, String tipoSanguineo, String corDoOlho, int forca, String agilidade) {
		this.tipoDeNecrotico = tipoDeNecrotico;
		this.tipoSanguineo = tipoSanguineo;
		this.corDoOlho = corDoOlho;
		this.forca = forca;
		this.agilidade = agilidade;
	}
	
	public void atacar() {
		int dano = this.forca;
		System.out.println("Lily atacou, causando" + dano + "de dano");
	}
		
	public void receberDano(int dano) {
		this.vida = this.vida - dano;
				if (this.vida <= 0)
		System.out.println("Você a derrotou!");
		else {
			System.out.println("Lily recebeu" + dano + "de dano");
		}
	}
		
	public String getTipoDeNecrotico() {
		return tipoDeNecrotico;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public String getCorDoOlho() {
		return corDoOlho;
	}
	public String getAgilidade() {
		return agilidade;
	}
	public int getForca() {
		return forca;
	}
	public int getVida() {
		return vida;
	}
	public void setCorDoOlho(String novaCorDoOlho) {
		this.corDoOlho = novaCorDoOlho;
	}
	public void setAgilidade(String novaAgilidade) {
		this.agilidade = novaAgilidade;
	}
	public void setForca(int novaForca) {
		this.forca = novaForca;
	}
	public void setVida(int novaVida) {
		this.vida = novaVida;
	}
}
