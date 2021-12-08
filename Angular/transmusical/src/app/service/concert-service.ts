import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Concert } from '../model/concert';

@Injectable({
  providedIn: 'root'
})
export class ConcertService {

    private baseUrl: string;

  constructor(private http: HttpClient)
  {
    this.baseUrl = 'http://localhost:8080/concerts';
  }

  public findAll(): Observable<Concert[]>
  {
    return this.http.get<Concert[]>(this.baseUrl + '/getall');
  }

  public findOne(): Observable<Concert>
  {
    return this.http.get<Concert>(this.baseUrl + '/getconcert');
  }


}
