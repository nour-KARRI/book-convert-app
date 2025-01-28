import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ContentService } from '../services/content.service';

@Component({
  selector: 'app-add-content',
  templateUrl: './add-content.component.html',
  styleUrl: './add-content.component.css'
})
export class AddContentComponent implements OnInit{
  mainForm!: FormGroup
  registerSuccessMessage: string = "Data successfully saved !"
  registerErreurMessage: string = "Data saving failed !!"
  isError= false
  showMessage=false
  
  kitabCtrl!: FormControl;
  chapterCtrl!: FormControl;
  langCtrl!: FormControl;
  nameCtrl!: FormControl;
  isnaadCtrl!: FormControl;
  matnCtrl!: FormControl;
  takhrijCtrl!: FormControl;
  hameshCtrl!: FormControl;
  basamLinkCtrl!: FormControl;
  san3aniLinkCtrl!: FormControl;
  youtubeLinkCtrl!: FormControl;

  constructor(private router: Router, private contentSrevice: ContentService, private formBuilder: FormBuilder){}
  
  ngOnInit(): void {
    this.initFormControls();
    this.initMainForm();
    
  }

  initFormControls() {
    this.kitabCtrl = this.formBuilder.control('', Validators.required)
    this.chapterCtrl = this.formBuilder.control('', Validators.required)
    this.langCtrl = this.formBuilder.control('', Validators.required)
    this.nameCtrl = this.formBuilder.control('', Validators.required)
    this.isnaadCtrl = this.formBuilder.control('', Validators.required)
    this.matnCtrl = this.formBuilder.control('', Validators.required)
    this.takhrijCtrl = this.formBuilder.control('', Validators.required)
    this.hameshCtrl = this.formBuilder.control('', Validators.required)
    this.basamLinkCtrl = this.formBuilder.control('', Validators.required)
    this.san3aniLinkCtrl = this.formBuilder.control('', Validators.required)
    this.youtubeLinkCtrl = this.formBuilder.control('', Validators.required)
  }
  

  initMainForm() {
    this.mainForm = this.formBuilder.group({
      kitab: this.kitabCtrl,
      chapter: this.chapterCtrl,
      lang: this.langCtrl,
      name: this.nameCtrl,
      isnaad: this.isnaadCtrl,
      matn: this.matnCtrl,
      takhrij: this.takhrijCtrl,
      hamesh: this.hameshCtrl,
      basamLink: this.basamLinkCtrl,
      san3aniLink: this.san3aniLinkCtrl,
      youtubeLink: this.youtubeLinkCtrl,
    })
  }
  
  
  onCreateContent(mainForm: FormGroup){
    this.showMessage = true;

    console.log(mainForm.value);
    

    setTimeout(()=>{
      this.showMessage = false
    }, 4000)
  }
  
  onDiscard(){
  this.router.navigateByUrl('/book-ar');
  }
  
}
