import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RickmortyapiService {

  id1:number = 0;
  id2:number = 0;
  id3:number = 0;
  id4:number = 0;
  id5:number = 0;
  id6:number = 0;
  id7:number = 0;
  id8:number = 0;
  url:string = '';
  baseurl:string = 'https://fakeapicrudtsystems.herokuapp.com';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  get_api_results() {
    this.url = '';

    this.url = this.baseurl + '/characters'
        
    return this.http.get(this.url);
  }

  get_x_api_results(id: number) {
    this.url = '';

    this.url = this.baseurl + '/characters/'
    
    this.url += id.toString();

    return this.http.get(this.url);
  }

  post_character(character:any) {
    this.url = 'http://';
    
    this.url = this.baseurl + '/characters'

    return this.http.post(this.url, JSON.stringify(character), { headers: { 'Content-Type': 'application/json'}});
  }

  put_character(character:any, id:number) {
    this.url = 'http://';
    
    this.url = this.baseurl + '/characters/' + id.toString();
  
    return this.http.put(this.url, JSON.stringify(character), { headers: { 'Content-Type': 'application/json'}});
  }

  remove_character(id: number) {
    this.url = 'http://';
    
    this.url = this.baseurl + '/characters/' + id.toString()
  
    return this.http.delete(this.url);
  }
}
