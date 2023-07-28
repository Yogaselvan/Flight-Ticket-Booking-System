import React from "react"
import "../download/download.css";
import Scan from '../download/Scan.png';
import download from '../download/Down.png';



const Download1 = () => {
  return (
    <>
    <h4 className="vis1">Download Our App</h4>
   <div class="container1">
    <div class="content1">
      <div class="left-side1">
        <div class="address details1">
          <img src={download} style={{marginLeft:-64}}></img>
        </div>
      </div>
      <div class="right-side1">
        <div className="yoga">
       <h5 style={{marginRight:14}}>Access Exclusive Features On The Wego App. Download Today!</h5>
       <br>
       </br>
       <p>More than 10 useful and engaging features available only for app users.</p>
       <br>
       </br>
       <p>
       Explore Page, Popular Destinations, Weekend Getaways, Travel News, etc.
       </p>
       <br>
       </br>
       <p>
       Scan to download
       </p>
       <br>
       </br>
       <div className="scan1">
       <img src={Scan} width={300}></img>
       </div>
       </div>
    </div>
    </div>
  </div>

    </>
  );
}
export default Download1;