import React from "react"
import "../contact/contact.css";



const Contact = () => {
  return (
    <>
     <div class="container">
    <div class="content">
      <div class="left-side">
        <div class="address details">
          <i class="fas fa-map-marker-alt"></i>
          <div class="topic">Address</div>
          <div class="text-one">N-9/1, Connaught Place </div>
          <div class="text-two">Delhi - 110001 </div>
        </div>
        <div class="phone details">
          <i class="fas fa-phone-alt"></i>
          <div class="topic">Phone</div>
          <div class="text-one">1800 200 6668</div>
          <div class="text-two">1900 100 6769</div>
        </div>
        <div class="email details">
          <i class="fas fa-envelope"></i>
          <div class="topic">Email</div>
          <div class="text-one">Skcet.Ac.in@gmail.com</div>
          <div class="text-two">Skcet25.Ac.in@gmail.com</div>
        </div>
      </div>
      <div class="right-side">
        <div class="topic-text">Send us a message</div>
        <p>Flight Centre Tours India PVT LTD        </p>
      <form action="#">
        <div class="input-box">
          <input type="text" placeholder="Enter your name"/>
        </div>
        <div class="input-box">
          <input type="text" placeholder="Enter your email"/>
        </div>
        <div class="input-box message-box">
        <input className="vino" type="text" placeholder="Message"/>
        </div>
        <div class="button">
          <input type="button" value="Send Now" />
        </div>
      </form>
    </div>
    </div>
  </div>
    </>
  );
}
export default Contact;