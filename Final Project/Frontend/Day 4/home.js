import React, { useState } from "react"
import "../Home /home.css";
import Navbar from "../navbar/nav1";
import Footer from "../Footer/footer";
import Download1 from "../download/download";
import Contact from "../contact/contact";
import Products from "../Trip/trip";

const Main = () => {
    const[search,setsearch] =useState("");
    console.log(search);
  return (
    <>
    <Navbar/>
    
<div class="container5">
<div className="SRI">
        <h1 style={{marginTop:-621 , marginBottom:454 , textAlign:"center",color:"white",width:1050}}>Discover the real value of travel</h1>
    </div>
        <div class="card custom-bg w-75 p-4 d-flex" style={{marginTop:-260 ,boxShadow:15 }}>
            <div class="row">
                <div class="pb-3 h3 text-left">Flight Search &#128747;</div>
            </div>
            <form id="flight-form" onsubmit="return validateForm()">
                <div class="row">
                    <div class="form-group col-md align-items-start flex-column">
                        <label for="origin" class="d-inline-flex">From</label>
                        <input type="text" placeholder="City or Airport" class="form-control" id="origin" name="origin"
                        onChange={(e)=>setsearch(e.target.value)}
                            required/>
                    </div>
                    <div class="form-group col-md align-items-start flex-column">
                        <label for="depart" class="d-inline-flex">To</label>
                        <input type="text" placeholder="City or Airport" class="form-control" id="depart" name="depart"
                            required/>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md align-items-start flex-column">
                        <label for="departure-date" class=" d-inline-flex">Depart</label>
                        <input type="date" class="form-control" id="departure-date" name="departure-date"
                            onkeydown="return false" required/>
                    </div>
                    <div class="form-group col-md align-items-start flex-column">
                        <label for="departure-date" class=" d-inline-flex">Return</label>
                        <input type="date" class="form-control" id="departure-date" name="departure-date"
                            onkeydown="return false"/>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-lg-3 align-items-start flex-column">
                        <label for="adults" class="d-inline-flex col-auto">Adults <span class="sublabel">less than 3
                            </span></label>
                        <select class="form-select" id="adults"
                            onchange="javascript: dynamicDropDown(this.options[this.selectedIndex].value);">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                        </select>
                    </div>
                    <div class="form-group col-lg-3 align-items-start flex-column">
                        <label for="children" class="d-inline-flex col-auto">Children <span class="sublabel"> less than 2
                            </span></label>
                        <select class="form-select" id="children">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                        </select>
                    </div>
                    <div class="form-group col-lg-3 align-items-start flex-column">
                        <label for="infants" class="d-inline-flex col-auto">Infants <span class="sublabel"> less than
                                2</span></label>
                        <select class="form-select" id="infants">
                            <option value="0">0</option>
                            <option value="1">1</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-lg-6 align-items-start flex-column">
                        <label for="cabin" class="d-inline-flex">Cabin</label>
                        <select class="form-select" id="cabin">
                            <option value="ECONOMY">Economy</option>
                            <option value="PREMIUM_ECONOMY">Premium Economy</option>
                            <option value="BUSINESS">Business</option>
                            <option value="FIRST">First</option>
                        </select>
                    </div>
                    {/* <div class="form-group col-lg-6 align-items-start flex-column pt-lg-4">
                        <div class="form-check form-switch">
                            <input className="srik"  type="checkbox" id="directFlights"/>
                            <label class="form-check-label d-inline-flex align-self-center" for="directFlights" style={{marginLeft:52}}>Direct
                                flights</label>
                        </div>
                    </div> */}
                </div>
                <div class="row">
                    <div class="text-left col-auto">
                        <button  type="submit" class="btn btn-primary" onClick={(e)=>setsearch(e.target.value)}><a data-toggle="tab" href="/search" style={{color:"black"}}>Search flights</a></button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <Products/>
    <Download1/>
    <Contact/>
    <Footer/>
</>
  );
}
export default Main;