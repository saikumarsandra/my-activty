import { Component, OnInit } from '@angular/core';
import { media } from '../model/media.model';

@Component({
  selector: 'media',
  templateUrl: './media.component.html',
  styleUrls: ['./media.component.css']
})
export class MediaComponent implements OnInit {

mediadetail:Array<media>;
  constructor() {
    this.mediadetail = [
      new media("sunrise","morning rise" , "nature", "first"),
      new media("birds","morning rise" , "nature", "second"),
      new media(" sea ","morning rise" , "nature", "third")
    ];

   }
   savemedia(  txttitle: HTMLInputElement, txtdescription: HTMLInputElement,txttag: HTMLInputElement, txtfilename: HTMLInputElement):void{
    
    let medias = new media (txttitle.value, txtdescription.value, txttag.value,txtfilename.value);
    // add that object to larray
    this.mediadetail.push(medias);

    // reset the form
    txttitle.value = "";
    txtdescription.value = "";
    txttag.value = "";
    txtfilename.value="";
}


  ngOnInit() {
  }

}
