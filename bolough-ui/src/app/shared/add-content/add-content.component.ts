import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ChapterRequestPayload } from './content.request.payload';
import { ContentService } from '../services/content.service';

@Component({
  selector: 'app-add-content',
  templateUrl: './add-content.component.html',
  styleUrl: './add-content.component.css'
})
export class AddContentComponent implements OnInit{
  contentForm: FormGroup
  contentPayload: ChapterRequestPayload
  registerSuccessMessage: string
  registerErreurMessage:string
  isError= false
  
  constructor(private router: Router, private contentSrevice: ContentService){
  
    this.contentPayload = {
      kitab:"",
      chapter: "",
      hadithName:"",
      isnaad:"",
      matn: "",
      takhrij: "",
      tahkeek: "",
    }
    this.registerSuccessMessage = ""
    this.registerErreurMessage = ""
    
    this.contentForm = new FormGroup({
      kitab: new FormControl('', Validators.required),
      chapter: new FormControl('', Validators.required),
      hadithName: new FormControl('', Validators.required),
      isnaad: new FormControl('', Validators.required),
      matn: new FormControl('', Validators.required),
      takhrij: new FormControl('', Validators.required),
      tahkeek: new FormControl('', Validators.required)
    })
  }
  
  ngOnInit(): void {}
  
  createContent(){
    this.contentPayload.kitab =  this.contentForm.get('kitab')?.value;
    this.contentPayload.chapter =  this.contentForm.get('chapter')?.value;
    this.contentPayload.hadithName =  this.contentForm.get('hadithName')?.value;
    this.contentPayload.isnaad = this.contentForm.get('isnaad')?.value;

    this.contentPayload.matn = this.contentForm.get('matn')?.value;
    this.contentPayload.takhrij = this.contentForm.get('takhrij')?.value;
    this.contentPayload.tahkeek = this.contentForm.get('tahkeek')?.value;
  
  this.contentSrevice.createContent(this.contentPayload).
  subscribe(()=>{
    this.isError= true
    this.registerSuccessMessage = "Data successfully inserted in the database"
  }, error=>{
    this.isError= false
    this.registerErreurMessage = "Data not saved";
  })
  }
  
  discard(){
  this.router.navigateByUrl('/book-ar');
  }
  
}
