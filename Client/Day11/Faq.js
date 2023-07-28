import React, { useEffect } from 'react';
import '../FAQ/faq.css';

function CustomerService1() {
  return (
    <>
      <div class="faq-header1">Frequently Asked Questions</div><br>
      </br>

<div class="faq-content">

  <div class="faq-question">
    <input id="q1" type="checkbox" class="panel"/>
    <div class="plus">+</div>
    <label  for="q1" class="panel-title" style={{textAlign:'left' , marginLeft:11 ,marginBottom:1,paddingTop:5}  }>How do I book a flight?</label>
    <div class="panel-content">To book a flight, navigate to our website, select your desired travel dates and destinations, choose a flight from the available options, and proceed to payment</div>
  </div>
  
  <div class="faq-question">
    <input id="q2" type="checkbox" class="panel"/>
    <div class="plus">+</div>
    <label className='yod' for="q2" class="panel-title" style={{textAlign:'left' , marginLeft:11 ,marginBottom:1,paddingTop:5}  }>Can I make changes to my booking?</label>
    <div class="panel-content">Yes, you can make changes to your booking depending on the fare conditions and airline policy. Please contact our customer support for assistance."</div>
  </div>
  
  <div class="faq-question">
    <input id="q3" type="checkbox" class="panel"/>
    <div class="plus">+</div>
    <label className='yod' for="q3" class="panel-title" style={{textAlign:'left' , marginLeft:11 ,marginBottom:1,paddingTop:5}  }>What payment methods are accepted?</label>
    <div class="panel-content">We accept various payment methods, including credit cards, debit cards, and online payment systems. The available options will be displayed during the booking process.</div>
  </div>

  <div class="faq-question">
    <input id="q4" type="checkbox" class="panel"/>
    <div class="plus">+</div>
    <label className='yod' for="q4" class="panel-title" style={{textAlign:'left' , marginLeft:11 ,marginBottom:1,paddingTop:5}  }>Is it possible to cancel my flight?</label>
    <div class="panel-content">Yes, flight cancellations are possible depending on the fare type and airline policy. Please review the cancellation policy and contact our customer support for assistance.</div>
  </div>

  <div class="faq-question">
    <input id="q5" type="checkbox" class="panel"/>
    <div class="plus">+</div>
    <label className='yod' for="q5" class="panel-title" style={{textAlign:'left' , marginLeft:11 ,marginBottom:1,paddingTop:5}  }>Can I select my seat in advance?</label>
    <div class="panel-content">Seat selection options may vary depending on the airline. During the booking process, you will be able to view and select available seats or choose the option to be assigned a seat automatically.</div>
  </div>
</div>
    </>
  );
}

export default CustomerService1;
