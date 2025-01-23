import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ContentService } from '../services/content.service';
import { Hadith } from '../../core/models/hadith.model';

@Component({
  selector: 'app-add-content',
  templateUrl: './add-content.component.html',
  styleUrl: './add-content.component.css'
})
export class AddContentComponent implements OnInit{
  contentForm: FormGroup
  createHadith!: Hadith
  registerSuccessMessage: string = ""
  registerErreurMessage:string = ""
  isError= false
  
  constructor(private router: Router, private contentSrevice: ContentService, private formBuilder: FormBuilder){
    
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
  
  ngOnInit(): void {
    
  }
  
  createContent(){
    this.createHadith.kitab =  this.contentForm.get('kitab')?.value;
    this.createHadith.chapter =  this.contentForm.get('chapter')?.value;
    this.createHadith.name =  this.contentForm.get('hadithName')?.value;
    this.createHadith.isnaad = this.contentForm.get('isnaad')?.value;

    this.createHadith.matn = this.contentForm.get('matn')?.value;
    this.createHadith.takhrij = this.contentForm.get('takhrij')?.value;
    this.createHadith.hamesh = this.contentForm.get('tahkeek')?.value;
  
  this.contentSrevice.createContent(this.createHadith).
  subscribe(()=>{
    this.isError= true
    this.registerSuccessMessage = "Data successfully inserted in the database"
  }, error=>{
    this.isError= false
    this.registerErreurMessage = "Data not saved";
  })
  this.registerSuccessMessage = ""
  this.registerErreurMessage = ""
  }
  
  discard(){
  this.router.navigateByUrl('/book-ar');
  }
  
}
