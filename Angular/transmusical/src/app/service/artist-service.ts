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
    this.baseUrl = 'http://localhost:8080/Artist';
  }

  public findAll(): Observable<Artist[]>
  {
    return this.http.get<Artist[]>(this.baseUrl + '/getAll');
  }

  public Modify(a:Artist): Observable<Artist>
  {
    return this.http.put<Artist>(this.baseUrl + '/modify',a);
  }

  public Delete(id:number):Observable<number>{
	return this.http.delete<number>(this.baseUrl+"/delete/"+id);
  }
}
