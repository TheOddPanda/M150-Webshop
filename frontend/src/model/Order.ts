import ProductOrder from "./ProductOrder";

export default class {
	public id: number;
	public dateCreated: string;
	public status: string;
	public productOrders: ProductOrder[];

	constructor(id: number, dateCreated: string, status: string, productOrders: []) {
		this.id = id;
		this.dateCreated = dateCreated;
		this.status = status;
		this.productOrders = productOrders;
	}
}