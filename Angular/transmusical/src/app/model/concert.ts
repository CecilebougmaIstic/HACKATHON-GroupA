export class Concert {
	fields:{
		city:string;
		spotify:string;
		artist:string;
		room:string;
		deezer:number;
		edition:string;
		firstdate:string;
		country:string;
	};
	date:string;
	geometry:{
		type:string;
		coordinates:{
			longitude:number;
			latitude:number;
		};
	};
	price:number;
}