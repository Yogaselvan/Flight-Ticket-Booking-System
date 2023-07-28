import React, { useState } from 'react';
import '../Home /home1.css';
import Ticket from '../Home /data';
const FlightTicket = (ticket) => {
  return (
      <>
      {Ticket.map((ticket)=> (
<div class="ticket">
  <div id="banner">
  </div>
  <div id="data">
    <div id="maindata">
      <div class="box">
        <span class="header">
          Passenger Name
        </span>
        <span class="body">
          {ticket.name} 
        </span>
      </div>
      <div class="box">
        <span class="header">
          Flight Number
        </span>
        <span class="body">
          AIR4L 5345
        </span>
      </div>
      <div class="box">
        <span class="header">
          From
        </span>
        <span class="body">
          MAA (CHENNAI)
        </span>
      </div>
      <div class="box">
        <span class="header">
          Date
        </span>
        <span class="body">
          11 AUG 2023
        </span>
      </div>
      <div class="box">
        <span class="header">
          To
        </span>
        <span class="body">
          GOI (GOA)
        </span>
      </div>
      <div class="box">
      </div>
      <div class="box">
        <span class="header">
          Gate
        </span>
        <span class="body">
          B-10
        </span>
      </div>
      <div class="box boarding">
        <span class="header">
          Boarding Time
        </span>
        <span class="body">
          12:00
        </span>
      </div>

      <div id="tearoffdata">
        <div class="box">
          <span class="header">
            Passenger Name
          </span>
          <span class="body">
            Mr. Yogaselvan S 
          </span>
        </div>
        <div class="box">
          <span class="header">
            Flight Number
          </span>
          <span class="body">
            AIR4L 5345
          </span>
        </div>
        
        
        <div class="box seat">
          <span class="header">
            Seat
          </span>
          <span class="body">
            <b>01F</b>
          </span>
        </div>
      </div>
    </div>


    <div id="holes">
      <div style={{width:12,height:11,marginTop:17}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      <div style={{width:12,height:11}}></div>
      {/* <div style={{width:12,height:11}}></div> */}
    </div>
  </div>
  </div>
   ))}
  </>
  );
}

export default FlightTicket;
