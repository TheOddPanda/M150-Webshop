export default class {
	public id: number;
	public name: string;
	public price: number;
	public pictureUrl: string;

	constructor(id: number, name: string, price: number, pictureUrl: string) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.pictureUrl = pictureUrl;
	}
}