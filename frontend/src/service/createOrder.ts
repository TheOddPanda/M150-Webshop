import * as request from "superagent";
import {BASE_URL} from "../Config";
import ProductOrder from "../model/ProductOrder";

export default (
	productOrders: ProductOrder[],
	callback: () => void,
	errorCallback: (err?: any) => void
) => {
	request.get(BASE_URL + "/api/order").then(
		() => callback(),
		errorCallback
	);
}