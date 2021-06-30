import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
	providedIn: 'root'
})

// Service pour le model Gamer
export class GamerService {

	constructor(private http: HttpClient) { }

	rootURL = '/api';

	getGamers() {
		return this.http.get(this.rootURL + '/gamers');
	}

	addGamer(gamer: any, id: number) {
		gamer.id = id;
		return this.http.post(this.rootURL + '/gamer', gamer);
	}
}