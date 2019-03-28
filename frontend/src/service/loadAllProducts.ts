import * as request from "superagent";
import {BASE_URL} from "../Config";
import Product from "../model/Product";

export default (
	callback: (res: Product[]) => void,
	errorCallback: (err?: any) => void
) => {
	request.get(BASE_URL + "/api/products").then(
		({body}) => callback(body),
		errorCallback
	);
}