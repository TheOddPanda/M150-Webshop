import Product from "./Product";

export default class {
	public product: Product;
	public quantity: number;

	constructor(product: Product, quantity: number) {
		this.product = product;
		this.quantity = quantity;
	}
}