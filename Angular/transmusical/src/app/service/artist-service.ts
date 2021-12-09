import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Artist } from '../model/artist';

@Injectable({
  providedIn: 'root'
})
export class ArtistService {

    private baseUrl: string;

  constructor(private http: HttpClient)
  {
    this.baseUrl = 'http://localhost:8080/api';
  }

  public findAll(): Observable<Artist[]>
  {
    return this.http.get<Artist[]>(this.baseUrl + '/artistes/only');
  }

  public findOne(): Observable<Artist>
  {
    return this.http.get<Artist>(this.baseUrl + '/getconcert');
  }


}
