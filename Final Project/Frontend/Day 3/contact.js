import React, { useState } from "react"
import "../contact/contact.css";
import axios from "axios";

const Contact = () => {
  const[name,setname]=useState("");
    const[email,setEmail]=useState("");
    const[description,setdescription]=useState("");
    const handleSubmit = (e) => {
      e.preventDefault(); 
  
      const data = {
        name: name,
        email: email,
        description: description,
      };
  
      axios.post("http://127.0.0.1:8081/addsupport", data)
        .then((response) => {
          alert("Successful"); 
        })
        .catch((error) => {
          console.error("Error:", error);
          alert("Error occurred. Please try again."); 
        });
    };
    const handlename =(e)=>{
        setname(e.target.value);
    }
    const handleemail =(e)=>{
        setEmail(e.target.value);
    }
    const handledes =(e)=>{
        setdescription(e.target.value);
    }

  return (
    <>
    <div className="yo">
    <body className="con">
     <div class="container2">
    <div class="content2">
      <div class="left-side2">
        <div class="address details2">
          <i class="fas fa-map-marker-alt"></i>
          <div class="topic">Address</div>
          <div class="text-one">N-9/1, Connaught Place </div>
          <div class="text-two">Delhi - 110001 </div>
        </div>
        <div class="phone details2">
          <i class="fas fa-phone-alt"></i>
          <div class="topic">Phone</div>
          <div class="text-one">1800 200 6668</div>
          <div class="text-two">1900 100 6769</div>
        </div>
        <div class="email details2">
          <i class="fas fa-envelope"></i>
          <div class="topic">Email</div>
          <div class="text-one">Skcet.Ac.in@gmail.com</div>
          <div class="text-two">Skcet25.Ac.in@gmail.com</div>
        </div>
      </div>
      <div class="right-side2">
        <div class="topic-text">Send us a message</div>
        <p>Flight Centre Tours India PVT LTD        </p>
      <form action="#"onSubmit={handleSubmit} >
        <div class="input-box">
          <input type="text" name="name" placeholder="Enter your name" onChange={handlename}/>
        </div>
        <div class="input-box">
          <input type="text" name="email" placeholder="Enter your email"onChange={handleemail}/>
        </div>
        <div class="input-box message-box">
        <input className="vino" name="message" type="text" placeholder="Message" onChange={handledes}/>
        </div>
        <div class="button" >
          <input type="button" value="Send Now" />
        </div>
      </form>
    </div>
    </div>
  </div> 
  </body>
  </div>
    </>
  );
}
export default Contact;

