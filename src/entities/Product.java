package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	// O método estático acessa o atributo do que eu passar como argumento.
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}
	
	// O método não estático acessa diretamente o atributo da instância.
	public boolean nonStaticProductPredicate() {
		return price >= 100.00;
	} 

	@Override
	public String toString() {
		return name + " - " + String.format("%.2f", price);
	}	
}
