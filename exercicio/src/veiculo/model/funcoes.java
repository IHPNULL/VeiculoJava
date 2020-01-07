package veiculo.model;

public class funcoes {

		private String marca;
		private String modelo;
		private String placa;
		private String cor;
		private Float km;
		private Boolean on;
		private int gas;
		private int vel;
		private Double preco;
		
		
		
		public String getMarca() {
			
			
			return marca;
		}
		public void setMarca(String marca) {
			
			
			this.marca = marca;
		}
		
		
		public String getModelo() {
			
			
			return modelo;
		}
		public void setModelo(String modelo) {
			
			
			this.modelo = modelo;
		}
		
		
		public String getPlaca() {
			
			
			return placa;
		}
		public void setPlaca(String placa) {
			
			
			this.placa = placa;
		}
		
		
		public String getCor() {
			
			
			return cor;
		}
		public void setCor(String cor) {
			
			
			this.cor = cor;
		}
		
		
		public Float getKm() {
			
			
			return km;
		}
		public void setKm(Float km) {
			
			
			this.km = km;
		}
		
		
		public Boolean getOn() {
			
			
			return on;
		}
		public void setOn(Boolean on) {
			
			
			this.on = on;
		}
		
		
		public int getGas() {
			
			
			return gas;
		}
		public void setGas(int gas) {
			
			
			this.gas = gas;
		}
		
		
		public int getVel() {
			
			
			return vel;
		}
		public void setVel(int vel) {
			
			
			this.vel = vel;
		}
		
		
		public Double getPreco() {
			
			
			return preco;
		}
		public void setPreco(Double preco) {
			
			
			this.preco = preco;
		}
	

}










/*
-Marca: String
-Modelo: String
-Placa: String
-Cor : String
-Km: float
-isLigado: boolean
-litrosCombustivel: int
-Velocidade: int
-Preco: Double

+getters / setters
+ acelerar()
+ abastecer()
+ frear()
+ pintar()
+ ligar()
+ desligar()

M�todos:
� Acelerar(): Antes de acelerar, verificar se o carro est� ligado, se
estiver ligado acelera(20 km/h) e consome 1 L de gasolina, se
estiver desligado informa o usu�rio que n�o � poss�vel acelerar
com o carro desligado;
� Abastecer(int qtdLitros): abastece o atributo litrosCombustivel do
objeto, fazer verifica��es para o atributo litrosCombustivel n�o
exceder 100L;
� Frear(): verificar se o ve�culo est� ligado ou n�o, caso ligado e com
velocidade > 0, frear o ve�culo em diminuindo 10km/h de
velocidade do carro.
� Pintar(String cor): substitui a cor do ve�culo;
� Ligar(): Deve ligar o carro, verificando se ele j� n�o se encontra
ligado;
� Desligar(): Deve desligar o ve�culo, caso o ve�culo se encontra
desligado, dever� fazer a valida��o;


*/