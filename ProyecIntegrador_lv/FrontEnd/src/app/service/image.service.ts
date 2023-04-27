import { Injectable } from '@angular/core';
import{ Storage, getDownloadURL, list, ref, uploadBytes} from '@angular/fire/storage';
@Injectable({
  providedIn: 'root'
})
export class ImageService {
url:string="";
  constructor(private storage: Storage) { }

  uploadImage($event:any, name:string){
    const file=$event.target.files[0]
    const  imgRef= ref(this.storage, `imagen/`+ name )
    uploadBytes(imgRef,file)
    .then(response=>{this.getImage()})
    .catch(error=>console.log(error))
  }
  getImage(){
    const imageRef= ref(this.storage,`imagen/`)
    list(imageRef)
    .then(async reponse =>{
      for(let item of reponse.items){
        this.url= await getDownloadURL(item);
        console.log("La url es: "+this.url);
      }
    })
    .catch(error=>console.log(error));
  }
}
