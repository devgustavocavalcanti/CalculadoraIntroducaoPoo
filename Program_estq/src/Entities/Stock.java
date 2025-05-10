package Entities;

public class Stock {

	public double stock;
	public double value;
	public String product;
	
	public Stock (String product, double value, double stock) {
		this.product = product;
		this.value = value;
		this.stock = stock;
		
	}
	public double valueTotal() {
		return stock * value;
	}
	public void addStock (int stock) {
		this.stock	+= stock;
		}
	public void retiredStock(int stock){
		this.stock -= stock;
	}
	public String toString() {
		return product
			+  ", R$"
			+  String.format("%.2f", value)
			+  " , Quantidade: "
			+  stock
			+  " Total: R$"
			+ String.format("%.2f", valueTotal());
	}
}
