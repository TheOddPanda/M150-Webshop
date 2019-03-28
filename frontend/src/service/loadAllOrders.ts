import Order from "../model/Order";
import * as request from "superagent";
import {BASE_URL} from "../Config";

export default (
	callback: (order: Order) => void,
	errorCallback: (err?: any) => void
) => {
	request.get(BASE_URL + "/api/order").then(
		({body}) => callback(body),
		errorCallback
	);
}