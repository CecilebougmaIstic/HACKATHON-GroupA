import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Transmusicale } from '../model/transmusicale';

@Injectable({
  providedIn: 'root'
})
export class TransmusicaleService {

    private baseUrl: string;

  constructor(private http: HttpClient)
  {
    this.baseUrl = 'http://localhost:8080/Transmusicale';
  }

  public findAll(): Observable<Transmusicale[]>
  {
    return this.http.get<Transmusicale[]>(this.baseUrl + '/getTransmusicales');
  }

  public findOne(): Observable<Transmusicale>
  {
    return this.http.get<Transmusicale>(this.baseUrl + '/getTransmusicale');
  }


}
