import { Component, OnInit } from '@angular/core';

import resumeData from "./resume.json";
interface Resume {  
    
  name: String;  
  jobTitle:String;
  about:String;
  contact : {
    email:String;
    location:String;
    github:String;
    mobile:String;
    linkedin:String;

  },
  skills:{
    skill1:String;
    skill2:String;
    skill3:String;
    skill4:String;
    skill5:String;
    skill6:String;
    skill7:String;
    skill8:String;
    skill9:String;
    skill10:String;
   
  }
  languages:{
    lang1:{
      name:String;
      level:String;
    },
    lang2:{
      name:String;
      level:String;
    },
    lang3:{
      name:String;
      level:String;
    }
    lang4:{
      name:String;
      level:String;
    }
  },
  interest:{
    interest1:String;
    interest2:String;
    interest3:String;
    interest4:String;
  
  },
  education:{
    ug:{
      degree:String;
      institute:String;
      startdate:String;
      enddate:String;
      cgpa:String;
    
    },
    hsc:{
      degree:String;
      institute:String;
      startdate:String;
      enddate:String;
      percentage:String;
    }
    sslc:{
      degree:String;
      institute:String;
      startdate:String;
      enddate:String;
      percentage:String;
    }
  },
  
    work:{
      company:String,
      designation:String,
      startdate:String,
      enddate:String,
      
    },
  
  certificates:{
    certificate1:{
        name:String;
        date:String;
    },
    certificate2:{
      name:String;
      date:String;
  }
  certificate3:{
    name:String;
    date:String;
}
},
  projects:{
    project1:{
      title:String,
      desc:String,
      
    },
    project2:{
      title:String,
      desc:String,
    }
  },
 
  achievements:{
    achievement1:{
      name:String;
      description:String;
    }
    achievement2:{
      name:String;
      description:String;
    }
    achievement3:{
      name:String;
      description:String;
    }
    achievement4:{
      name:String;
      description:String;
    }
  },

}
@Component({
  selector: 'app-resume',
  templateUrl: './resume.component.html',
  styleUrls: ['./resume.component.css']
})
export class ResumeComponent implements OnInit {
  resume : Resume = resumeData
  constructor() { }

  ngOnInit(): void {
  }

}




 
