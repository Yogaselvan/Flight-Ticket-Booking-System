import React from 'react';
import '../list/list.css';
import Filter from '../list/listsearch';

const SearchBooking = (filter) => {
  return (
   <>
   {Filter.map((filter)=> (
    <div>
  <div class="route-information">
  <span class="origin">{filter.origin} </span>
  <span class="line"></span>
  <span class="destination">{filter.destination}</span>
</div>

<section class="schedule">
  <div class="schedule-bar">
    <button class="button-left">
      <i class="ion-ios-play"></i>
    </button>
    <ul class="sched-grid">
      <li class="sched-column">
        <div class="sched-card">
          <div class="heading">Sun</div>
          <div class="number">01</div>
          <div class="details">
            <span class="currency">from MAA</span>
            <span class="price">1,866.56</span>
          </div>  
        </div>
      </li>
      
      <li class="sched-column">
        <div class="sched-card">
          <div class="heading">Mon</div>
          <div class="number">02</div>
          <div class="details">
            <span class="currency">from MAA</span>
            <span class="price">1,866.56</span>
          </div>  
        </div>
      </li> 
      
      <li class="sched-column">
        <div class="sched-card">
          <div class="heading">Tue</div>
          <div class="number">03</div>
          <div class="details">
            <span class="currency">from MAA</span>
            <span class="price">1,866.56</span>
          </div>  
        </div>
      </li>      
      
      <li class="sched-column">
        <div class="sched-card">
          <div class="heading">WED</div>
          <div class="number">04</div>
          <div class="details">
            <span class="currency">from MAA</span>
            <span class="price">1,866.56</span>
          </div>  
        </div>
      </li>
      
      <li class="sched-column">
        <div class="sched-card">
          <div class="heading">THU</div>
          <div class="number">05</div>
          <div class="details">
            <span class="currency">from MAA</span>
            <span class="price">1,866.56</span>
          </div>  
        </div>
      </li>
      
      <li class="sched-column">
        <div class="sched-card">
          <div class="heading">FRI</div>
          <div class="number">06</div>
          <div class="details">
            <span class="currency">from MAA</span>
            <span class="price">1,866.56</span>
          </div>  
        </div>
      </li>
      
      <li class="sched-column">
        <div class="sched-card">
          <div class="heading">SAT</div>
          <div class="number">07</div>
          <div class="details">
            <span class="currency">from MAA</span>
            <span class="price">1,866.56</span>
          </div>  
        </div>
      </li>     
    </ul>
    <button class="button-right">
      <i class="ion-ios-play"></i>
    </button>
  </div>
</section>

<div class="plane-ticket-section">
  <div class="table-header">
    <div class="text">From</div>
    <div class="text">To</div>
    <div class="text">Flight</div>
  </div>
  <ul class="flight-list">
    <li class="flight-row">
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.From}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.To}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.flightid}</div>
        <div class="text">{filter.totalseat}</div>
      </div>
    </li>  
    <li class="flight-row">
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.From}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.To}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.flightid}</div>
        <div class="text">{filter.totalseat}</div>
      </div>
    </li>
    <li class="flight-row">
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.From}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.To}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.flightid}</div>
        <div class="text">{filter.totalseat}</div>
      </div>
    </li>
    <li class="flight-row">
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.From}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.To}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.flightid}</div>
        <div class="text">{filter.totalseat}</div>
      </div>
    </li>
    <li class="flight-row">
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.From}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.Flightnum}</div>
        <div class="text">{filter.To}</div>
      </div>
      <div class="body-item">
        <div class="textb">{filter.flightid}</div>
        <div class="text">{filter.totalseat}</div>
      </div>
    </li>
  </ul>
  </div>
  </div>
  ))}
 
</>
  );
}

export default  SearchBooking ;
